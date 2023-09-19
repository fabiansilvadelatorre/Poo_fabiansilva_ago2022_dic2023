package reto3;
import java.util.ArrayList;
import java.util.Collections;

/**
 * clase  que  crea un  conversor  de sistemas numericos
 */
public class Process {
    public static int decimal;
    public static int binarios ;
    public static long octales;
    public static String hexadecimal = "";
    public static void DecimalesABinario(){
        int digito;
        String binario = "";
        do {
            digito = decimal % 2;
            binario += digito;
            decimal = decimal / 2;

        }while (decimal != 0);
        binario = new StringBuilder(binario).reverse().toString();
        System.out.println("Su numero es "+ binario + " en binario");
    }

    /**
     * DecimalesAOctal código específico para transformar numeros decimales en octales
     */
    public static void DecimalesAOctal(){
        ArrayList<Integer> octal = new ArrayList<>();
        while (decimal != 0) {
            octal.add(decimal %  8);
            decimal /= 8;
        }
        Collections.reverse(octal);
        System.out.println("Su numero en octal es: ");
        for (int i : octal){
            System.out.print(i);
        }
        System.out.println();
    }

    /**
     * DecimalesAHexadecimales código específico para transformar números decimales a hexadecimales
     */
    public static void DecimalesAHexadecimales(){
        int residuo;
        String hexadecimal = "";
        char[] hexadecimales = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        while (decimal > 0) {
            residuo = decimal % 16;
            hexadecimal = hexadecimales[residuo] + hexadecimal;
            decimal /= 16;
        }
        System.out.println("Su numero en hexadecimal es: " + hexadecimal);

    }

    /**
     * BinariosADecimales código especifioco para transformar números binarios a decimales
     */
    public static void BinariosADecimales(){
        int residuo, c = 0, decimal = 0;
        while (binarios !=0){
            residuo = binarios % 10;
            decimal += residuo*Math.pow(2,c);
            c++;
            binarios /=10;

        }
        System.out.println(decimal);
    }

    /**
     * OctalesADecimales código específico para transformar números octales en decimales
     */
    public static void OctalesADecimales(){
        int i = 0;
        long decimal = 0;
        while (octales != 0){
            decimal = (long) (decimal + (octales % 10) * Math.pow(8, i));
            octales /= 10;
            ++i;
        }
        System.out.println(decimal);
    }

    /**
     * HexadecimalesADecimales código específico para transformar números hexadecimales en decimales
     */
    public static void HexadecimalesADecimales(){
        int decimal = 0;
        final String digitos = "0123456789ABCDEF";
        hexadecimal = hexadecimal.toUpperCase();
        for (int i = 0; i < hexadecimal.length(); i++) {
            char caracter = hexadecimal.charAt(i);
            int digito = digitos.indexOf(caracter);
            decimal = 16 * decimal + digito;
        }
        System.out.println(decimal);
    }
}
