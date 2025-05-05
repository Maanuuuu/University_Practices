import Peso
import Valor_central
import Descuento
import calculadora

def calcular():
    print("Bienvenido a la super Calculadora")
    option=input("Que desea calcular? (Cuenta,IMC,Valor Central,Descuento,): ")
    if option=="IMC":
        Peso.imc()
    elif option=="Cuenta":
        calculadora.calculadora()
    elif option=="Valor Central":
        Valor_central.ValCenter()
    elif option=="Descuento":
        Descuento.descuento()

calcular()
