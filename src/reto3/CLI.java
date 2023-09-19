package reto3;
import reto3.Process;

import java.util.Scanner;

public class CLI  {
    public static void showMenu() {
        while (true) {
            String opcion;
            Scanner scanner = new Scanner(System.in);
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

            System.out.println("escoja  el  numero  de la operacion a  realizar: ");
            System.out.println("1.decimal a binario");
            System.out.println("2.decimal a octal");
            System.out.println("3.decimal a hexadecimal");
            System.out.println("4.binario a decimal");
            System.out.println("5.octal a decimal");
            System.out.println("6.hexadecimal a decimal");
            System.out.println("7.finalizar");
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println(" número en decimal: ");
                    Process.decimal = scanner.nextInt();
                    Process.DecimalesABinario();
                    break;
                case "2":
                    System.out.println(" número en decimal: ");
                    Process.decimal = scanner.nextInt();
                    Process.DecimalesAOctal();
                    break;
                case "3":
                    System.out.println("número en decimal:");
                    Process.decimal = scanner.nextInt();
                    Process.DecimalesAHexadecimales();
                    break;
                case "4":
                    System.out.println(" número en binario: ");
                    Process.binarios = scanner.nextInt();
                    Process.BinariosADecimales();
                    break;
                case "5":
                    System.out.println("número en octal: ");
                    Process.octales = scanner.nextInt();
                    Process.OctalesADecimales();
                    break;
                case "6":
                    System.out.println("número en hexadecimal: ");
                    Process.hexadecimal = scanner.nextLine();
                    Process.HexadecimalesADecimales();
                    break;
                case "7":
                    System.out.println("gracias  por la  preferencia  al usar  nuestro programa ");
                    return;
                default:
                    System.out.println("opcion  invalida  ,  vuelva  a intentar");
                    break;
            }

        }
    }
}
