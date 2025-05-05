def imc():
    peso = 0.0
    altura = 0.0

    peso = float(input("Introduzca su peso: "))
    altura = float(input("Introduzca su altura: "))

    imc = peso/(altura)**2

    print("Su IMC es: ", imc)

    if peso > 0:
        if peso <= 40:
            print("Usted es flaco.")
        elif peso <= 60:
            print("Usted es delgado")
        elif peso <= 80:
            print("Usted es rellenito")
        else:
            print("Usted es gordito")
    else: print("Datos no validos")

    if imc > 0:
        if imc <= 18.5:
            print("Estatus: Bajo de peso")
        elif (imc >= 18.51) and (imc <= 24.99):
            print("Estatus: Peso Normal")
        elif (imc >= 25.0) and (imc <= 29.99):
            print("Estatus: Sobrepeso")
        else:
            print("Estatus: Obesidad")
    else:
        print("Datos no validos")


