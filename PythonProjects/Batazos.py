from math import sin, cos, tan, radians

def xMax(velocidadoriginal,ang):
    xmax= (velocidadoriginal**2*(sin(2*radians(ang)))/9.81)
    return xmax

def yMax(xmax,altura,velocidadoriginal,ang):
    ymax = ((altura+xmax*tan(radians(ang)))-(9.81*xmax**2)/(2*velocidadoriginal**2*cos(radians(ang)**2)))
    return ymax

def situacion(xm,ym):
    sit=-1
    if xm < 36.88:
        sit=0
    elif (xm > 36.88 and xm<128.49) or (xm>128.49 and ym<3.5):
        sit=1
    
    elif xm>128.49 and ym>3.5:
        sit=2
    return sit

nombre= input("Nombre del bateador: ")
altura= float(input("Altura inicial del batazo: "))
velocidadoriginal=float(input("Velocidad de salida de la pelota: "))
ang=float(input("Angulo de salida de la pelota: "))


xMaxima= xMax(velocidadoriginal,ang)
yMaxima= yMax(xMaxima,altura,velocidadoriginal,ang)
batazo= situacion(xMaxima,yMaxima)
if batazo==0:print(" Dentro del cuadro")
elif batazo==1: print(" En los jardines")
else: print(" Fuera del campo")