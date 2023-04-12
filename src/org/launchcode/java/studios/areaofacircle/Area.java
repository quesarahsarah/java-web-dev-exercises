package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius;
        do {System.out.println("Enter a radius:");
            radius = input.nextDouble();
        }
        while (radius <=0);
        System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));

//        boolean isNum = (input.hasNextInt()||input.hasNextFloat()||input.hasNextDouble());
//        if (radius >= 0 && isNum){
//            System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
//        } else {
//            System.out.println("Invalid input for a radius");
//        }
        input.close();
    }
}
