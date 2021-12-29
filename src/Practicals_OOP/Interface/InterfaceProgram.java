package Practicals_OOP.Interface;
import java.util.*;
/**
 *  @author :Siddhesh Bhupendra Kuakde
 *  @date : 28-12-2021
 * Design and develop a context for given case study and implement an interface for Vehicles
 * Consider the example of vehicles like bicycle, car and bike. All Vehicles have common
 * functionalities such as Gear Change, Speed up and apply breaks. Make an interface and put all
 * these common functionalities. Bicycle, Bike, Car classes should be implemented for all these
 * functionalities in their own class in their own way.
 */
public class InterfaceProgram {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int temp;
         System.out.println("*****\tInterface  Program\t*****");
         Vehicle vehicle ;
        String vehicles[] = {"bicycle", "Bike", "Car"};
        for(int i =0 ; i<vehicles.length ; i++) {
            System.out.println("\t------\tLet's start with "+vehicles[i]+"\t-------\t");
            switch (vehicles[i]){
                case "bicycle":
                    vehicle = new bicycle();
                    break;
                case "Bike":
                    vehicle = new Bike();
                    break;
                case "Car":
                    vehicle = new Car();
                    break;
                default:
                    vehicle = new bicycle();
                          }
            System.out.println("how much speed you want to increase of your "+vehicles[i]+" :");
            temp = scan.nextInt();
            if(temp >200 ) System.out.println("Sorry speed is not practical...\n");
            else  vehicle.speedUp(temp);


            System.out.println("What gear you want of your "+vehicles[i]+" :");
            temp = scan.nextInt();
            if(temp <6  && temp>0)  vehicle.GearChange(temp);
            else System.out.println("Wrong Gear..sorry not changing gears....\n");

            System.out.println("Type \"Brake\" to apply brakes of your "+vehicles[i]+":");
            if("Brake".equals(scan.nextLine()) || "brake".equals(scan.nextLine())) vehicle.applyBreaks();
            else System.out.println("Ok we are not applying brakes\n"+vehicles[i]+"is Still Running\n\n");
        }
        System.out.println("\tThank you...\t");
        System.out.println("******\tInterface Program has finished execution\t*****");
    }
}
