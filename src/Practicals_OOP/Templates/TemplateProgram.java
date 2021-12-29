package Practicals_OOP.Templates;
import java.util.Scanner;
/**
 * @author Siddhesh Bhupndra Kukade
 * @date 28-12-2021
 * @Problem : Implement a generic program using any collection class to count the number of elements in a
 * collection that have a specific property such as even numbers, odd number, prime number and
 * palindromes.
 */
public class TemplateProgram {
    public static void main(String[] args) {
        try {
            int size;
            int nums[];
            Scanner scan = new Scanner(System.in);
            System.out.println("\t*****\tTemplate Program to Count Odd , Eveen and Palindromes\t*****\nEnter how many numbers do you want to have");
            nums =new int[scan.nextInt()];
            for(int i=0; i<nums.length; i++){
                System.out.println("\t Enter the Number for \""+i+"\" Location ::");
                nums[i] = scan.nextInt();
            }
            System.out.println("\t Please wait processing your array..");
            NumberCounter<Integer>  numberCounter = new NumberCounter<Integer>(nums);
            System.out.println("\t Total Odd Numbers available in the list are"+numberCounter.calculateOddNumbers() );
            System.out.println("\t Total Even Numbers available in the list are"+numberCounter.calculateEvenNumbers());
            System.out.println("\t Total Palindromes  available in the list are"+numberCounter.calculatePalindromeNumbers());

        }catch( Exception e ){
         System.out.println("Something went wrong you might have entered incorrect values...please try again");
        }
        finally {
            System.out.println("Thank you.....\nTemplate  program has finished execution");
        }
    }
}
