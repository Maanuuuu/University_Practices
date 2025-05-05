from math import sqrt

n1 = n2 = 0
#Punto 1
x1 = float(input("Introduzca X1: "))
y1 = float(input("Introduzca Y1: "))
#Punto 2
x2 = float(input("Introduzca X2: "))
y2 = float(input("Introduzca X2: "))
#Operacion
dist = sqrt((x2 - x1)**2 + (y2 - y1)**2)
#Pendiente
m = ((y2 - y1)/(x2 - x1))
#Salida
print("\n Salida de resultados:")
print("La distancia entre los dos puntos es: ", dist)
print("La pendiente entre los dos puntos es: ", m)