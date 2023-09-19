package reto4;
import reto4.process;

public class CLI {
    public static void showMenu() {
        String [] sabores = {""};
        int[][] ventas = {
                {111, 483, 471, 427},
                {192, 500, 355, 158},
                {289, 470, 474, 160},
                {415, 114, 161, 308}
        };
        System.out.println("Chocolate: 111, 483, 471, 427 \nVainilla: 192, 500, 355, 158 \nFresa: 289, 470, 474, 160 \nOreo: 415, 114, 161, 308");
        for (int trimestres :
                process.VentaMaxPorTrimestre(ventas)){

            System.out.println("El trimestre que mejor vendio fue: " +  process.Trimestre(trimestres));
        }
        for (int maxTrimestre :
                process.MayorTrimestre(ventas)){
            System.out.println( "El trimestre con mayor volumen de ventas fue el trimestre = " + process.Trimestre(maxTrimestre));
        }
    }
}
