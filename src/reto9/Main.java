package reto9;
import reto9.Process;
import reto9.CLI;
public class Main {
    public static void main(String[] args) {
        int cantidad = CLI.pedirCantidadAyudantes();
        Process.Ayudantes[] ayudantes = Process.Ayudantes.crearAyudantes(cantidad);
        CLI.mostrarAyudantes(ayudantes);
    }
}
