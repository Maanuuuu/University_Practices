from pathlib import Path

import random
from tkinter import Tk, Canvas, Entry, Text, Button, PhotoImage,messagebox
import tkinter as tk
import matplotlib.pyplot as plt
from matplotlib_venn import venn3, venn2

OUTPUT_PATH = Path(__file__).parent
ASSETS_PATH = OUTPUT_PATH / Path(r"C:\Users\manue\OneDrive\Escritorio\Programación\Interfaz Conjuntos\build\assets\frame0")


def relative_to_assets(path: str) -> Path:
    return ASSETS_PATH / Path(path)


window = Tk()
window.title("Interfaz Conjuntos")
window.geometry("852x680")
window.configure(bg = "#715BFF")

canvas = Canvas(
    window,
    bg = "#725CFE",
    height = 702,
    width = 852,
    bd = 0,
    highlightthickness = 0,
    relief = "ridge"
)

canvas.place(x = 0, y = 0)


canvas.create_rectangle(
    741.6420316323183,
    231.0535608000789,
    807.2118948820189,
    260.0729787342875,
    fill="#715BFF",
    outline="")


#Entry Universo

entry_image_U = PhotoImage(
    file=relative_to_assets("entry_5.png"))
entry_bg_U = canvas.create_image(
    318.49991592723177,
    91.49999999064369,
    image=entry_image_U
)
entry_U = Entry(
    bd=0,
    bg="#FFFFFF",
    fg="#000716",
    highlightthickness=0
)
entry_U.place(
    x=86.49991593607353,
    y=77.99999998128737,
    width=463.99999998231647,
    height=21.000000018712626
)

canvas.create_text(
    404.9999159267172,
    34.99999999691295,
    anchor="nw",
    text="Universo\n",
    fill="#FFFFFF",
    font=("BreeSerif Regular", 20 * -1)
)


#Entry A

entry_image_A = PhotoImage(
    file=relative_to_assets("entry_4.png"))
entry_bg_A = canvas.create_image(
    152.70762721377446,
    215.77844197560978,
    image=entry_image_A
)
entry_A = Entry(
    bd=0,
    bg="#FFFFFF",
    fg="#000716",
    highlightthickness=0
)
entry_A.place(
    x=86.7030405195145,
    y=203.2784423828125,
    width=130.00917338851991,
    height=20.99999918559456
)

canvas.create_text(
    142.91007217671722,
    172.2784423828125,
    anchor="nw",
    text="A\n",
    fill="#FFFFFF",
    font=("BreeSerif Regular", 20 * -1)
)



#Entry B

entry_image_B = PhotoImage(
    file=relative_to_assets("entry_3.png"))
entry_bg_B = canvas.create_image(
    335.70762721377446,
    215.77844197560978,
    image=entry_image_B
)
entry_B = Entry(
    bd=0,
    bg="#FFFFFF",
    fg="#000716",
    highlightthickness=0
)
entry_B.place(
    x=268.7030405195145,
    y=203.2784423828125,
    width=130.00917338851991,
    height=20.99999918559456
)

canvas.create_text(
    325.9100721767172,
    172.2783203125,
    anchor="nw",
    text="B\n",
    fill="#FFFFFF",
    font=("BreeSerif Regular", 20 * -1)
)



#Entry C

entry_image_C = PhotoImage(
    file=relative_to_assets("entry_2.png"))
entry_bg_C = canvas.create_image(
    530.7076272137745,
    215.77844197560978,
    image=entry_image_C
)
entry_C = Entry(
    bd=0,
    bg="#FFFFFF",
    fg="#000716",
    highlightthickness=0
)
entry_C.place(
    x=465.7030405195145,
    y=203.2784423828125,
    width=130.00917338851991,
    height=20.99999918559456
)

canvas.create_text(
    520.9098280360922,
    172.2783203125,
    anchor="nw",
    text="C\n",
    fill="#FFFFFF",
    font=("BreeSerif Regular", 20 * -1)
)


