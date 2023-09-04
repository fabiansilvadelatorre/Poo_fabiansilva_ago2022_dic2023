package reto2.piramide;
import java.util.Scanner;
import reto2.piramide.process;
public class Cli {
    public static void showUserInterface(){
        Scanner input = new Scanner(System.in);
        short size;

        System.out.print("Ingrese el tamaño de la pirámide: ");
        size = input.nextShort();

        process.printTriangle(size);
    }
}
