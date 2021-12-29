package Practicals_OOP; /**
 * @author : Siddhesh Bhupendra Kukade
 * @problem : Design and develop inheritance for a given case study,
 * identify objects and relationships and implement inheritance wherever applicable.
 * Employee class hasEmp_name, Emp_id, Address,Mail_id, and Mobile_noas members.
 * Inherit the classes: Programmer, Team Lead, Assistant Project Manager and
 * Project Manager from Practicals_OOP.employee class.
 * Add Basic Pay (BP) as the member of all the inherited classes with 97% of BP as DA,
 * 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for taff club fund.
 * Generate pay slips for the employees with their gross and net salary.
 * @version : 0.1
 * @date : 23-12-2021
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class employee {
    employee(){}
    Scanner scan = new Scanner(System.in);
    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    int Emp_id  ;
    double BP , HRA , PF , DA , GS ,Net_salary , staffClubFund;
    String Emp_name ,Mail_id, address , Mobile_No ;
    employee(String member) throws IOException {
        System.out.println(member+" account is successfully created ");
        System.out.println("Enter your Employee Id : \t");
        Emp_id = scan.nextInt();
        System.out.println("Enter your Complete Name : \t");
        Emp_name = input.readLine();
        System.out.println("Enter your Mobile Number : \t");
        Mobile_No = input.readLine();
        System.out.println("Enter your E-mail Id : \t");
        Mail_id = input.readLine();
        System.out.println("Enter your Address : \t");
        address = input.readLine();
        System.out.println("To Calculate Net Salary Please Enter your Base Pay Salary :");
        BP =  scan.nextInt();
    }

    /**
     * The follwing function calculates Net Salary Based on the Formula given above.
      */
    protected void calculateNetSalary(){
        DA = (BP * 97) / 100;
        HRA = (BP * 10) /100;
        PF = (BP * 12) / 100;
        staffClubFund = (BP * 0.1) /100;
        GS = BP + DA + HRA ;
        Net_salary = GS - PF - staffClubFund;

    }
    protected void generatePaymentSlip(){
        System.out.println("****** \t Kukade & PVG pvt. ltd.\t ******");
        System.out.println("Employee Name :"+Emp_name);
        System.out.println("Employee Id :"+Emp_id);
        System.out.println("Employee Mobile Number :"+Mobile_No);
        System.out.println("Employee E-mail :"+Mail_id);
        System.out.println("Employee Address :"+address);
        System.out.println("Employee NetSalary :" + Net_salary);
    }
};
class programmer extends  employee{
    programmer() throws IOException{
        super("Programmer");
    }
} ;
class techLead  extends employee{
    techLead()  throws IOException{
        super("Tech Lead");
    }
};
class assistantProjectManager extends employee {
    assistantProjectManager()  throws IOException{
        super("Assistant Project Manager");
    }
};
class projectManager extends employee{
    projectManager()  throws IOException{
        super("Project Manager");
    }
};
public class Inhertance {
    public static void main(String[] args)  throws IOException {
        System.out.println("Creating Profile of Project Manager");
        projectManager pm = new projectManager();
        pm.calculateNetSalary();
        pm.generatePaymentSlip();
        System.out.println("Creating Profile of Assistant Project Manager");
        assistantProjectManager apsm = new assistantProjectManager();
        apsm.calculateNetSalary();
        apsm.generatePaymentSlip();
        System.out.println("Creating Profile of Programmer");
        programmer prog = new programmer();
        prog.calculateNetSalary();
        prog.generatePaymentSlip();
        System.out.println("Creating Profile of Tech Lead");
        techLead tl = new techLead();
        tl.calculateNetSalary();
        tl.generatePaymentSlip();
    }
}