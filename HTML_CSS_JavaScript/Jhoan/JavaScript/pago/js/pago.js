
$(document).ready(function () {
    const form = $(".fila")[0];
    let fecha;

    $("#inputdate").change((e) => {
        fecha = $(e.target).val();
        calcularfecha(fecha)
            .then(result => {
                $("#inputcuota").val(result.Cuotapendiente);
            }).catch(err => {

                console.error("Error al calcular", err);
            });
    });

    $('#pagoModal').on("show.bs.modal", (e) => {

        if (!form.checkValidity()) {
            e.preventDefault()
            e.stopPropagation()
            form.classList.add("was-validated")

            Swal.fire({
                icon: "error",
                title: "Oops...",
                text: "Something went wrong!",
                footer: '<a href="#">Why do I have this issue?</a>'
            });


        } else {
            let deuda;
            $("#inputotalpa").val() !== "" ? deuda = $("#inputotalpa").val() : deuda = $("#inputvalorpres").val();
            $("#valorprestado").val(deuda);
            let interes = $("#inputinteres").val();
            let suma = (deuda + deuda * interes / 100 * $("#inputcuota"));
            // $("#valorprestado").val(suma);
            $("#interes").val(interes);
            $("#Valor_pagado").keyup((e) => {
                let pago = $(e.target).val();
                calcularPago(interes, deuda, pago)
                    .then(resultado => {

                        $("#Cuota").val(resultado.numCuota);
                        $("#Valor_Interes").val(resultado.intevalor);
                        $("#Pago_capi").val(resultado.pagocapi);
                        $("#Valor_pres").val(resultado.actualpres);

                    }).catch(Error => {
                        console.error("Error", error);
                    });
            });

        }

    });

    $('#inputvalorpres').keyup((e) => {
        let val_pres = parseInt($(e.target).val());
        let val_inte = parseInt($('#inputinteres').val());
        let cuota_pe = parseInt($('#inputcuota').val());
        const total = (val_pres + val_pres * val_inte / 100 * cuota_pe);

        $('#inputotalpa').val(total);
    });

    function calcularPago(i, d, valInteres, p) {
        return new Promise((resolve, reject) => {
            // let valInteres = d / parseFloat(i)
            let cuota = (p / valInteres).toFixed(1);
            let valActual;
            if (cuota >= 1) {
                let valor_interes = ($("#Valor_pagado").val() / cuota) * $("#inputcuota").val();
                let paago_capi = $("#Valor_pagado").val() - $("#Valor_Interes").val();
                let pres_actu = $("#inputvalorpres").val() - paago_capi;

                resolve({
                    numCuota: Number(cuota),
                    intevalor: Number(valor_interes),
                    pagocapi: Number(paago_capi),
                    actualpres: Number(pres_actu)
                });
            } else {
                reject("El calculo de la cuota es invalido.");
            }
        });



    }
    // boton para guardar todos los datos
    $("#botonguar").click((e) => {

        Swal.fire({
            position: "text-center",
            icon: "success",
            title: "Cambios Guardados",
            showConfirmButton: false,
            timer: 1500
        });
        $("#pagoModal").modal("hide");
        let modal = $("#pagoModal").find('input');
        modal.eact(function () {
            $(this).val('');
        });
    });
    // Calcular cuanto se debe dependiendo de las fechas de prestamo
    function calcularfecha(fec) {
        return new Promise((resolve, reject) => {
            let fecha_pres = new Date(fec);
            let fechaActual = new Date();

            let difAnios = fechaActual.getFullYear() - fecha_pres.getFullYear();
            let difMes = fechaActual.getMonth() - fecha_pres.getMonth();
            let difdia = fechaActual.getDate - fecha_pres.getDate();

            if (difdia <= 0) {
                difMes -= 1;
            }

            let pendiente = (difAnios * 12) + difMes;
            if (pendiente === 0) {
                pendiente = 1;

            }
            resolve({
                Cuotapendiente: pendiente
            });
            reject("El calculo de la cuota pendiente es invalido.");
        });
    }

});