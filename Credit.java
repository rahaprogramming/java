/**
 *
 * @Author: Ralph Harris
 * CSS 346 - Credit Calculator for Mrs. Lindy 
 *
 * This application determines whether any of several department-store 
 * customers has exceeded the credit limit on a charge account. 
 * For each customer, the following variables are requested at program start:
 * 
 * a) account number - (accountNumber)
 * 
 * b) Balance at the beginning of the month - (previousBalance)
 * 
 * c) total of all items charged by the customer this month - (totalCharged)
 * 
 * d) total of all credits applied  - (totalCredits)
 * 
 * e) allowed credit limit - (creditLimit)
 *
 */
import java.util.Scanner;

public class Credit {
 
    public static void main(String[] args) {
 
        int accountNumber = 0;  // Account number of the customer
        int previousBalance;  // Previous balance of the customer
        int totalCharged; // Total of all items charged this month 
        int totalCredits;  // Total of all credits this month (paid amount, etc)
        int creditLimit;  // credit limit of the customer
 
        Scanner input = new Scanner(System.in); // scanner
        
        // Below is the intro text
        System.out.println("This Application Determines Whether Any Of Several "
                + "Department-store \nCustomers Has Exceeded Their Credit Limit"
                + " On A Charge Account.\n");
 
        
        
 while (accountNumber!=-1) {

        //Below is the option to quit or enter the customer account number
        System.out.println("Enter the account number of this customer"
                + " (to quit enter -1): ");
        accountNumber = input.nextInt();
        
        // If the user inputs -1, quit
        if(accountNumber == -1)
        {
            System.out.println("Thank you have a good day");
            System.exit(0);
        }
 
        // get previous balance
        System.out.println("Enter the previous balance due: ");
        previousBalance = input.nextInt();
 
        // get charges this month
        System.out.println("Enter the charges by the Customer this month: ");
        totalCharged = input.nextInt();
 
        // get credits this month
        System.out.println("Enter the amount paid (credits) this month: ");
        totalCredits = input.nextInt();
 
        // get credit limit
        System.out.println("Enter the credit limit of this customer: ");
        creditLimit = input.nextInt();
 

        /**
         * newBalance is the total amount due after credits and charges
         */
        int newBalance = previousBalance + totalCharged - totalCredits;
 
        /**
         * The following displays a nicely formatted summary of the customer's
         * activity during the month in the form of:
         * 
         * Customer: 1
         * Balance at the beginning of the month: $100.00
         * Total charged this month: $100.00
         * Amount paid this month (credits): $100.00
         */
        System.out.println("Customer: " + accountNumber + "\n"
                + "Balance at the beginning of the month: $" + previousBalance 
                + ".00"+"\n"
                + "Total charged this month: $" + totalCharged + ".00"+"\n"
                + "Amount paid this month (credits): $" + totalCredits + ".00"+
                "\n");
 
        /**
         * The Balance (newBalance) is always displayed
         */
        System.out.println("The Customers Balance is $" +newBalance+".00");
 
        /**
         * The following if statement displays a "warning message" if the 
         * customer has exceeded the credit limit and displays the exceeded 
         * amount which is stored as the variable exceeded. Otherwise, a message
         * is displayed thanking the customer for their business.
         * 
         */
        if (newBalance>creditLimit) 
        {
            int exceeded = newBalance - creditLimit;
            System.out.println("CREDIT LIMIT OF $" + creditLimit
                    + " EXCEEDED BY $" + exceeded +".00");
            System.out.println("...We know where you live");
        }else{
            System.out.println("Thank you for your business");
        }
 
 }
 
 // If the user immediately enters -1, thank them and exit
 if(accountNumber == -1)
        {
             System.out.println("Thank you have a good day");
             System.exit(0);
        }
    }
    
}
