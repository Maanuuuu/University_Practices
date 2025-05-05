from pathlib import Path

import random
from tkinter import Tk, Canvas, Entry, Text, Button, PhotoImage,messagebox
import tkinter as tk
import matplotlib.pyplot as plt
from matplotlib_venn import venn3,venn2


OUTPUT_PATH = Path(__file__).parent
ASSETS_PATH = OUTPUT_PATH / Path(r"C:\Users\manue\OneDrive\Escritorio\Programación\InterfazOM\build\assets\frame0")


def relative_to_assets(path: str) -> Path:
    return ASSETS_PATH / Path(path)


window = Tk()

window.geometry("852x680")
window.configure(bg = "#3E92CC")
window.title("Interfaz Operaciones Logicas")

canvas = Canvas(
    window,
    bg = "#0d8ce4",
    height = 702,
    width = 852,
    bd = 0,
    highlightthickness = 0,
    relief = "ridge"
)

canvas.place(x = 0, y = 0)



#Entry p

entre_image_p = PhotoImage(
    file=relative_to_assets("entry_4.png"))
entry_qg_p = canvas.create_image(
    152.70762721377446,
    115.77844197560978,
    image=entre_image_p
)
entry_p = Entry(
    bd=0,
    bg="#FFFFFF",
    fg="#000716",
    highlightthickness=0
)
entry_p.place(
    x=86.7030405195145,
    y=103.2784423828125,
    width=130.00917338851991,
    height=20.99999918559456
)




#Entry q

entry_image_p = PhotoImage(
    file=relative_to_assets("entry_3.png"))
entry_qg_p = canvas.create_image(
    335.70762721377446,
    115.77844197560978,
    image=entry_image_p
)
entry_q = Entry(
    bd=0,
    bg="#FFFFFF",
    fg="#000716",
    highlightthickness=0
)
entry_q.place(
    x=268.7030405195145,
    y=103.2784423828125,
    width=130.00917338851991,
    height=20.99999918559456
)




#Entry C

entry_image_r = PhotoImage(
    file=relative_to_assets("entry_2.png"))
entry_qg_r = canvas.create_image(
    530.7076272137745,
    115.77844197560978,
    image=entry_image_r
)
entry_r = Entry(
    bd=0,
    bg="#FFFFFF",
    fg="#000716",
    highlightthickness=0
)
entry_r.place(
    x=465.7030405195145,
    y=103.2784423828125,
    width=130.00917338851991,
    height=20.99999918559456
)



#Entry s

entry_image_s = PhotoImage(
    file=relative_to_assets("entry_1.png"))
entry_qg_s = canvas.create_image(
    712.7078713543997,
    115.77844197560978,
    image=entry_image_s
)
entry_s = Entry(
    bd=0,
    bg="#FFFFFF",
    fg="#000716",
    highlightthickness=0
)
entry_s.place(
    x=650.7032846601395,
    y=103.2784423828125,
    width=130.00917338852037,
    height=20.99999918559456
)


nose=canvas.create_text(
    385.9999159267172,
    210.9999999954648,
    anchor="nw",
    text="Operaciones\n",
    fill="#FFFFFF",
    font=("BreeSerif Regular", 20 * -1)
)

P1=canvas.create_text(
    92.9999159267172,
    70.9999999954648,
    anchor="nw",
    text="Premisa 1 (p)\n",
    fill="#FFFFFF",
    font=("BreeSerif Regular", 20 * -1)
)

P2=canvas.create_text(
    275.9999159267172,
    70.9999999954648,
    anchor="nw",
    text="Premisa 2 (q)\n",
    fill="#FFFFFF",
    font=("BreeSerif Regular", 20 * -1)
)

P3=canvas.create_text(
    469.9999159267172,
    70.9999999954648,
    anchor="nw",
    text="Premisa 3 (r)\n",
    fill="#FFFFFF",
    font=("BreeSerif Regular", 20 * -1)
)

P4=canvas.create_text(
    652.9999159267172,
    70.9999999954648,
    anchor="nw",
    text="Premisa 4 (s)\n",
    fill="#FFFFFF",
    font=("BreeSerif Regular", 20 * -1)
)

canvas.create_text(
 15.26749405171722,
    13.188110342797017,
    anchor="nw",
    text="Proposiciones Moleculares",
    fill="#E5E5E5",
    font=("BreeSerif Regular", 16 * -1)
)



