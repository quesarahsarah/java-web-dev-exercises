package exercises;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        double length = input.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        double width = input.nextDouble();
        System.out.println("The area of the rectangle is " + length*width);
        input.close();
    }

}
