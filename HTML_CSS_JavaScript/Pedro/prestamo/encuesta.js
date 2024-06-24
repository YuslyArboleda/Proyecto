


$(document).ready(function () {
   let fecha;

   $('#fecha_prestamo').change((e) => {
       fecha = $(e.target).val();
       calcularfecha(fecha)
           .then(result => {
               // Este método es para si la promesa se resuelve correctamente, muestra el resultado
               $("#cuotapen").val(result.Cuotapendiente);
           }).catch(err => {
               // Es una forma de controlar y gestionar posibles errores en nuestro código. en caso que la promesa
               // se resuelva incorrectamente muestre el error
               console.error("Error al calcular", err);
           });
   });

   $('#valorpres').keyup((e) => {
       const deuda = parseFloat($('#valorpres').val());
       const interes = parseFloat($('#intereses').val());

       if (!isNaN(deuda) && !isNaN(interes)) {
           const tot = deuda * interes / 100;
           $('#totalpago').val(tot.toFixed(2));
       }
   });

   $('#modalpagos').on('show.bs.modal', (e) => {
       const form = $('.formulario')[0];

       if (!form.checkValidity()) {
           e.preventDefault(); // Evita abrir el modal
           e.stopPropagation();
           form.classList.add('was-validated');

           Swal.fire({
               icon: "error",
               title: "Oops...",
               text: "Debe llenar todos los campos!",
           });

           return; // Detiene el modal
       } else {
           let deuda;
           $('#totalpago').val() !== '' ? deuda = $("#totalpago").val() : deuda = $('#valorpres').val();
           $('#prestamo').val(deuda);
           let interes = $("#intereses").val();
           $('#interes').val(interes + ' %');
           let pendiente = $("#cuotapen").val();

           $('#valorpago').keyup((e) => {
               let pago = parseFloat($(e.target).val());
               calcularPago(pago, parseFloat(deuda), parseFloat(interes), parseInt(pendiente))
                   .then(resultado => {
                       // Si la promesa se resuelve correctamente, muestra el resultado
                       $('#cuota').val(resultado.numCuota);
                       $("#pago_interes").val(resultado.pagoInteres.toFixed(2));
                       $("#pago_capital").val(resultado.pagoCapital.toFixed(2));
                       $("#valor_actual").val(resultado.valorActual.toFixed(2));
                   }).catch(error => {
                       // Si la promesa se resuelve incorrectamente, muestra el error
                       console.error("Error al calcular", error);
                   });
           });
       }

       $("#guardar").click(function () {
           Swal.fire({
               icon: "success",
               title: "!Su información se Guardó!",
               timer: 1500
           }).then(() => {
               let cuota = parseFloat($('#cuota').val());
               let cuota_pend = parseFloat($('#cuota_pe').val());

               if (cuota > cuota_pend) {
                   cuota_pend = 0;
               } else {
                   cuota_pend -= cuota;
               }
               $('#cuota_pe').val(cuota_pend.toFixed(2));
               $('#totalpago').val($('#valor_actual').val());
               $('#modalpagos').modal("hide");
               limpiar();
           });
       });
   });

   function calcularPago(p, d, vallnt, pe) {
       return new Promise((resolve, reject) => {
           if (vallnt === 0) {
               reject('El interés no puede ser 0');
               return;
           }

           let valInt = vallnt / 100; // Convertimos el porcentaje a decimal
           let cuota = (p / valInt).toFixed(2);
           let pago_interes = pe * valInt; // Total de intereses pagados por el cliente
           let valActual;

           if (pe !== 0 && cuota <= pe) {
               pago_interes = parseFloat(cuota) * valInt;
               valActual = d - pago_interes;
           } else {
               pago_interes = parseFloat(pe) * valInt;
               valActual = d - p;
           }
           let capital = p - pago_interes;

           if (cuota >= 0) {
               resolve({
                   numCuota: parseFloat(cuota),
                   pagoCapital: capital,
                   pagoInteres: pago_interes,
                   valorActual: valActual
               });
           } else {
               reject('El cálculo de la cuota es inválido. Ingrese nuevamente');
           }
       });
   }

   function calcularfecha(fec) {
       return new Promise((resolve, reject) => {
           let fecha_pres = new Date(fec);
           let fechaActual = new Date();
           // Este método nos permite calcular la diferencia en años y meses
           let difAnios = fechaActual.getFullYear() - fecha_pres.getFullYear();
           let difMes = fechaActual.getMonth() - fecha_pres.getMonth();
           let difdia = fechaActual.getDate() - fecha_pres.getDate();

           // Si la diferencia de los días es negativa no ha pasado un mes
           if (difdia < 0) {
               difMes -= 1;
           }

           let pendiente = (difAnios * 12) + difMes;
           if (pendiente <= 0) {
               pendiente = 1;
           }

           if (pendiente >= 0) {
               resolve({
                   Cuotapendiente: pendiente
               });
           } else {
               reject('El cálculo de la cuota pendiente es inválido. Ingrese los valores nuevamente.');
           }
       });
   }

   function limpiar() {
       let modal = $('#modalpagos').find('input');
       modal.each(function () {
           $(this).val('');
       });
   }

   $('#cerrar').click(function () {
       limpiar();
   });
});