package Matriz;

import java.math.BigInteger;
import javax.swing.JFrame;


public class Main {
    
    public static void main(String args[]){
        
        PantallaMatriz panta= new PantallaMatriz();
        panta.setVisible(true);
        panta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        panta.setLocationRelativeTo(null);
    }
    
    
    //Metodo para llenar la matriz
    public static void LlenadoMatriz(int[][] matriz, int i, int j){
        if(i<=matriz.length-1){
            if (j<=matriz.length-1){
                matriz[i][j]=(int) (Math.random()*1000);
                
                LlenadoMatriz(matriz,i,j+1);
            }
            else{
                LlenadoMatriz(matriz,i+1,0);
            }
        }        
    }
    

    //Metodo para determinar la diagonal principal y ordenarla de mayor a menor            
    public static int DiagonalPrincipal(int[][] matriz,int[] diagoprin,int i){
        //Determinamos la diagonal principal
        diagoprin[i]=matriz[i][i];
        if(i!=matriz[0].length-1){
            return DiagonalPrincipal(matriz,diagoprin,i+1);
        }    
        else{
            return 0;
        }
        
    }  
    
    
    public static void ordenar(int[] arreglo, int menor, int mayor) {
        if (menor < mayor) {
            int partitionIndex = particion(arreglo, menor, mayor, menor);

            ordenar(arreglo, menor, partitionIndex - 1);
            ordenar(arreglo, partitionIndex + 1, mayor);
        }
    }

    public static int particion(int[] arreglo, int menor, int high, int index) {
        if (index <= high) {
            if (arreglo[index] > arreglo[menor]) {
                cambio(arreglo, index, menor);
            }
            particion(arreglo, menor, high, index + 1);
        }

        return menor;
    }

    public static void cambio(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    
    
    
    
    public static String MostrarDiagoPrin(int[] diagoprin,String secuencia,int x){
        secuencia+=(diagoprin[x])+" ";
        if (x!=diagoprin.length-1) {
            return MostrarDiagoPrin(diagoprin,secuencia,x+1);
        }
        else{
        return secuencia;
        }
    }
    public static void MayorMatriz(int[][] matriz,int[] mayormatriz,int i,int j){
        if(i<=matriz.length-1){
            if (j<=matriz[0].length-1){
                if(mayormatriz[0]<matriz[i][j]){mayormatriz[0]=matriz[i][j];}
                
                MayorMatriz(matriz,mayormatriz,i,j+1);
            }
            else{
                MayorMatriz(matriz,mayormatriz,i+1,0);
            }
        }
    }
    
    //Metodo para determinar la Diagonal Secundaria
    public static double DiagonalSecundaria(int[][] matriz,int[] diagosec,double sumatoria,int i){
        diagosec[i]=(matriz[i][matriz.length-i-1]);
        sumatoria+=diagosec[i];
        if(i<matriz.length-1){
            return DiagonalSecundaria(matriz,diagosec,sumatoria,i+1);
        }
        else{
        return sumatoria;
        }
    
    }
    
    public static int DeterminarMayor(int[][] matriz,int mayor,int i){
        if(i<=matriz.length-1){  
            if(mayor<matriz[i][matriz.length-1]){
                mayor=matriz[i][matriz.length-1];
            }
        return DeterminarMayor(matriz,mayor,i+1);  
        }
        else{
            return mayor;
        }
    }
    
    public static int DeterminarMenor(int[][] matriz,int menor,int i){
        if(i<=matriz.length-1){  
            if(menor > matriz[i][0] ){
                menor=matriz[i][0];
            }
        return DeterminarMenor(matriz,menor,i+1);  
        }
        else{
            return menor;
        }
    }    
    
    
    //Metodo para mostrar el menor de la primera columna elevado al mayor de la ultima
    public static BigInteger Potencia(BigInteger base, BigInteger exponente){
        if(exponente.compareTo(BigInteger.ZERO)==0){
            return BigInteger.ONE;
        }
        else{
            return (base.multiply(Potencia(base,exponente.subtract(BigInteger.ONE))));
        }
        
    }
    
    //Metodo para mostrar la secuencia de Fibonacci hasta el numero mayor de la matriz
   
   public static String Fibonacci(int n, int a , int b, String secuencia){
        if(a<=n){
            secuencia+=(a+" ");
            return Fibonacci(n,b,b+a,secuencia);
        }
        else{   
            return secuencia;
        }
   }
                                
    
}     
            
            
            
       
    

