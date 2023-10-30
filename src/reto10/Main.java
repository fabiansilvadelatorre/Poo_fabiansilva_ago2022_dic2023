package reto10;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main {
    /**
     * Interfaz para definir operaciones aritméticas..
     */
    interface Operacion {
        double calcular(double a, double b);
    }

    /**
     * Clase que implementa la operación de suma.
     */
    static class Suma implements Operacion {
        public double calcular(double a, double b) {
            return a + b;
        }
    }

    /**
     * Clase que implementa la operación de resta.
     */
    static class Resta implements Operacion {
        public double calcular(double a, double b) {
            return a - b;
        }
    }

    /**
     * Clase que implementa la operación de multiplicación.
     */
    static class Multiplicacion implements Operacion {
        public double calcular(double a, double b) {
            return a * b;
        }
    }

    /**
     * Clase que implementa la operación de división.
     */
    static class Division implements Operacion {
        public double calcular(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("No se puede dividir por cero.");
            }
            return a / b;
        }
    }

    /**
     * Clase que implementa la operación de raíz cuadrada.
     */
    static class RaizCuadrada implements Operacion {
        public double calcular(double a, double b) {
            if (a < 0) {
                throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");
            }
            return Math.sqrt(a);
        }
    }

    /**
     * El método principal que inicia la calculadora y realiza operaciones.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Operacion> operaciones = new HashMap<>();
        operaciones.put("+", new Suma());
        operaciones.put("-", new Resta());
        operaciones.put("*", new Multiplicacion());
        operaciones.put("/", new Division());
        operaciones.put("sqrt", new RaizCuadrada());

        System.out.println("Calculadora de operaciones aritméticas:");
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el operador (+, -, *, /, sqrt): ");
        String operador = scanner.next();

        if (!operaciones.containsKey(operador)) {
            System.out.println("Operador no válido.");
            scanner.close();
            return;
        }

        if (operador.equals("sqrt")) {
            double resultado = operaciones.get(operador).calcular(num1, 0);
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();
            double resultado = operaciones.get(operador).calcular(num1, num2);
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
        }