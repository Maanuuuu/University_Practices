def descuento(): #Declaramos la funcion
    precio = int(input("Introduzca el precio del producto: ")) #Recogemos el precio del producto
    descuento=int(input("\nCuanto es el descuento?")) #Cantidad de descuento
    unidades=int(input("\nA partir de cuantas unidades se aplica el descuento?: ")) #En cuantas unidades se aplica el descuento
    cantidad = int(input("\nCuantas unidades desea comprar?: "))#Cuantas unidades se van a comprar

    precio = cantidad * precio #Se calcula el precio total

    if cantidad >= unidades: #Se comprueba si se aplica el descuento
        descuento = precio * ((descuento*precio)/100) #Se calcula el descuento
        precio = precio - descuento #Se resta el descuento al precio total

    print(f"La cantidad total a pagar es: {precio}$") #Se muestra el precio

