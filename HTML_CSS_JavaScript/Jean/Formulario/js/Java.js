$(document).ready(function () {
    const form = $(".Formulario")[0];
    let fecha;
    // ------------------Usando la funcion que se hizo llamada calcularfecha que determina las cuotaspendientes
    $("#fechaprestamo").change((e) => {
        fecha = $(e.target).val();
        calcularfecha(fecha)
            .then(result => {
                $("#cuotapendiente").val(result.cuotapendiente);
            }).catch(err => {
                console.error("Error al calcular", err);
            });
    });

    // ------------------Hacemos los calculos previos y el resultado se establece en el total a pagar
    $("#ValorPrestadoText").keyup((e) => {
        let interesval = parseInt($("#InteresText").val());
        let cuotapend = parseInt($("#cuotapendiente").val());
        let obtenervalorprestado = parseInt($(e.target).val());
        let suma = (obtenervalorprestado + obtenervalorprestado * interesval / 100 * cuotapend);
        $("#TotalAPagar").val(parseInt(suma));
    });

    // ------------------Darle funcion al boton guardar  
    $("#BtnGuardar").click((e) => {
        Swal.fire({
            icon: "success",
            title: "Datos Guardados.",
            showConfirmButton: false,
            timer: 1500,
        }).then(() => {
            let cuota_guardar = $('#Cuota').val();
            let cuotapendiente_guardar = $('#cuotapendiente').val();

            if (cuota_guardar > cuotapendiente_guardar) {
                cuotapendiente_guardar = 0;
                $('#cuotapendiente').val(cuotapendiente_guardar);
            } else {
                cuotapendiente_guardar = cuotapendiente_guardar - cuota_guardar;
                $('#cuotapendiente').val(cuotapendiente_guardar);
            }
            $('#TotalAPagar').val($('#Prestamo').val());
            $("#PagoModal").modal("hide");
            let modal = $("#PagoModal").find("input");
            modal.each(function () {
                $(this).val("");
            });
        });
    });

    // ------------------Darle funcion al boton cerrar
    $("#BtnCerrar").click((e) => {
        let modal = $("#PagoModal").find("input");
        modal.each(function () {
            $(this).val("");
        });
    });

    // ------------------Se hace todo el calculo referente a las fechas para determinar la cuotapendiente
    function calcularfecha(fecha) {
        return new Promise((resolve, reject) => {
            let fecha_pres = new Date(fecha);
            let fechaActual = new Date();

            let difAnios = fechaActual.getFullYear() - fecha_pres.getFullYear();
            let difMes = fechaActual.getMonth() - fecha_pres.getMonth();
            let difdia = fechaActual.getDate() - fecha_pres.getDate();

            if (difdia <= 0) {
                difMes -= 1;
            }
            let pendiente = (difAnios * 12) + difMes;
            if (pendiente === 0) {
                pendiente = 1;
            }
            resolve({
                cuotapendiente: pendiente
            });
            reject("El calculo de la cuota pendiente es invalida.");
        });
    }

    // ------------------Se realiza una condicion que valide si los campos estan llenos, en caso de que si lo esten el usuario tendra acesso al siguiente panel, de lo contrario, no
    $(`#PagoModal`).on("show.bs.modal", (e) => {

        //------------------ Se declaran las variables
        const form = $(".Formulario")[0];
        let intereses = parseFloat($("#InteresText").val());
        let valorprestado = parseFloat($("#ValorPrestadoText").val());
        let cuotaspendientes = parseFloat($("#cuotapendiente").val());
        let totalapagar = parseInt($("#TotalAPagar").val());

        if (!form.checkValidity()) {
            e.preventDefault()
            e.stopPropagation()
            form.classList.add("was-validated")

            Swal.fire({
                icon: "error",
                title: "Oops...",
                text: "Debes llenar los campos!",
            });

            return;
        }else{
            let deuda_act;

            if ((valorprestado < totalapagar) && cuotaspendientes !== 0) {
                deuda_act = valorprestado;
            } else {
                deuda_act = totalapagar;
            }

            let valor_del_interes = parseFloat(deuda_act * parseFloat(intereses)) / 100;
            let deuda = totalapagar; 

            $('#TotalAPagar').val() !== '' ? deuda = $('#TotalAPagar').val() : deuda = $("#ValorPrestadoText").val();
            $('#ValorPrestado').val(totalapagar);
            $('#Interes').val(intereses);

            $('#ValorPagado').keyup((event) => {
                let pago = $(event.target).val();
                calcularPago(pago, deuda, valor_del_interes, cuotaspendientes). //para colocar una promesa
                    then(resultado => {
                        $('#Cuota').val(resultado.ResultadoNumeroDeCuotas);
                        $('#InteresesValor').val(resultado.ResultadoValorDelInteres);
                        $('#PagoCapital').val(resultado.ResultadoPagoCapital);
                        $('#Prestamo').val(resultado.ResultadoValorActual);

                    }).catch(error => {
                        console.error("Error de calculo.", error);
                    });
            });

        }
    });

    // ------------------Se hace una funcion la cual hace los calculos necesarios matematicos necesarios
    function calcularPago(pag, deud, valorint, pendi) {
        return new Promise((resolve, reject) => {
            let cuota = (pag / valorint).toFixed(1);
            let val_act;
            let valdelinteres;

            if (pendi !== 0 && cuota <= pendi) {

                valdelinteres = parseFloat(cuota) * valorint;
                val_act = deud - valdelinteres;
            } else {
                valdelinteres = parseFloat(pendi) * valorint;
                val_act = deud - pag;
            }

            let pagocapi = pag - valdelinteres;

            if (cuota >= 0) {
                resolve({
                    ResultadoNumeroDeCuotas: Number(cuota),
                    ResultadoValorDelInteres: Number(valdelinteres),
                    ResultadoPagoCapital: Number(pagocapi),
                    ResultadoValorActual: Number(val_act)
                });

            } else {
                reject("No se pudo realizar el calculo.");
            }

        });
    }
        
});