#Se declara la funcion
def calculadora():  
    print("Bienvenido a mi calculadora")
    print("Para salir escribe SALIR")
    print("Las operaciones son suma, resta, multi, div")


    resultado = ""
    
    #Se piden los datos que se utilizaran en los calculos
    while True:
        if not resultado:
            resultado = input("Ingrese un Numero: ")
        if resultado == "salir":
            break
        resultado = int(resultado)
        op = input("Ingrese la operacion: ")
        if op.lower() == "salir":
             break
        n2 = input("Ingrese el otro numero: ")
        if n2.lower() == "salir":
            break
        n2 = int(n2)
        
        #Calculos

        if op.lower() == "suma": #Se calcula la suma
            resultado += n2
        elif op.lower() == "+":
            resultado += n2
        elif op.lower() == "resta":#Se calcula la resta
            resultado -= n2
        elif op.lower() == "-":
            resultado -= n2
        elif op.lower() == "multi":#Se calcula la multiplicacion
            resultado *= n2
        elif op.lower() == "*":
            resultado *= n2
        elif op.lower() == "div":#Se calcula la division
            resultado /= n2
        elif op.lower() == "/":
            resultado /= n2
        else :
            print("Operacion no valida")
            break   
        resultado = int(resultado)
        #Se imrpime el resultado total, y se sigue ejecutando para nuevas operaciones
        print(f"el resultado es: {resultado}")
    