#Entry D

entry_image_D = PhotoImage(
    file=relative_to_assets("entry_1.png"))
entry_bg_D = canvas.create_image(
    712.7078713543997,
    215.77844197560978,
    image=entry_image_D
)
entry_D = Entry(
    bd=0,
    bg="#FFFFFF",
    fg="#000716",
    highlightthickness=0
)
entry_D.place(
    x=650.7032846601395,
    y=203.2784423828125,
    width=130.00917338852037,
    height=20.99999918559456
)

canvas.create_text(
    705.9100721767172,
    172.2783203125,
    anchor="nw",
    text="D",
    fill="#FFFFFF",
    font=("BreeSerif Regular", 20 * -1)
)



nose=canvas.create_text(
    385.9999159267172,
    260.9999999954648,
    anchor="nw",
    text="Operaciones\n",
    fill="#FFFFFF",
    font=("BreeSerif Regular", 20 * -1)
)

canvas.create_text(
    385.9999159267172,
    131.9999999954648,
    anchor="nw",
    text="Subconjuntos\n",
    fill="#FFFFFF",
    font=("BreeSerif Regular", 20 * -1)
)


canvas.create_text(
 28.26749405171722,
    13.188110342797017,
    anchor="nw",
    text="Conjuntos Numéricos",
    fill="#E5E5E5",
    font=("BreeSerif Regular", 16 * -1)
)



entry_operacion_image = PhotoImage(
    file=relative_to_assets("entry_6.png"))
entry_bg_operacion_image = canvas.create_image(
    322.7078713543997,
    420.77844197560978,
    image=entry_operacion_image
)
entry_operacion = Entry(
    bd=0,
    bg="#FFFFFF",
    fg="#000716",
    highlightthickness=0
)
entry_operacion.place(
    x=145.7032846601395,
    y=408.2784423828125,
    width=355.00917338852037,
    height=20.99999918559456
)


canvas.create_text(
    582.9999159267172,
    465.99999999237775,
    anchor="nw",
    text="Diagrama de Venn",
    fill="#FFFFFF",
    font=("BreeSerif Regular", 24 * -1)
)

mostrar_resultado_image = PhotoImage(
    file=relative_to_assets("entry_6.png"))
mostrar_bg_resultado_image = canvas.create_image(
    273.7078713543997,
    515.77844197560978,
    image=mostrar_resultado_image
)
mostrar_resultado = Entry(
    bd=0,
    bg="#FFFFFF",
    fg="#000716",
    highlightthickness=0
)
mostrar_resultado.place(
    x=93.49991593607353,
    y=502.99999998128737,
    width=340.99999998231647,
    height=20.000000018712626
)

resultado=canvas.create_text(
    220.99991592671722,
    465.99999999565534,
    anchor="nw",
    text="Resultado\n",
    fill="#FFFFFF",
    font=("BreeSerif Regular", 24 * -1)
)


canvas.create_text(
    404.9999159267172,
    34.99999999691295,
    anchor="nw",
    text="Universo\n",
    fill="#FFFFFF",
    font=("BreeSerif Regular", 20 * -1)
)



#Botones


image_image_1 = PhotoImage(
    file=relative_to_assets("image_1.png"))
image_1 = canvas.create_image(
    460.9999159267172,
    625.9999999966844,
    image=image_image_1
)

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
    x=568.0,
    y=68.0,
    width=110.0,
    height=41.0
)


random_image = PhotoImage(
    file=relative_to_assets("random.png"))
random_1 = Button(
    image=random_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: abrir_ventana_secundaria(),
    relief="flat"
)
random_1.place(
    x=680.0,
    y=68.0,
    width=110.0,
    height=41.0
)

#Boton Union

union_image = PhotoImage(
    file=relative_to_assets("union.png"))
