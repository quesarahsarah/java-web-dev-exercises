package org.launchcode.java.studios.ch3countingcharacters;

import java.util.HashMap;
import java.lang.*;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class CountingCharacters {
        public static String readFile(String path) throws IOException {
        return Files.readString(Paths.get(path));
    }
    public static void main (String[] args){
        // original task - use string from Workbook
        /* String text = "If the product of two terms is " +
                "zero then common sense says at least one " +
                "of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can " +
                "be factored allowing that side of the equation to " +
                "equal zero. Once you’ve done that, it’s pretty " +
                "straightforward from there.";
         */
        //Bonus mission -  use string from user input
        /*Scanner input = new Scanner(System.in);
        String text;
        System.out.println("Enter a bit of text whose characters you'd like to count");
        text = input.nextLine();
        */

        // Super Bonus -  use input from text file
        String filePath = "src/org/launchcode/java/studios/ch3countingcharacters/HiddenFiguresQuote.txt";

        String text = null;
        try {
            text = readFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        char[] textChars = text.toCharArray();
        HashMap<Character, Integer> charHash = new HashMap<>();
        //loop through textChars. if char is not in charHash, add it. else, add it with the value of one
        for (Character letter: textChars){
            char lowerCaseLetter = Character.toLowerCase(letter);
            if(Character.isAlphabetic(lowerCaseLetter)) {
                if (!charHash.containsKey(lowerCaseLetter)) {
                    charHash.put(lowerCaseLetter, 1);
                } else {
                    charHash.put(lowerCaseLetter, charHash.get(lowerCaseLetter)+1);
                }
            }
        }
        for (Character letter : charHash.keySet()) {
            System.out.println(letter + ": " + charHash.get(letter));
        }
    }
}
