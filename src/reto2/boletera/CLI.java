package reto2.boletera;

import java.util.Scanner;
import java.util.Scanner;
import reto2.boletera.CLI;
import reto2.boletera.process;
import reto2.boletera.Main;

public class CLI {
    /**
     * metodo que  lee  el  tipo de  tiket
     */
    public static void usuario(){
        Scanner input = new Scanner(System.in);
        char ticketType, option;
        short niños = 0, adulto = 0, mayor = 0, getmayorWCard = 0;

        System.out.println("¿Qué tipo de boleto desea comprar?" +
                "\nN) Boleto para niño: $70." +
                "\nA) Boleto para adulto: $100." +
                "\nB) Boleto para adulto mayor: $70" +
                "\nI) Boleto para adulto mayor con credencial INAPAM: %50.");
        do{
            System.out.print("Ingrese el tipo de boleto: ");
            ticketType = input.nextLine().charAt(0);
            switch(ticketType){
                case 'N':
                    ++niños;
                    break;
                case 'A':
                    ++adulto;
                    break;
                case 'B':
                    ++mayor;
                    break;
                case 'I':
                    ++getmayorWCard;
                    break;
                default:
                    System.out.println("Tipo de boleto inválido.");
            }

            System.out.print("¿Desea comprar otro boleto? ");
            option = input.nextLine().charAt(0);
        }while(option == 's');

        System.out.println("Compraste:" +
                "\n" + niños + "boletos para niño: " + niños + "," +
                "\n" + adulto + "boletos para adulto: " + adulto + "," +
                "\n" + mayor + "boletos para adulto mayor: " + mayor + "," +
                "\n" + getmayorWCard + "boletos para adulto mayor con credencial INAPAM: " + getmayorWCard + "." +
                "\nEl costo toal por los boletos comprados es de : $" + process.getTotal(niños, adulto, mayor, getmayorWCard));
        System.out.println("¡Fin del programa!");
    }
}