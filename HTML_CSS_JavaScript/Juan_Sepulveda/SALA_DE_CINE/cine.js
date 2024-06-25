document.addEventListener('DOMContentLoaded', function () {
    // Selecciona el elemento `wrapper`
    const wrapper = document.querySelector('.wrapper');
    
    // Selecciona la nueva ubicación para mover el `wrapper`
    const newLocation = document.getElementById('new-location');
    
    // Mueve el `wrapper` a la nueva ubicación
    if (wrapper && newLocation) {
        newLocation.appendChild(wrapper);
    }

    
});
