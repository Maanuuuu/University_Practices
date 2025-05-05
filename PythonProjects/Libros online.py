#Inicializacion de variables
titulo=""
tamañolibro=0
mblibre=100
veldescarga = 120 
diferencia=pago=td=mi=si=0
#Entrada de datos
titulolibro = str(input("Introduzca el titulo del libro: "))
tamañolibro = int(input("Introduzca el tamaño del libro: "))
#Proceso
if tamañolibro <= mblibre:
    print("La descarga de:",titulolibro,"es gratuita")
    mblibre -= tamañolibro
    print("Sobraron",mblibre,"mb libres")
else:
    diferencia = tamañolibro - mblibre
    pago = diferencia *10
    print("Parte de:",titulolibro,"sera gratuita, y hay un pago parcial de:",pago,"Bs")
    print("Cantidad de megas cancelados:",diferencia)

td = (tamañolibro * 1024)//veldescarga
mi = td//60
seg = td%60

print("El tiempo de descarga es:",mi,"minutos",seg,"segundos")
print("")
print("Fin del programa")
    

