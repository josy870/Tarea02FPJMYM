import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        double antiguedad, bono_mensual, bono_por_antiguedad, bono_por_sueldo, sueldo;
        System.out.println("Ingrese el sueldo: ");
        sueldo = in.nextDouble();
        System.out.print("Ingresa la antiguedad: ");
        antiguedad = in.nextDouble();
    
        bono_por_antiguedad = 0;
        bono_por_sueldo = 0;

        if(antiguedad>=2 && antiguedad<=5){
            bono_por_antiguedad=sueldo*0.2;
        }else if(antiguedad >= 5){
            bono_por_antiguedad=sueldo*0.3;

        }  
        if(sueldo<=1000){
            bono_por_sueldo=sueldo*0.25;
        }else if(sueldo>1000 && sueldo<=3500){
            bono_por_sueldo=sueldo*0.15;
          
        }else if(sueldo>3500){
            bono_por_sueldo=sueldo*0.1;
        }
        System.out.println("----------------------------");
        System.out.println("Tu sueldo es: " + sueldo);
        System.out.println("----------------------------");
        System.out.println("El bono de antiguedad es: " + bono_por_antiguedad);
        System.out.println("El bono por sueldo es: " + bono_por_sueldo);
    
        if(bono_por_antiguedad > bono_por_sueldo){
          System.out.println("----------------------------");
          System.out.println("El bono que te corresponde es: " + bono_por_antiguedad);
          
        }else{
          System.out.println("----------------------------");
          System.out.println("El bono que te corresponde es: " + bono_por_sueldo);
        }
    
    }
}