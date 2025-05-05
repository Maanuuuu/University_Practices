def leer(refarch,maxmin,lotes,muestras):
    linea=refarch.readline()
    campos1= linea.split(",")
    for i in range(4):
        maxmin[i]=float(campos1[i])
    f=0

    for linea in refarch:
        campos=linea.split(",")
        lotes[f]=campos[0]
        for c in range(6):
            muestras[f][c]= float(campos[c+1])
        f+=1

def promedio(muestras):
    prom=[[None]*2 for i in range(len(muestras))]
    pn=0
    for f in range(len(muestras)):
        sumaC=0
        sumaMg=0
        for c in range(len(muestras[0])):
            if c<3:
                sumaC+= muestras[f][c]
            else:
                sumaMg+=muestras[f][c]
            prom[f][pn]= sumaC/3
            prom[f][pn+1]= sumaMg/3
    return prom

def estatus(prom,maxmin):
    estat=[[None]for i in range(len(prom))]
    c=0
    for f in range(len(prom)):
    
        if ((prom[f][c]>maxmin[0]) and (prom[f][c]<maxmin[1])) and (prom[f][c+1]>maxmin[2] and prom[f][c+1]<maxmin[3]):
            estat[f]="Aprobado"
        else:
            estat[f]="Rechazado"
    return estat

def mostrar(lotes,prom,est):
    contR=0
    por=0.0
    print("\n Analisis de Resultados")
    print(" Nro Lote      Prom %C        Prom %Mg      Estatus")
    for f in range(len(prom)):
        print(" {0:8}".format(lotes[f]), end="")
        for c in range(len(prom[0])):
            print("      {0:5.2f}     ".format(prom[f][c]),end="")
        print("   {0:10}".format(est[f]),end="")
        if est[f]=="Rechazado":
            contR+=1
        print()
    if contR>0:
        por= contR/len(lotes) * 100
        print("\nPorcentaje de Lotes rechazados: {0:5.2f}".format(por))
    else:
        print("No se ha rechazado ningun lote")
    print("Monto total de perdidas por lotes rechazados: ",(contR*2500)," $")

refarch=open("Lotes.txt")
cantreg=len(refarch.readlines())
refarch.seek(0)

maxmin=[[None]for i in range(4)]
lotes=[[None]for i in range(cantreg-1)]
muestras= [[None]*6 for i in range(cantreg-1)]

leer(refarch,maxmin,lotes,muestras)
promedios=promedio(muestras)
estatus=estatus(promedios,maxmin)
mostrar(lotes,promedios,estatus)
