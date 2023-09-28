package reto5;
import reto5.process;

import java.util.Scanner;
/**
 * La clase CLI (Interfaz de Línea de Comandos) es responsable de ejecutar el juego de adivinanza de palabras.
 * Los jugadores pueden seleccionar diferentes niveles de dificultad y tratar de adivinar palabras.
 */
public class CLI {
    /**
     * Muestra un menú de selección de nivel y permite a los jugadores jugar al juego de adivinanza de palabras.
     */
    public static void showMenu() {



        Scanner sc = new Scanner(System.in);
        String[] palabrasFacil = {"casa", "juan", "manzana", "planeta"};
        String[] palabrasIntermedio = {"rinoceronte", "amplitud", "escopeta", "monitor"};
        String[] palabrasAvanzado = {"estrepitoso", "esternocleidomastoideo", "inmunodeficiencia", "papiroflexia"};

        System.out.println("Bienvenido al juego de adivinar la palabra");
        int opcion = 1;
        while (opcion != 0) {
            System.out.println("Seleccione el nivel de dificultad:");
            System.out.println("1 - Fácil");
            System.out.println("2 - Intermedio");
            System.out.println("3 - Avanzado");
            System.out.println("0 - Salir");
            opcion = sc.nextInt();
            if (opcion == 0) {
                break;
            }
            String[] palabras = null;
            switch (opcion) {
                case 1:
                    palabras = palabrasFacil;
                    break;
                case 2:
                    palabras = palabrasIntermedio;
                    break;
                case 3:
                    palabras = palabrasAvanzado;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
            if (palabras != null) {
                process.jugar(palabras[(int) (Math.random() * palabras.length)]);
            }
        }
        System.out.println("¡Gracias por jugar!");
    }
    /**
     * Método privado que permite jugar al juego de adivinanza de palabras con una palabra específica.
     *
     * @param palabra La palabra que debe adivinarse en el juego.
     */
    private static void jugar (String palabra){
    }
/**Aquí iría la implementación del juego con la palabra proporcionada.*/
}
