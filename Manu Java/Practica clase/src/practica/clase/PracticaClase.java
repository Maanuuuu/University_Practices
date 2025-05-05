
package practica.clase;

public class PracticaClase {

    public static void main(String[] args) {
        int v[]={8,3,4,2,7};
        int num1=v[0];
        int num2=v[1];
        for (int i = 0; i < v.length; i++) {
            if((num2<num1)){
            v[i]=num2;
            v[i+1]=num1;
            }
        System.out.print(v[i]+","+v[i+1]+" - ");
    
        }
            
        }
        
    
    
}
