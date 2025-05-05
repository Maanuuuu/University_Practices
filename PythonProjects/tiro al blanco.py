#Variables
x=y=r=0
puntos=0
#Entrada de datos
x = float(input("Ingrese el valor de X: "))
y = float(input("Ingrese el valor de Y: "))
#Proceso
r = x**2 + y**2

if r <= 16:
    if r <= 1:
        puntos = "100 puntos"
    elif r <= 4:
        puntos = "50 puntos"
    elif r <= 6:
        puntos = "25 puntos"
    else:
        puntos = "10 puntos"
    print("La flecha dio en la diana y obtuvo: ", puntos)
else:
    print("La flecha no atino en la diana")


