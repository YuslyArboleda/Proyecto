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

    const form = $('#.formu')[0];
    let fecha;
    $('#fecha').chance((e) => {
        fecha = $(e.target).val();
        calcularfecha(fecha);
        then(result => {
            $("#cuotapende").val(result.Cuotapendiente);
        }).catch(err => {
            console.error("Error al calcular", err);
        });
    });

    $('#pagos').on("show.bs.modal", (e) => {

        const form = $('.formu')[0];
        if (!form.checkValidity()) {
            e.preventDefault(); //evita abrir el modal
            e.stopPropagation();
            form.classList.add('was-validated');
            Swal.fire({
                icon: "error",
                title: "Oops...",
                text: "Por favor, llenar todos los campos!",
            });

            return;
        } else {

            let deuda; //lo que debe el cliente
            let interes = $('#Int').val();
            $('#totalpaga').val() !== '' ? deuda = $('#totalpaga').val() : deuda = $("#valopre").val();
            let pendiente = $('#cuotapende').val();
            // let prueba  = (parseInt(deuda)/parseInt(interes)*cuop);
            $('#valorpres').val(deuda / interes * parseInt(pendiente) + parseInt(deuda));
            $('#interes').val(interes);

            $('#valorpaga').keyup((event) => {
                let pago = $(event.target).val();
                calcularPago(pago, deuda, interes, pendiente). //para colocar una promesa
                    then(resultado => {
                        $('#cuota').val(resultado.numCuota);
                        $('#valorinter').val(resultado.valor);
                        $('#pagocapi').val(resultado.capital);
                        $('#valoractu').val(resultado.valototal);

                        $('#btnguardar').click((e) => {
                            $('#totalpaga').val(resultado.valototal);
                        });
                    }).catch(error => {
                        console.error("Error al calcular", error);
                    });
            });
        }
    });

    function calcularPago(pag, deu, int, pe) {
        return new Promise((resolve, reject) => {
            let valinteres = deu / parseFloat(int);
            let cuota = (pag / valinteres).toFixed(1);
            let valint = (pe * valinteres);
            let capi = (pag - valint);
            let total = (deu - capi);

            if (cuota >= 0) {
                resolve({
                    numCuota: Number(cuota),
                    valor: Number(valint),
                    capital: Number(capi),
                    valototal: Number(total)
                });

            } else {
                reject("No se pudo calcular");
            }

        });
    }
});
