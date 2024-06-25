document.getElementById("pagado").addEventListener("keyup",(event) => {
  
    let pago= $(event.target).val();
    let interes=$("#interes").val();
    let deuda=$("#prestamo").val();
    let numCuota=$(pago/(deuda/parseFloat(interes)));
    $("cuota").val(Number(numCuota.toFixed(1)));
     
});

$(document).ready(function(){

  $('#botonModal').click((e) => {
      let deuda;

      $('#total').val() !==''? deuda = $("#total").val() : deuda = $('#val_pres'). val();
      $('#pretamo').val(deuda);
      let interes = $("#intereses").val();
      $('#interes').val(interes);
     
      $('#valor').keyup((e) => {
         let pago = $(e.target).val();
         calcularPago(pago, deuda, interes).
         then(resultado => {
              $('#cuota').val(resultado.numCuota);
         }).catch(error => {
            console.error("Error al calcular", error);
         });


      });
   
  })  

});
function calcularPago(p, d, i) {
     return new Promise((resolve, reject) => {
     let valint = d/ parseFloat(i);
     let cuota = (p/ valint).toFixed(1);

     resolve({
        numCuota: Number(cuota)
     });
     reject('el calculo de la cuota es invalido');
    });

}