union= Button(
    image=union_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: entry_operacion.insert(len(entry_operacion.get()),"U"),
    relief="flat"
)
union.place(
    x=130.0,
    y=310.0,
    width=110.0,
    height=41.0
)



#Boton Interseccion

interseccion_image = PhotoImage(
    file=relative_to_assets("interseccion.png"))
interseccion= Button(
    image=interseccion_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: entry_operacion.insert(len(entry_operacion.get()),"∩"),
    relief="flat"
)
interseccion.place(
    x=260.0,
    y=310.0,
    width=150.0,
    height=41.0
)

#Boton Diferencia
diferencia_image = PhotoImage(
    file=relative_to_assets("diferencia.png"))
diferencia= Button(
    image=diferencia_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: entry_operacion.insert(len(entry_operacion.get()),"-"),
    relief="flat"
)
diferencia.place(
    x=415.0,
    y=310.0,
    width=130.0,
    height=41.0
)


#Boton Complemento

complemento_image = PhotoImage(
    file=relative_to_assets("complemento.png"))
complemento= Button(
    image=complemento_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: entry_operacion.insert(len(entry_operacion.get()),"'"),
    relief="flat"
)
complemento.place(
    x=552.0,
    y=310.0,
    width=150.0,
    height=41.0
)

#Boton (
parentesis1_image = PhotoImage(
    file=relative_to_assets("parentesis1.png"))
parentesis1= Button(
    image=parentesis1_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: entry_operacion.insert(len(entry_operacion.get()),"("),
    relief="flat"
)
parentesis1.place(
    x=130.0,
    y=350.0,
    width=48.0,
    height=41.0
)

#Boton )
parentesis2_image = PhotoImage(
    file=relative_to_assets("parentesis2.png"))
parentesis2= Button(
    image=parentesis2_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: entry_operacion.insert(len(entry_operacion.get()),")"),
    relief="flat"
)
parentesis2.place(
    x=192.0,
    y=350.0,
    width=48.0,
    height=41.0
)

#Boton A
botonA_image = PhotoImage(
    file=relative_to_assets("A.png"))
botonA= Button(
    image=botonA_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: mostrar_operacion("A",entry_A.get()),
    relief="flat"
)
botonA.place(
    x=260.0,
    y=350.0,
    width=78.0,
    height=41.0
)

#Boton B
botonB_image = PhotoImage(
    file=relative_to_assets("B.png"))
botonB= Button(
    image=botonB_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: mostrar_operacion("B",entry_B.get()),
    relief="flat"
)
botonB.place(
    x=350.0,
    y=350.0,
    width=78.0,
    height=41.0
)


#Boton C
botonC_image = PhotoImage(
    file=relative_to_assets("C.png"))
botonC= Button(
    image=botonC_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: mostrar_operacion("C",entry_C.get()),
    relief="flat"
)
botonC.place(
    x=450.0,
    y=350.0,
    width=78.0,
    height=41.0
)



#Boton D
botonD_image = PhotoImage(
    file=relative_to_assets("D.png"))
botonD= Button(
    image=botonD_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: mostrar_operacion("D",entry_D.get()),
    relief="flat"
)
botonD.place(
    x=555.0,
    y=350.0,
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
    command=lambda: operar(entry_operacion.get(),lista_subconjuntos) ,
    relief="flat"
)
boton_operar.place(
    x=518.0,
    y=396.0,
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
    y=396.0,
    width=90.0,
    height=41.0
)


#Boton Diagrama de Venn

venn_image = PhotoImage(
    file=relative_to_assets("venn.png"))
boton_venn= Button(
    image=venn_image,
    borderwidth=0,
    highlightthickness=0,
    command=lambda: diagrama_venn(lista_subconjuntos),
    relief="flat"
)
boton_venn.place(
    x=575.0,
    y=500.0,
    width=200.0,
    height=65.0
)

lista_subconjuntos=[]
resultado=[]
auxiliar=[]
conjunto_actual=set()     

