package exercises.chapter2;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String alice = "Alice was beginning to " +
                "get very tired of sitting by " +
                "her sister on the bank, and of " +
                "having nothing to do: once or " +
                "twice she had peeped into the " +
                "book her sister was reading, but " +
                "it had no pictures or conversations " +
                "in it, 'and what is the use of a " +
                "book,' thought Alice 'without " +
                "pictures or conversation?'";
        System.out.println("Enter a search word");
        String searchString = input.next().toLowerCase();
        System.out.println("The first sentence in Alice" +
                " in Wonderland has that word: "+ alice.toLowerCase().contains(searchString));
        System.out.println("Your search word was found at index " + alice.indexOf(searchString)
        + " and has a length of " + searchString.length());
        String aliceWithoutWord = alice.replace(searchString, "");
        System.out.println(aliceWithoutWord);
        input.close();
    }
}
