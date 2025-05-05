from math import sqrt
'''
Super mega programa que calcula triangulos
como un toro sin pastillas
por Manu.
'''
#Variables
x1=y1=x2=y2=x3=y3=0.0
hp=c12=c23=c31=lm=cateto1=cateto2=0.0
tipo=tipo2=0
#Entrada de datos
x1 = float(input("Introduzca X1: "))
y1 = float(input("Introduzca Y1: "))
x2 = float(input("Introduzca X2: "))
y2 = float(input("Introduzca Y2: "))
x3 = float(input("Introduzca X3: "))
y3 = float(input("Introduzca Y3: "))
#Proceso
c12 = sqrt((x2-x1)**2+(y2-y1)**2)
c23 = sqrt((x3-x2)**2+(y3-y2)**2)
c31 = sqrt((x1-x3)**2+(y1-y3)**2)

if c12 > c23 and c12 > c31:
    cateto1 = c23 ; cateto2 = c31
    lm = c12
    hp = sqrt((c23)**2+(c31)**2)
    if c23 == c31:
        tipo2 = "Isósceles"
    else:
        tipo2 = "Escaleno"
            
    if lm == hp:
        tipo = "Triángulo rectángulo"
    else:
        tipo="No es un Triángulo Rectángulo"
        
elif c23 > c12 and c23 > c31:
    cateto1 = c12 ; cateto2 = c31
    lm = c23
    hp = sqrt((c12)**2+(c31)**2)
    if c12 == c31:
        tipo2 = "Isósceles"
    else:
        tipo2 = "Escaleno"
            
    if lm == hp:
        tipo = "Triángulo rectángulo"
    else:
        tipo="No es un Triángulo Rectángulo"

elif c31 > c12 and c31 > c23:
    cateto1 = c12 ; cateto2 = c23
    lm = c31
    hp = sqrt((c12)**2+(c23)**2)
    if c12 == c21:
        tipo2 = "Isósceles"
    else:
        tipo2 = "Escaleno"
            
    if lm == hp:
        tipo = "Triángulo rectángulo"
    else:
        tipo="No es un Triángulo Rectángulo"

print("Salida:")
print("Mayor =",lm,"Cateto 1 =",cateto1,"Cateto 2 =",cateto2,"Hipotenusa =",hp)
print(tipo,tipo2)



