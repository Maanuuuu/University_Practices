#Variables
A=B=C=0
high=mid=low=0
#Entrada de datos
A = int(input("Ingrese el valor de A: "))
B = int(input("Ingrese el valor de B: "))
C = int(input("Ingrese el valor de C: "))
#Proceso
if A>B>C or A>C>B:
    high = A
elif B>A>C or B>C>A:
    high = B
elif C>A>B or C>B>A:
    high = C

elif B>A>C or C>A>B:
    mid = A
elif C>B>A or A>B>C:
    mid = B
elif A>C>B or B>C>A:
    mid = C

elif B>C>A or C>B>A:
    low = A
elif A>C>B or C>A>B:
    low = B
elif B>A>C or A>B>C:
    low = C
    
elif (A==B or B==A):
    high = A
    mid = B
    if A>C:
        low = C
    else:
            high = C
            low = A
elif (C==A or A==C):
    high = C
    mid = A
    if C>B:
        low = B
    else:
            high = B
            low = C
elif (C==B):
    high = C
    mid = B
    if C>A:
        low = A
    else:
            high = A
            low = C
            mid = B
elif A==B==C:
    high = A
    mid = B
    low = C

            
print("Salida:")
print("Impresion en forma ascendente: ", low,mid,high)
print("Impresion en forma descendente: ",high,mid,low)
