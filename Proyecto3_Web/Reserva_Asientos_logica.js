function mostrarFormulario() {
    document.getElementById('landing-content').classList.remove('visible');
    document.getElementById('reserva').classList.remove('visible');
    document.getElementById('formulario').classList.add('visible');
}

function mostrarReservacion() {
    document.getElementById('formulario').classList.remove('visible');
    document.getElementById('reserva').classList.add('visible');
}

function mostrarPrincipal() {
    document.getElementById('formulario').classList.remove('visible');
    document.getElementById('landing-content').classList.add('visible');
}

function mostrarPago(){
    document.getElementById('reserva').classList.remove('visible');
    document.getElementById('Pago').classList.add('visible');
}

function regresoPago(){
    document.getElementById('Pago').classList.remove('visible');
    document.getElementById('reserva').classList.add('visible');
}

function volver() {
    alert("Boleto reservado exitosamente")
    agregar_registro()
    document.getElementById('Pago').classList.remove('visible');
    document.getElementById('landing-content').classList.add('visible');
}

function agregar_registro(){
    const nombre = document.getElementById('nombres').value;
    const asiento = document.getElementById('asiento_reservado').textContent
    let tabla=document.getElementById('miTabla').insertRow(0)
    
    let col1 = tabla.insertCell(0)
    let col2 = tabla.insertCell(1)
    col1.innerHTML=nombre
    col2.innerHTML=asiento
    alert('alo')
    
}