entry_operacion_image = PhotoImage(
    file=relative_to_assets("entry_6.png"))
entry_qg_operacion_image = canvas.create_image(
    300.7078713543997,
    390.77844197560978,
    image=entry_operacion_image
)
entry_operacion = Entry(
    bd=0,
    bg="#FFFFFF",
    fg="#000716",
    highlightthickness=0
)
entry_operacion.place(
    x=120.7032846601395,
    y=377.2784423828125,
    width=355.00917338852037,
    height=20.99999918559456
)




mostrar_resultado_image = PhotoImage(
    file=relative_to_assets("entry_6.png"))
mostrar_bg_resultado_image = canvas.create_image(
    430.7078713543997,
    530.77844197560978,
    image=mostrar_resultado_image
)
mostrar_resultado = Entry(
    bd=0,
    bg="#FFFFFF",
    fg="#000716",
    highlightthickness=0
)
mostrar_resultado.place(
    x=250.49991593607353,
    y=518.99999998128737,
    width=340.99999998231647,
    height=20.000000018712626
)

resultado=canvas.create_text(
    340.99991592671722,
    480.99999999565534,
    anchor="nw",
    text="Lenguaje Natural\n",
    fill="#FFFFFF",
    font=("BreeSerif Regular", 24 * -1)
)



image_image_1 = PhotoImage(
    file=relative_to_assets("image_1.png"))
image_1 = canvas.create_image(
    430.9999159267172,
    625.9999999966844,
    image=image_image_1
)



#Botones


#Botom limpiar  
limpiar_image = PhotoImage(
    file=relative_to_assets("limpiar.png"))
limpiar = Button(
    image=limpiar_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: limpiar(),
    relief="flat"
)
limpiar.place(
    x=410.0,
    y=140.0,
    width=110.0,
    height=41.0
)


random_image = PhotoImage(
    file=relative_to_assets("random.png"))
random_1 = Button(
    image=random_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: llenadorandom(entry_operacion),
    relief="flat"
)
random_1.place(
    x=500.0,
    y=366.0,
    width=110.0,
    height=41.0
)

random2_image = PhotoImage(
    file=relative_to_assets("random.png"))
random_2 = Button(
    image=random2_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: crear_premisas_aleatorias(),
    relief="flat"
)
random_2.place(
    x=300.0,
    y=140.0,
    width=110.0,
    height=41.0
)

#Boton bicondicional

bicondicional_image = PhotoImage(
    file=relative_to_assets("bicondicional.png"))
bicondicional= Button(
    image=bicondicional_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: entry_operacion.insert(len(entry_operacion.get()),"↔"),
    relief="flat"
)
bicondicional.place(
    x=103.0,
    y=260.0,
    width=150.0,
    height=41.0
)



#Boton conjuncion

conjuncion_image = PhotoImage(
    file=relative_to_assets("conjuncion.png"))
conjuncion= Button(
    image=conjuncion_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: entry_operacion.insert(len(entry_operacion.get()),"∧"),
    relief="flat"
)
conjuncion.place(
    x=255.0,
    y=260.0,
    width=150.0,
    height=41.0
)

#Boton disyuncion
disyuncion_image = PhotoImage(
    file=relative_to_assets("disyuncion.png"))
disyuncion= Button(
    image=disyuncion_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: entry_operacion.insert(len(entry_operacion.get()),"v"),
    relief="flat"
)
disyuncion.place(
    x=405.0,
    y=260.0,
    width=150.0,
    height=41.0
)


#Boton condicional

condicional_image = PhotoImage(
    file=relative_to_assets("condicional.png"))
condicional= Button(
    image=condicional_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: entry_operacion.insert(len(entry_operacion.get()),"→"),
    relief="flat"
)
condicional.place(
    x=552.0,
    y=260.0,
    width=150.0,
    height=41.0
)

#Boton  Negacion
negacion_image = PhotoImage(
    file=relative_to_assets("negacion.png"))
negacion= Button(
    image=negacion_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: entry_operacion.insert(len(entry_operacion.get()),"¬"),
    relief="flat"
)
negacion.place(
    x=108.0,
    y=310.0,
    width=130.0,
    height=41.0
)



#Boton p
p_image = PhotoImage(
    file=relative_to_assets("p.png"))
