import java.util.Scanner;

public class Ejercicio37 {
    static Scanner lt=new Scanner(System.in);
    public static void main(String[] args) {
        //Declarar variable
        int edad;
        double promedio;
        String resBeca;
        //Datos de entrada
        System.out.println("Ingrese la edad");
        edad=lt.nextInt();
        System.out.println("Ingrese el promedio");
        promedio=lt.nextDouble();
        //Proceso
        if (edad>18) {
            if (promedio>=18) {
                resBeca="Le corresponde el monto de 2000";
            }else if (promedio>=15) {
                resBeca="Le corresponde el monto de 1000";
            }else if (promedio<15 && promedio>=12) {
                resBeca="Le corresponde el monto de 500";
            }else {
                resBeca="Enviar una carta para que estudie";
            }
        }else {
            if (promedio>=18) {
                resBeca="Le corresponde el monto de 3000";
            }else if (promedio<18 && promedio>=12) {
                resBeca="Le corresponde el monto de 2000";
            }else if (promedio<16 && promedio>=12) {
                resBeca="Le corresponde el monto de 100";
            }else {
                resBeca="Enviar una carta para que estudie";
            }
         }
         //Datos de Salida
         System.out.println(resBeca);
        }
    }