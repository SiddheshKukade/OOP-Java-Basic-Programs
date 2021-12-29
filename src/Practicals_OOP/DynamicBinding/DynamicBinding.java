package Practicals_OOP.DynamicBinding;
import java.util.*;
/**
 * @author :Siddhesh Bhupendra Kuakde
 * @date : 28-12-2021
 * @problem : * Design a base class shape with two double type values and member functions to input the data
 * and compute_area() for calculating area of shape. Derive two classes: triangle and rectangle. Make
 * compute_area() as abstract function and redefine this function in the derived class to suit their
 * requirements. Write a program that accepts dimensions of triangle/rectangle and display
 * calculated area. Implement dynamic binding for given case study.
 */
public class DynamicBinding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*****\tArea Calculation Program\t*****");
        System.out.println("\t Type which you want to calculate ( Triangle or Rectangle )");
        System.out.println("\t Type \" Leave \" to exit the program");
        String choice = scan.nextLine();
        while (true) {
            if (choice.equals("Triangle") || choice.equals("triangle")) {
                double base =0 , height =0;
                System.out.println("\tEnter the Base of Triangle : ");
                base = scan.nextDouble();
                System.out.println("\tEnter the Height of Triangle : ");
                height = scan.nextDouble();
                Shape tri = new Triangle(base, height);
                System.out.println("Area of Rectangle (base * height)/2  is :"+tri.compute_area());
                break;
            } else if (choice.equals("Rectangle") || choice.equals("rectangle")) {
               double breadth =0 , height =0;
                System.out.println("\tEnter the breadth of Triangle : ");
                 breadth= scan.nextDouble();
                System.out.println("\tEnter the height of Triangle : ");
                height = scan.nextDouble();
                Shape rect = new Rectangle( height ,breadth);
                System.out.println("Area of Rectangle (breadth * height) is :"+rect.compute_area());
                break;
            }else if(choice.equals("Leave")  || choice.equals("leave")) {
                break;
            } else {
                System.out.println("You have entered wrong choice (Only Triangle & Rectangle are allowed) Enter again below:  ");
                 choice = scan.nextLine();
            }
        }
        System.out.println("\tThank you...\t");
        System.out.println("******\tArea Calculation has finished execution\t*****");
    }
}
