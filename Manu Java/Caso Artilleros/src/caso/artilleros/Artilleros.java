import java.util.Scanner;

public class Artilleros {

    public static void main(String[] args) {
        Scanner lol=new Scanner(System.in);
        int i;
        System.out.print("Indique el numero de Artilleros: ");
        i=lol.nextInt();
        double acertaron=0;
        for (int j = 0; j <i; j++) {
            System.out.println("\nIndique los datos del Artillero: ");
            String nombre="";
            double angulo,velinicial,distancia,radianes=0.0;
            double velocidadx,velocidady,tiempo,alturaproyectil,aceleracion=0.0;
            System.out.print("Nombre del Artillero: ");
            nombre=lol.next();
            System.out.print("Angulo del disparo: ");
            angulo= lol.nextDouble();
            System.out.print("Velocidad del disparo: ");
            velinicial= lol.nextDouble();
            System.out.print("Distancia desde el pro disparo al blanco: ");
            distancia=lol.nextDouble();

            radianes= (Math.PI*angulo)/180;
            velocidadx=velinicial*Math.cos(radianes);
            velocidady=velinicial*Math.sin(radianes);
            tiempo= distancia/velocidadx;
            aceleracion=9.8;
            alturaproyectil= (velocidady*tiempo)-((aceleracion*Math.pow(tiempo, 2)/2));
        
            String estatus="";
            double A,B=0.0;
            A=alturaproyectil;
            B=20;
            
            if ((A<=B)&&(A>0)){
                if((A>9.1)&&(A<10.9)){
                    estatus="Si pego, y dio en el centro del blanco";
                }
                else{
                    estatus="Si pego en el blanco";
                }
                acertaron+=1;
            }
            else if(A<=0){
                estatus="No pego, cayo antes del blanco";
            }
            else if(A>B){
                estatus="No pego, cayo despues del blanco";
            }
            System.out.println("\nEl artillero "+nombre+" "+estatus);       
        }
        double porcentaje;
        porcentaje= ((acertaron/i)*100);
        System.out.println("\nEl % de Artillero que acertaron fue de: "+porcentaje+"%");
        System.out.println("Fin del programa.");
    }
    
}
