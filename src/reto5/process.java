/**
 * La clase `process` es responsable de implementar el juego de adivinanza de palabras.
 * Los jugadores intentan adivinar una palabra oculta ingresando letras hasta que adivinan la palabra completa o se quedan sin intentos.
 */
package reto5;

import java.util.Scanner;

public class process {
    /**
     * Método que permite jugar al juego de adivinanza de palabras con la palabra especificada.
     *
     * @param palabra La palabra que el jugador debe adivinar.
     */
    public static void jugar(String palabra) {
        Scanner sc = new Scanner(System.in);
        int intentos = 5;
        String palabraAdivinada = "";

        /** Inicializar palabraAdivinada con "X" para ocultar la palabra.*/
        for (int i = 0; i < palabra.length(); i++) {
            palabraAdivinada += "X";
        }

        /** Comienza el juego.*/
        while (intentos > 0 && !palabraAdivinada.equals(palabra)) {
            System.out.println("La palabra a adivinar es: " + palabraAdivinada);
            System.out.println("Te quedan " + intentos + " intentos");
            System.out.println("Ingrese una letra: ");
            String letra = sc.nextLine().toLowerCase();
            boolean acerto = false;

            /** Verifica si la letra ingresada es correcta.*/
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra.charAt(0)) {
                    palabraAdivinada = palabraAdivinada.substring(0, i) + letra + palabraAdivinada.substring(i + 1);
                    acerto = true;
                }
            }

            /** Muestra un mensaje según si se acertó o no la letra.*/
            if (acerto) {
                System.out.println("¡QUE inteligente , has  asertado!");
            } else {
                System.out.println("vuelve a  intentarlo");
                intentos--;
            }
        }

        /** Comprueba si el jugador adivinó la palabra o no.*/
        if (palabraAdivinada.equals(palabra)) {
            System.out.println("¡Felicitaciones! Adivinaste la palabra " + palabra);
        } else {
            System.out.println("¡Lo siento! lo haras mejor la proxima  " + palabra);
        }
    }
}

