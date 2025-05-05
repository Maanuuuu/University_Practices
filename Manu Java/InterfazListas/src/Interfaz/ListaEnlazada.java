package Interfaz;


public class ListaEnlazada {
    
    Nodo cabeza;
    int size;
    
    public ListaEnlazada(){
        cabeza=null;
        size=0;
    }
    
    public void aggPrimero(Object obj){
        if(cabeza==null){
            cabeza=new Nodo(obj);
        }
        else{
            Nodo temp= cabeza;
            Nodo nuevo= new Nodo(obj);
            nuevo.EnlazarSiguiente(temp);
            cabeza=nuevo;
        
        }
        size++;
    
    }
    
    public int getSize(){
        return size;
    }
    
    public Object obtener(int index){
        int contador=0;
        Nodo temporal=cabeza;
        while(contador<index){
            temporal= temporal.getSiguiente();
            contador++;
        }
        return temporal.getValor();
    }
    
    public void eliminar(int index){
        
        if (index==0){
            cabeza=cabeza.getSiguiente();
            
        }
        else{
            int contador=0;
            Nodo temporal= cabeza;
            while(contador<index-1){
                temporal=temporal.getSiguiente();
                contador++;
            }
            temporal.EnlazarSiguiente(temporal.getSiguiente().getSiguiente());
            
        }
        
            
        size--;
        
    }
    
    public int nroletras(String palabra){
        int contador=0;
        char[] caracteres=palabra.toCharArray();
        for (char c: caracteres) {
            contador++;
            
        }      
    return contador;    
    }
    
    public StringBuilder invertir(String palabra){
        StringBuilder invertido=new StringBuilder(palabra).reverse();
        return invertido; 
    }
    
    public StringBuilder minusculas(String palabra){
        StringBuilder minusculas=new StringBuilder();
        char[] caracteres=palabra.toCharArray();
        for(char c: caracteres){
            if(Character.isUpperCase(c)){
                minusculas.append(Character.toLowerCase(c));
            }
            else{minusculas.append(c);}
        }
    return minusculas;   
    }
    
   
        
        
    
    
    
}   
    
