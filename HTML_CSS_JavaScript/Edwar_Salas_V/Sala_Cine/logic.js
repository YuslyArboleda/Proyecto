let botones = document.querySelectorAll(".boton");
botones.forEach(function (boton) {
  boton.addEventListener("click", function () {
    this.style.backgroundColor = "#d7e612";
  });
});


