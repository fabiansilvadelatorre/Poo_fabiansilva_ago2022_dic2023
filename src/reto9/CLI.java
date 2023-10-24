package reto9;
import reto9.Process;
import reto9.Main;
import  reto9.CLI;

import java.util.ArrayList;
import java.util.Scanner;
public class CLI {

    private static Scanner scanner = new Scanner(System.in);

    public static int pedirCantidadAyudantes() {
        System.out.print("Ingrese la cantidad de ayudantes a crear: ");
        return scanner.nextInt();
    }

    public static void mostrarAyudantes(ArrayList[] ayudantes) {
        for (Process.Ayudantes ayudante : ayudantes) {
            System.out.println(ayudante.mostrarCaracteristicas());
        }
    }
}
