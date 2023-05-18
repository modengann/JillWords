import java.sql.Array;
import java.util.*;
import processing.core.*;
public class App extends PApplet{
    public static void main(String[] args) {
        PApplet.main("App");

        
    }

    public void setup(){
        ArrayList<String> words = new ArrayList<>();
        words.add("paste");
        words.add("death");
        words.add("bring");
        words.add("peach");

        //choosing random word from ArrayList
        int randNumber = (int)random(4);
        String randomWord = words.get(randNumber);
        System.out.println(randomWord);

        //breaking word into individual letters
        ArrayList<String> lettersFromWord = new ArrayList<>();
        for(int i = 0; i < randomWord.length(); i++){
            lettersFromWord.add("" + randomWord.charAt(i));
        }

        System.out.println(lettersFromWord);

        System.out.println("Print random letters");
        //print out one randomletter at a time
        while(lettersFromWord.size() > 0){
            int randomLocation = (int)random(lettersFromWord.size());
            System.out.println(lettersFromWord.get(randomLocation));
            lettersFromWord.remove(randomLocation);
        }



    }


}
