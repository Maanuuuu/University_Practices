#Declaramos la funcion general
def general():
    def speed(): #Funcion que calcula velocidad de un objeto
        dist=float(input("Introduzca la velocidad recorrida: "))
        time=float(input("Introduzca el tiempo del recorrido: "))
        print(f"La velocidad total es: {dist/time}")
    
    