bandera=0
def operar(entry_operacion,lista):
    global lista_subconjuntos
    global bandera
    aux=""
    if bandera==0:
        resultados(entry_operacion,lista)
        aux=entry_operacion
        nose=bandera
        bandera+=1
        
    else:
        print("") 
        
entry_U.config(font=("BreeSerif Regular",10))
tam=0

def abrir_ventana_secundaria():
    
    # Crear una ventana secundaria.
    ventana_secundaria = tk.Toplevel()
    ventana_secundaria.title("Tamaño universo")
    ventana_secundaria.focus()
    
    entrada = tk.Entry(ventana_secundaria)
    entrada.place(x=90, y=80, width=100, height=30)
    ventana_secundaria.geometry("300x200")
    ventana_secundaria.configure(bg = "#715BFF")
    ventana_secundaria.focus()
    
    etiqueta=tk.Label(ventana_secundaria,text="Ingrese el tamaño del universo (5-20)",bg="#715BFF",font=("Roboto",12),fg="white")
    etiqueta.place(x=20,y=40)
    
    listo=Button(ventana_secundaria,text="Listo",width=8,command=lambda: botonlisto())
    listo.place(x=230,y=170)
    ventana_secundaria.resizable("False","False")
    
    def botonlisto():
        try: 
            if int(entrada.get())>4 and int(entrada.get())<21:
                global tam 
                tam=int(entrada.get())   
                llenadorandom(entry_U,tam)
                random_subconjuntos(entry_A)
                random_subconjuntos(entry_B)
                random_subconjuntos(entry_C)
                random_subconjuntos(entry_D)
                ventana_secundaria.destroy()
            else:
                messagebox.askretrycancel(message="Ingrese un numero de 5 a 20", title="Error")
                ventana_secundaria.focus()
                
        except ValueError:
            messagebox.askretrycancel(message="Inserte un numero", title="Título")
            ventana_secundaria.focus()


def limpiar():
    global resultado
    global conjunto_resultado
    global conjunto_actual
    global auxiliar
    global lista_subconjuntos
    global listica
    resultado=[]
    entry_U.delete(0,"end")
    entry_A.delete(0,"end")
    entry_B.delete(0,"end")
    entry_C.delete(0,"end")
    entry_D.delete(0,"end")
    entry_operacion.delete(0,"end")
    mostrar_resultado.delete(0,"end")
    lista_subconjuntos=[]
    resultado=[]
    auxiliar=[]
    conjunto_actual=set()
    listica=[]

      
            
listica=[]
def llenadorandom(entry,tam):
    global listica
    listica = [random.randint(1, 100) for _ in range(tam)]
    cadena=""
    for i in range(len(listica)):
        if i==len(listica)-1:
            cadena+=f"{listica[i]}"
        else:
            cadena+= f"{listica[i]}"+","
    entry.delete(0, "end")
    entry.insert(0, cadena)
  

#Clase Conjunto

class Subconjunto:
    letra=str()
    def __init__(self,letra=str(),lista=None):
        if lista is None:
            lista=[]
        self.conjunto=set(lista)
        self.letra=letra
 

 
    
def mostrar_operacion(simbolo,entry_subconjunto):
    subconjunto=Subconjunto(simbolo, entry_subconjunto.split(","))
    lista_subconjuntos.append(subconjunto)
    entry_operacion.insert(len(entry_operacion.get()),simbolo)

def borrar_operacion():
    global resultado
    global conjunto_resultado
    global conjunto_actual
    global auxiliar
    global bandera
    global lista_subconjuntos
    lista_subconjuntos=[]
    bandera=0
    conjunto_resultado=[]
    resultado=[]
    auxiliar=[]
    conjunto_actual=set()
    entry_operacion.delete(0,"end")
    mostrar_resultado.delete(0,"end")
    

