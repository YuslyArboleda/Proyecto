// document.getElementById("valorpaga").addEventListener("keyup", (accion) => {
//     let pago = $(accion.target).val();
//     let interes = $("#interes").val();
//     let deuda = $("#valorpres").val();
//     let numcuota = (pago/(deuda/parseFloat(interes)));
//     $("#cuota").val(Number(numcuota.toFixed(1)));//muestra solamente un valor en la cuota
// });
// $('#totalpaga').val()=== ''?deuda=$('#valopre').val():deuda=$("#totalpaga").val();
// (resultado.capital)>0?$('#pagocapi').val(resultado.capital):$('#pagocapi').val(0);

$(document).ready(function () {

    let fecha;
    $('#fecha').change((e) => {
        fecha = $(e.target).val();
        calcularfecha(fecha)
            .then(result => {
                //si la promesa se resulve correctamente
                $("#cuotapende").val(result.Cuotapendiente);
            }).catch(err => {
                //si la promesa se resulve incorrectamente
                console.error("Error al calcular", err);
            });
    });

    $('#valopre').keyup((e) => {
        //Para que al momento de escribir en el campo de valor prestado se calcule y asigne al valor total
        const deuda = parseInt($('#valopre').val());
        const pendiente = parseInt($('#cuotapende').val());
        const interes = parseInt($('#Int').val());

        const tot = (deuda + deuda * interes / 100 * pendiente);

        $('#totalpaga').val(tot);

    });

    $('#pagos').on("show.bs.modal", (e) => {

        const form = $('.formu')[0];
        let interes = parseFloat($("#Int").val());
        let valpres = parseFloat($("#valopre").val());
        const tot = $("#totalpaga").val();
        console.log(tot);
        let pendiente = parseFloat($("#cuotapende").val());


        if (isNaN(interes) || isNaN(valpres)) {
            form.classList.add('was-validated')
            e.preventDefault();//evita abrir el modal
            e.stopPropagation();
            isNaN(interes) ? $("#Int").addClass("is-invalid") : $("#valopre").addClass("is-invalid");

            form.classList.remove("is-invalid");
            Swal.fire({
                icon: "error",
                title: "Oops...",
                text: "Por favor, llenar todos los campos!",
            });
            return; // detiene el modal

        } else {
            $('.invalid-feedback').css("display", "none");

            const form = $('.formu');
            const formulario = form.find('input');
            formulario.each(function () {
                $(this).removeClass('is-invalid');
            });

            let deudaActual;
            //condicion para que cuando la cuota pendiente sea cero el valor de la deuda actual sea el asignado en el formulario   
            if ((valpres < tot) && pendiente !== 0) {
                deudaActual = valpres;
            } else {
                deudaActual = tot;
            }

            let valinteres = parseFloat(deudaActual * parseFloat(interes)) / 100;


            let deuda = tot; //lo que debe el cliente
            interes = $('#Int').val();
            $('#totalpaga').val() !== '' ? deuda = $('#totalpaga').val() : deuda = $("#valopre").val();
            $('#valorpres').val(tot);
            $('#interes').val(interes);

            $('#valorpaga').keyup((event) => {
                let pago = $(event.target).val();
                calcularPago(pago, deuda, valinteres, pendiente). //para colocar una promesa
                    then(resultado => {
                        $('#cuota').val(resultado.numCuota);
                        $('#valorinter').val(resultado.valor);
                        $('#pagocapi').val(resultado.capital);
                        $('#valoractu').val(resultado.valactul);

                    }).catch(error => {
                        console.error("Error al calcular", error);
                    });
            });
        }
    });

    function calcularPago(pag, deu, valint, pe) {
        //Realizamos los calculos correspondientes para saber el valor a pagar
        return new Promise((resolve, reject) => {
            //let valinteres = tot / int;
            let cuota = (pag / valint).toFixed(1);
            let valactul;
            let valintere;

            if (pe !== 0 && cuota <= pe) {

                valintere = parseFloat(cuota) * valint;
                valactul = deu - valintere;
            } else {
                valintere = parseFloat(pe) * valint;
                valactul = deu - pag;
            }

            let capi = pag - valintere;

            if (cuota >= 0) {
                resolve({
                    numCuota: Number(cuota),
                    valor: Number(valintere),
                    capital: Number(capi),
                    valactul: Number(valactul)
                });

            } else {
                reject("No se pudo calcular");
            }

        });
    }

    function calcularfecha(fec) {
        return new Promise((resolve, reject) => {
            //Para calcular las cuotas pendientes 
            let fechapres = new Date(fec);
            let fechaActual = new Date();
            //calcular la diferencia en años y meses
            let diferenciaAnios = fechaActual.getFullYear() - fechaActual.getFullYear();
            let diferecniaMes = fechaActual.getMonth() - fechapres.getMonth();
            let deferenciaDia = fechaActual.getDate() - fechapres.getDate();
            //si la diferencia de los dias es negativa no ha pasado un mes
            if (deferenciaDia <= 0) {
                diferecniaMes -= 1;
            }
            let pendiente = (diferenciaAnios * 12) + diferecniaMes;

            if (pendiente === 0) {
                pendiente = 1;
            }
            resolve({
                Cuotapendiente: pendiente
            });
            reject("El calculo de la cuota pendiente es invalida");
        });
    }

    function limpiar() {
        let modal = $('#pagos').find('input');
        modal.each(function () {
            $(this).val('');
        });
    };

    $('#btnguardar').click((e) => {
        Swal.fire({
            icon: "success",
            title: "Guardado",
            showConfirmButton: false,
            timer: 1500
        }).then(() => {
            let cuota = $('#cuota').val();
            let cuotapend = $('#cuotapende').val();

            if (cuota > cuotapend) {
                cuotapend = 0;
                $('#cuotapende').val(cuotapend);
            } else {
                cuotapend = cuotapend - cuota;
                $('#cuotapende').val(cuotapend);
            }
            $('#totalpaga').val($('#valoractu').val());
            $('#pagos').modal('hide');
            limpiar();
            // para cerrar el modal
            // let modal = $('#pagos').find('input');
            // modal.each(function () {
            //     $(this).val('');
            // });
        });
    });

    $('#btncerrar').click(function (){
        limpiar();
    });

});

