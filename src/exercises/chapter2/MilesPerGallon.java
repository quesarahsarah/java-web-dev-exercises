package exercises.chapter2;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles were driven:");
        double milesDriven = input.nextDouble();
        System.out.println("How much gas was used:");
        double gasUsed = input.nextDouble();
        System.out.println("Your MPG is " + milesDriven/gasUsed);
    }
}
