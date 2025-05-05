package Interfaz;

import java.math.BigInteger;


public class Main {
    
    public static void main(String args[]){
        
        Pantalla panta= new Pantalla();
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
        
          
    }
    //Metodo para llenar la matriz
    public static int[][] LlenadoMatriz(int num){
        int matriz[][]=new int[num][num];
            String Salidatxt="";
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    matriz[i][j]=(int) (Math.random()*1000);
                }        
            }
        return matriz;
    }
    
    //Metodo para Imprimir la matriz
    public static String ImpresionMatriz(int[][] matriz){
        String Salidatxt="";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                Salidatxt+="   ";
                Salidatxt += String.format("  %03d  ", matriz[i][j]) ;
                Salidatxt+="  ";
                    
            }
        Salidatxt+="\n";
        } 
        
        return Salidatxt;
    }
    //Metodo para determinar la diagonal principal y ordenarla de mayor a menor            
    public static String DiagonalPrincipal(int[][] matriz){
        String secuencia="";
        int[] DiagonalPrincipal=new int[matriz.length];
        //Determinamos la diagonal principal
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i==j){
                    DiagonalPrincipal[i]=matriz[i][j]; 
                }
            }
        }
        //Ordenamos de mayor a menor
        int n = DiagonalPrincipal.length;
        for (int f = 0; f < n-1; f++) {
            for (int j = 0; j < n-f-1; j++) {
                if (DiagonalPrincipal[j] < DiagonalPrincipal[j+1]) {
                    // Intercambio de DiagonalPrincipal[j] y DiagonalPrincipal[j+1]
                    int temp = DiagonalPrincipal[j];
                    DiagonalPrincipal[j] = DiagonalPrincipal[j+1];
                    DiagonalPrincipal[j+1] = temp;
                }
            }
        }
            
        //Agregamos los valores a un String para mostrarse en la interfaz
        for (int j = 0; j < DiagonalPrincipal.length; j++) {
                secuencia+="  "+DiagonalPrincipal[j];      
            }
 
        return secuencia;
    }   
    
    //Metodo para determinar la Diagonal Secundaria
    public static String DiagonalSecundaria(int[][] matriz){
        String DiagoSecundaria="";
        int[] DiagonalSecundaria=new int[matriz.length];
        double suma=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if ((i+j)== matriz.length-1){
                    DiagonalSecundaria[i]=matriz[i][j];
                    //Sumamos los valores de la DS
                    suma+=DiagonalSecundaria[i];
                }
            }
        
        }
        //Determinamos el promedio de la suma de la diagonal secundaria y lo retornamos
        DiagoSecundaria=String.format("  %03.2f  ",(suma/matriz.length));
        return DiagoSecundaria;
    
    }
    
    //Metodo para mostrar el menor de la primera columna elevado al mayor de la ultima
    public static BigInteger Potencia(int[][] matriz){
        int menor;
        int mayor;
        menor=matriz[0][0];
        mayor=matriz[0][matriz.length-1];
        for (int i = 0; i < matriz.length; i++) {
            //Determinamos el numero menor de la primera columna
            if (menor > matriz[i][0] ){
                menor=matriz[i][0];
            }
            //Determinamos el numero mayor de la ultima columna
            else if(mayor<matriz[i][matriz.length-1]){
                mayor=matriz[i][matriz.length-1];
            } 
        }
        //Aplicamos el metodo BigInteger para poder mostrar numeros muy grandes
        BigInteger x= BigInteger.valueOf(menor);
        BigInteger potencia;
        potencia= x.pow(mayor);
        return potencia;
    }
    
    //Metodo para mostrar la secuencia de Fibonacci hasta el numero mayor de la matriz
    public static String Fibonacci(int[][] matriz){
        int mayor=0;
        String secuencia="";
        mayor=matriz[0][matriz.length-1];
        //Determinamos el mayor de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(mayor<matriz[i][j]){
                    mayor=matriz[i][j];  
                }
            }
                
        }
        //Secuencia Fibonacci
        int suma=0;
        int num1=0;
        int num2=1;
        for (int i = 0; num1 <= mayor; i++) {
            secuencia+="  "+num1;
            suma=num1+num2;
            num1=num2;
            num2=suma;
            
        }
    return secuencia;    
    }                          
}            
          
            
            
            
       
    

