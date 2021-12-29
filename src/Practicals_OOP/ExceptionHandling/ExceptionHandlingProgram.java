package Practicals_OOP.ExceptionHandling;

import java.util.Scanner;

/**@author Siddhesh Bhupndra Kukade
 * @date 28-12-2021
 * @Problem : Implement a program to handle Arithmetic exception, Array Index Out of Bounds. The user enters
 * two numbers Num1 and Num2. The division of Num1 and Num2 is displayed. If Num1 and Num2
 * are not integers, the program would throw a Number Format Exception. If Num2 were zero, the
 * program would throw an Arithmetic Exception. Display the exception.
 */
public class ExceptionHandlingProgram {
    public static void main(String[] args) {
        int num1 , num2;
        int arr[] = new int[10];
        Scanner scan = new Scanner(System.in);

        while(true){
        try {
            System.out.println("\t*****\tArithmetic and Number Format  Exception\t*****\nEnter the first number for Division");
            num1 = scan.nextInt();
            System.out.println("Enter the Second number for Division");
            num2 = scan.nextInt();
            System.out.println("Division is " + (float)num1 / num2);
            System.out.println("\t*****\tArray Exception\t*****\nWe have an integer array of size 10 on which index do you want to store the value");
            int temp = scan.nextInt();
            arr[temp] = 10;
            System.out.println("The Number is successfully stored \t"+arr[temp]);
            break;
        }catch (ArithmeticException e){
            System.out.println("Impossible division.... ");
        }catch (NumberFormatException e ){
            System.out.println("Entered value is not a number ...please try again and enter a valid number");
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("Your are trying to go beyond the limit size of an array..");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Thank you.....\nException handling program has finished execution");

        }
        }
    }
}
