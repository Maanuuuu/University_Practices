
document.addEventListener("DOMContentLoaded", function () {

    // Recorrido de los asientos del vuelo (Vaje de ida y vuelta)
    const asientos = document.querySelectorAll(".seat");  // seleccionamos todos los asientos
    const aceptar = document.querySelector(".confirm-button");  // boton para aceptar la reservacion del asiento
    const cancelar = document.querySelector(".cancel-button");
    aceptar.disabled = true;

    let asiento_seleccionado = null;

    // hacemos un ciclo para recorrer cada uno de los asientos y manejar los eventos
    asientos.forEach(asiento => {
        asiento.addEventListener("click", () => {
            let nro_asiento = document.querySelector(".numero-asiento");

            if (asiento_seleccionado === asiento) {

                // Si el asiento clicado ya está seleccionado, desmarcarlo
                asiento.classList.remove("selected");
                asiento.style.backgroundColor = "#cacaca"; // Cambiar a color original
                nro_asiento.innerText = ""  // vaciamos el campo de texto
                asiento_seleccionado = null;
                aceptar.disabled = true;  // desabilitamos el boton

            } else if ((asiento_seleccionado === null) && !(asiento.classList.contains('selected'))) {
                
                // Si no hay asiento seleccionado, marcar el asiento clicado
                asiento.classList.add("selected");
                asiento.style.backgroundColor = "red"; // Cambiar a rojo
                nro_asiento.innerText = asiento.id  // colocamos en el campo de texto el asiento
                asiento_seleccionado = asiento;
                aceptar.disabled = false;  // habilitamos el boton
            }

        });
    });


    // confirmar la reservacion del asiento


    aceptar.addEventListener('click', () => {
        localStorage.setItem('asiento_reservado', asiento_seleccionado.id);

        alert("Reserva de asiento realizada");
    });

    cancelar.addEventListener('click', () => {
        asiento_seleccionado.classList.remove("selected");  // eliminamos la seleccion del asiento
        asiento_seleccionado.style.backgroundColor = "#cacaca"; // Cambiar a color original
        nro_asiento.innerText="";  // vaciamos el campo de texto
        asiento_seleccionado = null;  // quitamos el asiento reservado
    });
});
