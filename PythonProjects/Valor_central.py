def ValCenter():
   #Se declaran las variables
    A = B = C = 0
    high = mid = low = 0
    letra=0
    #Entrada de datos
    A = int(input("Ingrese el valor de A: "))
    B = int(input("Ingrese el valor de B: "))
    C = int(input("Ingrese el valor de C: "))
    #Proceso de comprobacion del valor que se encuentra en el medio de los 3 ingresados

    if A>B>C or C>B>A:
        mid = B
        letra = "B:"

    if C>A>B or B>A>C:
        mid = A
        letra = "A:"
    if A>C>B or B>C>A:
        mid = C
        letra = "C:"

    #Se imprime el valor central y se termina el programa
    print("El valor central esta en ",letra, mid)
    print("Fin del programa. ")

    
    
