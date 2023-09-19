package reto4;
import reto4.CLI;
import java.util.ArrayList;
import java.util.List;
public class process {
    public static List<Integer> VentaMaxPorTrimestre(int[][] ventas){
        double max;
        List<Integer> trimestres = new ArrayList<>();
        int X = 0;
        for (int i = 0; i < ventas.length; i++) {
            max = Double.MIN_VALUE;
            for (int j = 0; j < ventas.length; j++) {
                if (ventas[i][j] > max){
                    max = ventas[i][j];
                    X = j;
                }
            }
            trimestres.add(X);

        }
        return trimestres;
    }
    public static List<Integer> MayorTrimestre(int[][] ventas){
        int maxTrimestre = 0;
        int Y = 0;
        List<Integer> trimestres = new ArrayList<>();
        for (int i = 0; i < ventas.length; i++) {
            int sumatoria = 0;
            for (int j = 0; j < ventas.length; j++) {
                sumatoria += ventas[j][i];
            }
            if (sumatoria > maxTrimestre){
                maxTrimestre = sumatoria;
                Y = i;
            }
        }
        trimestres.add(Y);
        return trimestres;
    }

    public static String Trimestre(int trimestre){
        switch (trimestre){
            case 0:
                return "Enero-Marzo";
            case 1:
                return "Abril-Junio";
            case 2:
                return "Julio-Septiembre";
            case 3:
                return "Octubre-Diciembre";
            default:
                return "trimestre no válido";
        }
    }

}
