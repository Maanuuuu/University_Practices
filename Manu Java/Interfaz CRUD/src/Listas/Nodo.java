package Listas;


public class Nodo {
    
    Object valor;
    Nodo siguiente;
    
    public Nodo(Object valor){
        this.valor=valor;
        this.siguiente=null;
    }
    
    public Object getValor(){
        return valor;
    }
    
    public void EnlazarSiguiente(Nodo n){
        siguiente=n;
            
    }
    
    public Nodo getSiguiente(){
        return siguiente;
    }
    
   
    
    
}            
          
            
            
            
       
    

