import java.util.Scanner;

public class Ejercicio32{
    public static void main(String[] args) throws Exception {
        Scanner lt=new Scanner(System.in);
        double ht,ph,sueldo;
        System.out.println("Ingresar las horas trabajadas: ");
        ht=lt.nextDouble();
        System.out.println("Ingrese el pago por hora");
        ph=lt.nextDouble();
         if (ht>40) {
            sueldo=40*ph+(ht-40)*2*ph;
         } else sueldo=ht*ph;{
             System.out.println("Sueldo semanal: s/"+sueldo);
         }
        }
    }
    