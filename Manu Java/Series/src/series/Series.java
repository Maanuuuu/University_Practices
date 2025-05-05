
package series;
import java.util.Scanner;

public class Series {
    
    public static void main(String[] args){
        Scanner lol = new Scanner(System.in);
        double x,y,epsilon,s,sig,ant;
        int n;
        System.out.print("De el valor de x: ");
        x=lol.nextDouble();
        System.out.print("De el valor de y: ");
        y=lol.nextDouble();
        System.out.print("De el valor de epsilon: ");
        epsilon=lol.nextDouble();
        System.out.print("De el valor de N: ");
        n=lol.nextInt();
        System.out.println("\nTerminos de la serie");
        sig=ant=s=0;
        int i=0;
        while (i<n) {
            if ((n-i)==0){
                sig=0;
                i++;
            }
            else{
                ant=sig;
                sig=0;
                sig= Math.pow(-1, i+1)*((Math.pow(x, i+1)*(Math.pow(y, n-i))/(n-i)));
                s+=sig;
                i++;
                
            }
            System.out.println("Termino "+(i)+": "+sig);
        }
        System.out.println("\nS = "+s);
        System.out.println("Fin del programa.");  
    

    }
}
