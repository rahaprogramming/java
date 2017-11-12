/******************************************************************************
 * @author Ralph Harris
 * Employee Salary program for Miss Lindy :)
 * CSS 346 - written 9/3/2017 at 3:39 pm
 * 
 * This program will use the Employee class and show it's usefulness by showing 
 * the yearly salary before and after a 10 percent raise. The values needed are:
 * 
 * a) First name
 * b) Last name
 * c) Monthly salary
 * 
 * Finally, a fourth variable is added which computes the salary after a 10% 
 * raise:
 * 
 * d) awesomeEmployee
 *****************************************************************************/
package Employee;

import java.util.Scanner;

public class employeeTest {

    /**
     * Employee class test
     * @param args 
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); // our input parser
        System.out.println("Enter the first name: "); // asks for first name
        String fName = input.next(); // saves first name
        
        System.out.println("Enter the last name: "); // asks for last name
        String lName = input.next(); //saves last name
        
        System.out.println("Enter the Salary: "); // gets salary
        double mSalary = input.nextDouble(); // saves salary
        
        /**
         * The following creates a new employee class from the entered 
         * information and computes a yearly salary variable with a 10 percent 
         * raise called awesomeEmployee. 
         */
        Employee employee = new Employee(fName,lName ,mSalary ); 
 
        /** 
         * outputs yearly salary
         */
        System.out.println("the yearly salary of "+employee.getFirstName()+" "+employee.getLastName()+": ");
        System.out.println(employee.getMonthlySalary()*12);
        
        /**
         * salary after 10% raise
         */
        double awesomeEmployee = employee.getMonthlySalary()*0.1+employee.getMonthlySalary();
        employee.setMonthlySalary(awesomeEmployee);
        
        /**
         * Outputs yearly salary after 10% raise
         */
        System.out.println("the new yearly salary of "+employee.getFirstName()+" "+employee.getLastName()+": ");
        System.out.println(employee.getMonthlySalary()*12);
        

    }
    
}
