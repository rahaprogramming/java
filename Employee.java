/******************************************************************************
 * @author Ralph Harris
 * Employee Salary program for Miss Lindy :)
 * CSS 346 - written 9/3/2017 at 3:39 pm
 * 
 * This program will take three variables -
 * 
 * a) First name
 * b) Last name
 * c) Monthly salary
 * 
 * From that information, the program will output the employee(s) yearly salary.
 *****************************************************************************/
package Employee;

public class Employee {
    
    private String firstName;
    private String lastName;
    private double monthlySalary;
    
    /**************************************************************************
     * 
     * Constructor for class Employee
     * @param fName
     * @param lName
     * @param mSalary - If statement ensures that the value is not set if the 
     * value is less than zero. (rather than setting this to zero).
     * 
     *************************************************************************/
    public Employee(String fName, String lName, double mSalary){
        firstName = fName;
        lastName = lName;
     
        if(mSalary < 0){
          System.out.println("Try again with a positive salary amount");
          System.out.println("Your employee is super depressed and goes to work at Mcdonalds!");
          System.out.println("prograammm overrr... beep!");
          System.exit(0);
          //monthlySalary = 0;
        } else monthlySalary = mSalary;
    }
    /*************************************************************************
     * 
     * Getter for variable firstName
     * @return firstName
     ************************************************************************/
    public String getFirstName(){
        return firstName;
    }
    
    /*************************************************************************
     * 
     * Setter for variable firstName
     * @param fName
     ************************************************************************/
    public void setFirstName(String fName){
        firstName = fName;
    } 
    
    /*************************************************************************
     * 
     * Getter for variable lastName
     * @return lastName
     ************************************************************************/
    public String getLastName(){
        return lastName;
    }
    
    /*************************************************************************
     * 
     * Setter for variable lastName
     * @param lName
     ************************************************************************/
    public void setLastName(String lName){
        lastName = lName;
    }
    
    /*************************************************************************
     * 
     * Getter for variable monthlySalary
     * @return monthlySalary
     ************************************************************************/
    public double getMonthlySalary(){
        return monthlySalary;
    }
    
    /*************************************************************************
     * 
     * Setter for variable monthlySalary
     * If the salary is less than zero the program will NOT set it at all..
     * as per instructions. The only alternative is to output an error message
     * and terminate.
     * @param mSalary
     ************************************************************************/
    public void setMonthlySalary(double mSalary){
        if(mSalary < 0){
          System.out.println("Try again with a positive salary amount");
          System.out.println("Your employee is super depressed and goes to work at Mcdonalds!");
          System.out.println("prograammm overrr... beep!");
          System.exit(0);
          //monthlySalary = 0;
        } else monthlySalary = mSalary;
    }
    
}


