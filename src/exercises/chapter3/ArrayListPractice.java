package exercises.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main (String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>(
                Arrays.asList(1, 3, 67, 53, 52, 8, 2, 90, 5, 17));
        System.out.println(evenSum(arrayList));
        ArrayList<String> wordArray = new ArrayList<>(
                Arrays.asList("Hello", "my", "name", "is", "Sarah"));

        Scanner input = new Scanner(System.in);
        String suess = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will " +
                "not eat them in a house. I will not eat " +
                "them with a mouse.";
        String[] suessSplit = suess.split(" ");
        ArrayList<String> suessList = new ArrayList<String>(
                Arrays.asList(suessSplit));
        Double wordLength;
        System.out.println("Enter the length of words you'd like to return");
        wordLength = input.nextDouble();
        System.out.println(wordList(suessList, wordLength));
    }
    public static int evenSum (ArrayList<Integer> numbers){
        int total = 0;
        for (int i: numbers){
            if (i % 2 == 0) {
                total = total+ i;
            }
        }
        return total;
    }
    public static ArrayList<String> wordList (ArrayList<String> words, Double num){
        ArrayList<String> numLetters = new ArrayList<>();
        for (String word: words){
            if (word.length() == num){
                numLetters.add(word);
            }
        }
        return numLetters;
    }
}
