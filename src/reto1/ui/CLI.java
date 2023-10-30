package reto1.ui;

import reto1.process;

import java.util.Scanner;

/**
 * crea un menu para mostrar en consola
 */
public class CLI  {
    public static void mostrarMenu(){
        System.out.println("que operacion deseas hacer?");
        System.out.println("1)suma");
        System.out.println("2)resta");
        System.out.println("3)multiplicacion");
        System.out.println("4)division");
/**
 * define variables para pedircelas  al usuario
 */
        Scanner scanner = new Scanner(System.in);

        int option = scanner.nextInt();scanner.nextLine();

        System.out.println("inserta el valor del primer dato");
        int operando1 =  scanner.nextInt();scanner.nextLine();
        System.out.println("inserta el valor del segundo dato");
        int operando2 =  scanner.nextInt();scanner.nextLine();
        int resultado=-1;
        String operacion ="";
/**
 * dependiendo de el caso elegido crea  su respectivo resultado  mostrando un mensaje en consola
 */
        switch(option) {
            case 1:
                resultado =
                        process.suma(operando1, operando2);
                operacion = "+";
                System.out.printf("El resultado ha sido encontrado es %d %s %d = %d",operando1,operacion,operando2,resultado);
                break;
            case 2:
                resultado =
                        process.resta(operando1, operando2);
                operacion = "-";
                System.out.printf("/033[M"+ "El resultado ha sido encontrado es %d %s %d = %d",operando1,operacion,operando2,resultado);
                break;
            case 3:
                resultado =
                        process.multiplicacion(operando1, operando2);
                operacion = "*";
                System.out.printf("El resultado ha sido encontrado es %d %s %d = %d",operando1,operacion,operando2,resultado);
                break;
            case 4:
                resultado =
                        process.divicion(operando1, operando2);
                operacion = "/";
                System.out.printf("El resultado ha sido encontrado es %d %s %d = %d",operando1,operacion,operando2,resultado);
                break;
            case 5:
                resultado =
                        process.modulo(operando1, operando2);
                operacion = "%";
                System.out.printf("El resultado ha sido encontrado es %d %s %d = %d",operando1,operacion,operando2,resultado);
                break;
        }
    }


}