def resultados(texto, lista_subconjuntos):
    operadores = {"U", "∩", "'", "-"}
    mostrar_resultado.delete(0,"end")
    global resultado
    global conjunto_actual
    global auxiliar
    global conjunto_resultado
    conjunto_resultado=[]
    conjunto_actual = set()
    operacion_actual = 'U'  
    auxiliar = []
    valor_bandera = True
    
    x = 0


    for elemento in texto:
        if elemento.isalpha() and elemento not in operadores:  
            auxiliar.append(lista_subconjuntos[x].conjunto)
            x += 1
        elif elemento in operadores:  
            operacion_actual = elemento
        elif elemento == '(':  
            auxiliar = []
        elif elemento == ')':  
            conjunto_actual = ejecucion_operacion(auxiliar, operacion_actual)
            auxiliar.append(list(conjunto_actual))
    
    resultado = ""
    actual=list(conjunto_actual)
    actual.sort()
    for i in range(len(actual)):
        if i+1==len(actual):
            resultado+=f"{(actual[i])}"
        else:
            resultado+= f"{(actual[i])}"+","
            
    if actual==[]:
        resultado="Ø"       
    mostrar_resultado.insert(0,f"{resultado}")
    resultado=[]
    auxiliar=[]
    conjunto_actual=set()
    
    x = 0
    
    
    
universo=[]
  
def ejecucion_operacion(lista_subconjuntos, operacion_actual):
    global universo 
    global conjunto_resultado
    
    lista_universal = entry_U.get().split(",")
    conjunto_resultado = []
    
    if(operacion_actual == "U"):
        conjunto_resultado = set(lista_subconjuntos[-1]) | set(list(lista_subconjuntos[-2]))
        return conjunto_resultado
    
    elif(operacion_actual == "∩"):
        conjunto_resultado = set(lista_subconjuntos[-1]) & set(lista_subconjuntos[-2])
        return conjunto_resultado
    
    elif(operacion_actual == "'"):
        conjunto_resultado = set(lista_universal) - set(lista_subconjuntos[-1])
        return conjunto_resultado
    
    elif(operacion_actual == "-"):
        conjunto_resultado = set(lista_subconjuntos[-2]) - set(lista_subconjuntos[-1])
        return conjunto_resultado
     

def diagrama_venn(lista_subconjuntos):
    
    if len(lista_subconjuntos)==2:
        set1=set(lista_subconjuntos[0].conjunto)
        set2=set(lista_subconjuntos[1].conjunto)
        plt.figure(figsize=(4,4))
        plt.title("Diagrama de Venn")
        venn2([set1,set2], (lista_subconjuntos[0].letra, lista_subconjuntos[1].letra))
        plt.show()
        
    elif len(lista_subconjuntos)==3:
        set1=set(lista_subconjuntos[0].conjunto)
        set2=set(lista_subconjuntos[1].conjunto)
        set3=set(lista_subconjuntos[2].conjunto)
        plt.figure(figsize=(6,6))
        plt.title("Diagrama de Venn")
        venn3([set1,set2,set3], (lista_subconjuntos[0].letra, lista_subconjuntos[1].letra,lista_subconjuntos[2].letra))
        plt.show()
    else:
        messagebox.askretrycancel(message="El Diagrama de Venn solo se muestra para\n un maximo de 3 conjuntos", title="Error")


def random_subconjuntos(entry):
    global listica
    lista=[]
    lol=0
    if len(listica)>6 and len(listica)<=20:
        lol=random.randint(5,18)
    else:
        lol=random.randint(1,4)
        
    num=len(listica)-random.randint(1,lol)
    for x in range(num):
        lista.append(listica[random.randint(0,len(listica)-1)])
        
    cadena=""
    
    for i in range(len(lista)):
        if i==len(lista)-1:
            cadena+=f"{lista[i]}"
        else:
            cadena+= f"{lista[i]}"+","
    entry.delete(0, "end")
    entry.insert(0, cadena)
    lista=[]

        
        

window.resizable(False, False)
window.mainloop()