p= Button(
    image=p_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: mostrar_operacion("p",entry_p.get()),
    relief="flat"
)
p.place(
    x=250.0,
    y=310.0,
    width=78.0,
    height=41.0
)

#Boton q
q_image = PhotoImage(
    file=relative_to_assets("q.png"))
q= Button(
    image=q_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: mostrar_operacion("q",entry_q.get()),
    relief="flat"
)
q.place(
    x=350.0,
    y=310.0,
    width=78.0,
    height=41.0
)


#Boton r
r_image = PhotoImage(
    file=relative_to_assets("r.png"))
r= Button(
    image=r_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: mostrar_operacion("r",entry_r.get()),
    relief="flat"
)
r.place(
    x=450.0,
    y=310.0,
    width=78.0,
    height=41.0
)



#Boton s
s_image = PhotoImage(
    file=relative_to_assets("s.png"))
s= Button(
    image=s_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: mostrar_operacion("s",entry_s.get()),
    relief="flat"
)
s.place(
    x=555.0,
    y=310.0,
    width=78.0,
    height=41.0
)

#Boton Operar
operar_image = PhotoImage(
    file=relative_to_assets("operar.png"))
boton_operar= Button(
    image=operar_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: operar(entry_operacion.get(),lista_premisas) ,
    relief="flat"
)
boton_operar.place(
    x=556.0,
    y=408.0,
    width=90.0,
    height=41.0
)

#Boton Reiniciar
reset=""
reiniciar_image = PhotoImage(
    file=relative_to_assets("reiniciar.png"))
reiniciar= Button(
    image=reiniciar_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: borrar_operacion(),
    relief="flat"
)
reiniciar.place(
    x=608.0,
    y=366.0,
    width=90.0,
    height=41.0
)


lista_negados=[]
lista_premisas=[]
resultado=[]
auxiliar=[]
conjunto_actual=set()     

bandera=0
def operar(entry_operacion,lista):
    global lista_premisas
    global bandera
    aux=""
    if bandera==0:
        resultados(entry_operacion,lista)
        aux=entry_operacion
        nose=bandera
        bandera+=1
        

tam=0


def limpiar():
    global resultado
    global conjunto_resultado
    global conjunto_actual
    global auxiliar
    global lista_premisas
    global listica
    global lista_negados
    resultado=[]
   
    entry_p.delete(0,"end")
    entry_q.delete(0,"end")
    entry_r.delete(0,"end")
    entry_s.delete(0,"end")
    entry_operacion.delete(0,"end")
    mostrar_resultado.delete(0,"end")
    lista_premisas=[]
    resultado=[]
    auxiliar=[]
    conjunto_actual=set()
    listica=[]
    lista_negados=[]
      
            

def llenadorandom(entry):
    global lista_premisas
    operadores=["→","v","∧","↔"]
    preposiciones=["p","q","r","s"]
    entrys=[entry_p.get(),entry_q.get(),entry_r.get(),entry_s.get()]
    cadena=""
    xd=0
    band=0
    lol=0
    for i in range(2):
        x=random.randint(0,len(preposiciones)-1)
        h=random.randint(0,1)
        if h==1:
            cadena+="¬"+preposiciones[x]
            if xd==0:
                lista_premisas.append("Es falso que "+entrys[x])
                lol+=1
                xd=1
            else:
                lista_premisas.append("es falso que "+entrys[x])
                lol+=1
            entrys.pop(x)
            preposiciones.pop(x)
        
        else:
            cadena+=preposiciones[x]
            lista_premisas.append(entrys[x])
            preposiciones.pop(x)
            entrys.pop(x)
            xd=1
            lol+=1
        if band==0:
            y=random.randint(0,len(operadores)-1)
            cadena+=" "+operadores[y]+" "
            band=1
        
            
    cadena+=")"
    for m in range(2):
        y=random.randint(0,len(operadores)-1)
        cadena+=" "+operadores[y]+" "
        x=random.randint(0,len(preposiciones)-1)
        h=random.randint(0,1)
        if h==1:
            cadena+="¬"+preposiciones[x]
            if xd==0:
                lista_premisas.append("Es falso que "+entrys[x])
                lol+=1
                xd=1
            else:
                lista_premisas.append("es falso que "+entrys[x])
                lol+=1
            entrys.pop(x)
            preposiciones.pop(x)
        
        else:
            cadena+=preposiciones[x]
            lista_premisas.append(entrys[x])
            preposiciones.pop(x)
            entrys.pop(x)
            xd=1
            lol+=1
        
        cadena+=")"     
        
        
        
    entry.delete(0, "end")
    entry.insert(0, "("+cadena)
  

