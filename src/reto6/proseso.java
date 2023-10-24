package reto6;
import java.util.Map;
public class proseso {    public static String playGame(String toGuessWord, char letterToGuess, Map<Character, Boolean> guessedLetters, String guessedWord){
    char[] aux;
    if(guessedLetters.get(letterToGuess) != null){
        if(!guessedLetters.get(letterToGuess)){
            guessedLetters.put(letterToGuess, true);
            for(int i = 0; i < toGuessWord.length(); ++i){
                if(toGuessWord.charAt(i) == letterToGuess){
                    aux = guessedWord.toCharArray();
                    aux[i] = letterToGuess;
                    guessedWord = new String(aux);
                }
            }
        }
    }
    return guessedWord;
}
}

