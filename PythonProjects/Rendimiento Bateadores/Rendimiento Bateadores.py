#Declaracion de variables
nombre=mejorbat=archivo=registro=campos=mnom1=mnom2=""
ponches=senc=dobles=triples=cuadra=enbaso=totalturn=flagprom=contbat=acumhit=acumsenc=0
prom=mejorprom=batmejor=0.0
#Proceso
archivo= open("Rendimiento.txt")
print("Nombre      Ponches  Sencillos Dobles  Triples  Home Run  Promedio  Se Enbaso")

for registro in archivo:
    campos=registro.split(",")
    nombre=campos[0]
    ponches=int(campos[1])
    senc=int(campos[2])
    dobles=int(campos[3])
    triples=int(campos[4])
    cuadra=int(campos[5])

    enbaso=senc+dobles+triples+cuadra
    totalturn=enbaso+ponches
    prom=enbaso/totalturn

    if prom>mejorprom:
        mejorprom=prom
        mnom1=nombre
    elif prom == mejorprom:
        mnom2=nombre

    if prom> 0.300:
        flagprom+=1
    contbat+=1
    acumsenc+=senc
    acumhit+=enbaso
    
    print("{0:12}{1:5d}    {2:5d}    {3:5d}   {4:5d}     {5:-5d}      {6:-5.3f}     {7:5d}".format(nombre,ponches,senc,dobles,triples,cuadra,prom,enbaso))
batmejor=flagprom/contbat*100
porc1=(acumsenc/acumhit)*100
print("El Bateador con mayor promedio de bateo:",mnom1)
if mnom2!="":
    print("El ultimo bateador con el mismo promedio es:",mnom2)
else:
    print("Fu el unico bateador con este promedio")
print("Porcentaje de Bateadores con mas de 0.300 de promedio: {0:5.2f}".format(batmejor))
print("Porcentaje de sencillos bateados {0:5.2f}".format(porc1))
    
