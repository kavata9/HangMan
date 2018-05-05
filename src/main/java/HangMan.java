import java.util.Random;
public class HangMan {
    public String guessedWord;
    public String myInput;
      public String words(){
        return "Tiger";
      }
      //This Functions will Show the random word
      public String randWords(){
        Random myRandom = new Random();
        String[] myWords = {"Tiger","Moon","Sun","Dennis"};
        // int myIndex = myRandom.nextInt(1);
  
        // guessedWord = myWords[myIndex];
        return guessedWord;
  
      }
    }