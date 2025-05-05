from random import randint

def cuadrada(size):
    filas=size
    col=size
    matrizcuad=[[None]*col for i in range(filas)]
    for f in range(filas):
        for c in range(col):
            matrizcuad[f][c]=randint(10,101)

    

    return matrizcuad

def nocuadrada(filas,col):
    matriznocuad=[[None]*col for i in range(filas)]
    for f in range(filas):
        for c in range(col):
            matriznocuad[f][c]=randint(10,101)
    
def suma(matriz1,matriz2):
    if (len(matriz1[1])==len(matriz2[1])) and (len(matriz1[0])== len(matriz2[0])):
        col=2
        filas=2
        matrizsuma=[[None]*col for i in range(filas)]

        for f in range(filas):
            for c in range(col):
                matrizsuma[f][c]=matriz1[f][c]+matriz2[f][c]
        return matrizsuma
    else: print("Las matrices no tienen el mismo numero de filas y columnas")

def multi(ma1,ma2):
    filas=len(ma1)
    col=len(ma2[0])

    matrizmulti=[[None]*col for i in range(filas)]

    for f in range(filas):
        suma=0
        for c in range(col):
            for k in range(len(ma1[0])):
                suma+= ma1[f][k] * ma2[k][c]
            matrizmulti[f][c]=suma
    return matrizmulti

def trans(ma):
    filas=len(ma)
    col=len(ma[0])

    transpuesta=[[None]*col for i in range(filas)]

    for c in range(filas):
        for f in range(col):
            transpuesta[c][f]=ma[f][c]  
    
    return transpuesta

def menu():
    print("\nMenu Principal ")
    print("1._ Sumar Matrices")
    print("2._ Multiplicar Matrices")
    print("3._ Transpuesta de una Matriz")
    print("4._ Finalizar")
    
    opcion=input("Seleccione su opcion: ")
    ma1= cuadrada(2)
    print("\nLa matriz 1 es:")
    for i in range(2):
        for c in range(2):
            print("  {0:3d}".format(ma1[i][c]),end=" ")
        print()
    ma2= cuadrada(2)
    print("\nLa matriz 2 es:")
    for i in range(2):
        for c in range(2):
            print("  {0:3d}".format(ma2[i][c]),end=" ")
        print()
    if opcion=="1":
        sumita= suma(ma1,ma2)
        print("\nLa suma es:")
        for i in range(2):
            for c in range(2):
                print("  {0:3d}".format(sumita[i][c]),end=" ")
            print()

    elif opcion=="2":
        multiplicacion=multi(ma1,ma2)
        print("\nLa multiplicacion es:")
        for i in range(2):
            for c in range(2):
                print("  {0:3d}".format(multiplicacion[i][c]),end=" ")
            print()
    elif opcion=="3":
        transpuesta=trans(ma1)
        print("\nLa Transpuesta es:")
        for i in range(2):
            for c in range(2):
                print("  {0:3d}".format(transpuesta[i][c]),end=" ")
            print()
menu()


            