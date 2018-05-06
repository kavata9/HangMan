import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.io.Console;
// This checks that the function should return a string data type
public class HangMan {
  public String guessedWord;
  public String myInput;

  public String words() {
    return "Tiger";
  }

  // This Functions will Show the random word
  public String randWords() {
    Random myRandom = new Random();
    String[] myWords = { "Tiger", "Moon", "Sun", "Peace" };
    int myIndex = myRandom.nextInt(1);

    guessedWord = myWords[myIndex];
    return guessedWord;
  }
  // /This test will detrmine if the String will be split
  public String[] splitWords(String guessedWord){
    String[] splitWords = guessedWord.split("");
    return splitWords;
  }
}