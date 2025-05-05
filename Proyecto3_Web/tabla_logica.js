const open=document.getElementById('mostrar_tabla')
const modal_container = document.getElementById('modal-container')
const close = document.getElementById('cerrar_tabla')

open.addEventListener('click',()=>{
    modal_container.classList.add('show')

})
close.addEventListener('click',()=>{
    modal_container.classList.remove('show')

})