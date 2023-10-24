package reto6;
import reto6.proseso;
import java.awt.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
public class CLI {
    private final static String[][] words = {{"MANO", "pompella", "popocatepetl"},
            {"XXXX", "xxxxxxxx", "xxxxxxxxxxxx"}};
    private static Map<Character, Boolean> guessedLetters = new HashMap<>();
    private static Scanner input = new Scanner(System.in);
    private static char keepPlaying;
    private static char PalabraaAdivinar;
    private static Menu menu = new Menu();
    private static String NivelFacil = " nivel fácil.";
    private static String NivelMedio = "nivel medio.";
    private static String NivelDificil = "difícil.";
    private static String LetraExistente = "Ingrese una letra  ";
    private static String Nonumeros= " no un número,: ";
    private static String LetrasAdivinadas = " la palabra adivinada es la siguiente manera: %s\n";
    private static String volverajugar = "¿Desea seguir jugando?\nCualquier letra) Sí.\n0) No\n ";
    private static String fin= "Programa finalizado.";
    public static char readLetter(char letterToGuess){
        letterToGuess = input.nextLine().charAt(0);
        while(letterToGuess >= '1' && letterToGuess <= '9'){
            System.out.print(Nonumeros);
            letterToGuess = input.nextLine().charAt(0);
        }
        if(letterToGuess == '0'){
            menu.MenuFalso();
            return ' ';
        }
        return letterToGuess;
    }
    private static void playGameAny(String wordToGuess, String guessedWord){
        for(short i = 0; i < wordToGuess.length(); ++i){
            guessedLetters.put(wordToGuess.charAt(i), false);
        }
        do{
            System.out.print(LetraExistente);
            PalabraaAdivinar = readLetter(PalabraaAdivinar);
            guessedWord = proseso.playGame(wordToGuess, PalabraaAdivinar, guessedLetters, guessedWord);
            System.out.printf(LetrasAdivinadas, guessedWord);
            System.out.printf(volverajugar);
            keepPlaying = input.nextLine().charAt(0);
        }while(keepPlaying != '0');
        System.out.printf(fin);
        menu.MenuFalso();
    }
    private static pty.MenuActionPrototype playGameEasy = () -> {
        playGameAny(words[0][0], words[1][0]);
    };
    private static pty.MenuActionPrototype playGameMedium = () -> {
        playGameAny(words[0][1], words[1][1]);
    };
    private static pty.MenuActionPrototype playGameHard = () -> {
        playGameAny(words[0][2], words[1][2]);
    };
    static {
        menu
                .addOption(NivelFacil, playGameEasy)
                .addOption(NivelMedio, playGameMedium)
                .addOption(NivelDificil, playGameHard)
                .addExitOption();
    }
    public static void startGame() {
        menu.showMenu();
        do {
            menu.requestOption();
            int option = menu.readOption();
            menu.executeOption(option);
        } while (menu.isAlive());
    }
}