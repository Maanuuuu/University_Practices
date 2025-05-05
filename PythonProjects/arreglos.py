from random import randint
suma = 0
filas=int(input("Numero de Filas: "))
col=int(input("Numero de columnas: "))
matriz=[[None]*col for i in range(filas)]

for f in range(filas):
    for c in range(col):
        matriz[f][c] = randint(1,100)

print()

for f in range (filas):
    for c in range(col):
        print(f"{matriz[f][c]}", end=" ")
    print()

print()

for f in range(filas):
    suma=0
    for c in range(col):
        suma+=matriz[f][c]
    prom=suma/col
    print(f"Promedio fila {f+1} : {prom}")
print()
prom=0
for c in range(col):
    suma=0
    for f in range(filas):
        suma+=matriz[f][c]
    prom=suma/filas
    print(f"El promedio de la columna {c+1} es: {prom}")