#Clase Conjunto

class preposicion:
    letra=str()
    def __init__(self,letra=str(),enunciado=None):
        if enunciado is None:
            enunciado=""
        self.letra=letra
 

 
    
def mostrar_operacion(simbolo,entry):
    prepo=preposicion(simbolo, entry)
    lista_premisas.append(entry)
    lista_negados.append("es falso que "+entry)
    entry_operacion.insert(len(entry_operacion.get()),simbolo)

def borrar_operacion():
    global resultado
    global conjunto_resultado
    global conjunto_actual
    global auxiliar
    global bandera
    global lista_premisas
    lista_premisas=[]
    bandera=0
    conjunto_resultado=[]
    resultado=[]
    auxiliar=[]
    conjunto_actual=set()
    entry_operacion.delete(0,"end")
    mostrar_resultado.delete(0,"end")
    

def resultados(texto, lista_premisas):
    operadores = {"→","v","∧","↔"}
    mostrar_resultado.delete(0,"end")
    global resultado
    global conjunto_actual
    global auxiliar
    global conjunto_resultado
    global lista_negados
    conjunto_resultado=[]
    conjunto_actual = set()
    operacion_actual = '∧'  
    auxiliar = []
    valor_bandera = True
    conjunto_temporal=[]
    x = 0
    y=0
    resultado = ""
    for elemento in texto:
        if elemento.isalpha() and elemento not in operadores and valor_bandera==True:  
            if elemento=="¬": 
                auxiliar.append("Es falso que "+lista_premisas[x])
                valor_bandera=False
                x+=1
            else:
                auxiliar.append(lista_premisas[x])
                x += 1
                valor_bandera=False
            
        
        elif elemento in operadores:  
            operacion_actual = elemento
            valor_bandera=True
        elif elemento == '(':  
            auxiliar = []
        elif elemento == ')':  
            resultado = ejecucion_operacion(auxiliar, operacion_actual)
            auxiliar.append(resultado)
    
    
    mostrar_resultado.insert(0,f"{resultado}")
    resultado=[]
    auxiliar=[]
    conjunto_actual=set()
    
    x = 0
    
    
    
universo=[]
  
def ejecucion_operacion(lista_premisas, operacion_actual):
    global universo 
    global conjunto_resultado
    global resultado
    
    conjunto_resultado = []
    
    if(operacion_actual == "∧"):
        resultado=lista_premisas[-2] +" y "+lista_premisas[-1]
        return resultado
    
    elif(operacion_actual == "v"):
        resultado=lista_premisas[-2] +" o "+lista_premisas[-1]
        return resultado
    
    elif(operacion_actual == "→"):
        resultado=lista_premisas[-2] +" solo si "+lista_premisas[-1]
        return resultado
    
    elif(operacion_actual == "↔"):
        resultado=lista_premisas[-2] +" solo y solo si "+lista_premisas[-1]
        return resultado


def crear_premisas_aleatorias():
    entry_p.delete(0,"end")
    entry_q.delete(0,"end")
    entry_s.delete(0,"end")
    entry_r.delete(0,"end")
    
    posibles_premisas = [
        "El gato maulla",
        "Hace calor",
        "Hay nubes",
        "El perro ladra",
        "El cielo es azul",
        "Las hojas son verdes",
        "El sol brilla",
        "La luna es blanca",
        "Los pájaros cantan",
        "El agua es transparente",
        "Messi juega futbol",
        "Manu programa"
    ]
    
    x=random.randint(0,len(posibles_premisas)-1)
    entry_p.insert(0,posibles_premisas[x])
    posibles_premisas.pop(x)
    x=random.randint(0,len(posibles_premisas)-1)
    entry_q.insert(0,posibles_premisas[x])
    posibles_premisas.pop(x)
    x=random.randint(0,len(posibles_premisas)-1)
    entry_r.insert(0,posibles_premisas[x])
    posibles_premisas.pop(x)
    x=random.randint(0,len(posibles_premisas)-1)
    entry_s.insert(0,posibles_premisas[x])
    posibles_premisas.pop(x)
    
        
        
    
        

window.resizable(False, False)
window.mainloop()
