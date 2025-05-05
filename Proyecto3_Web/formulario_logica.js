// import {boleto} from .;
// import {pago_realizado} from '';


// evento para asegurar que no haya ningun error al encontar el doom

document.addEventListener("DOMContentLoaded", function () {

    // obtener el asiento reservado por el pasajero
    const asiento_reservado = localStorage.getItem('asiento_reservado');

    // botones del formulario
    const enter_form = document.querySelector(".enviar");
    const reservar = document.querySelector(".reservacion");
    const pago = document.querySelector(".pago")


    // codigos telefonicos de todos los paises
    const inputs = document.querySelectorAll(".telefono");
    const lista_telefonos = [];

    // recorremos cada numero telefonico
    inputs.forEach(input => {
        const flags = window.intlTelInput(input, {
            utilsScript: "https://cdn.jsdelivr.net/npm/intl-tel-input@23.1.0/build/js/utils.js",
            separateDialCode: true
        });
        // guardamos cada numero telefonico
        lista_telefonos.push(flags);
    });


    // funcion para verificar los campos del texto para ver si son validos o si todos estan rellenados
    const forms = document.querySelectorAll(".formulario")

    // la validacion se va accionar cuando se oprima el boton
    enter_form.addEventListener("click", function(event) {
        
        validacion = []

        // recorremos cada formulario
        forms.forEach(form => {

            // chequeamos la validacion de los campos de los formularios de forma individual
            if (!form.checkValidity()) {
                event.preventDefault(); // no valido
            } else if(form.querySelector('label[for="telefono"]') != null){
                alert("Hola telefono")
                if (form.querySelector('label[for="telefono"]').textContent === 'Numero de Telefono *') {
                    alert("Cerca de telefono")
                    if (lista_telefonos[0].isValidNumber()){
                        alert("telefono malo")
                        event.preventDefault(); // no valido
                    } else {
                        alert("telefono")
                        val = true;
                        validacion.push(val); // valido
                    }
                }
            } else {
                val = true;
                validacion.push(val);
                
            }
        });

        // validaciones que se tienen que cumplir para enviar el formulario

        // primero que los campos de textos este llenos (*) y sean validos
        if (validacion[0] && validacion[1] && validacion[2]){

            // comprobar que reservo un asiento
            if (asiento_reservado != null  && pago_realizado){
                alert("Formulario enviado")
            } else {
                alert("Reserva un asiento o realiza el pago para reservar el vuelo")
            }
        } else {
            alert('Por favor, completa todos los campos correctamente.');
            if (asiento_reservado != null){
                console.log("asiento del pasajero", asiento_reservado);
            }
            
            console.log("validaciones: ", validacion[0], validacion[1], validacion[2]);
        }
    }); 
        
    
    // reservar asiento del vuelo
    reservar.addEventListener("click", () => {
        window.location.href = 'index.html'
    });
    
});