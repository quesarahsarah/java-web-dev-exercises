package exercises.chapter3;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class HashMapPractice {

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> students = new HashMap<>();
        String name;
        System.out.println("Enter students (or press enter when done)");
       do {
           System.out.println("Student name:");
           name = input.nextLine();
           if (!name.equals("")) {
               System.out.println("ID: ");
               Integer id = input.nextInt();
               students.put(id, name);
               input.nextLine();
           }
       } while (!name.equals(""));
       for(Map.Entry<Integer, String> student : students.entrySet())
        System.out.println("Student: " + student.getValue() + " ID: "+ student.getKey());

    }
}
