/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commission;

import java.util.Scanner;

/**
 *
 * @author Laptop
 */
public class testCommission {
            
        public static void main(String []args) {
            Scanner input = new Scanner(System.in); // our input parser
            // initialize variables
            boolean running = true;
            int choice;
            
            double [][] commissions2017 = {{1200,3002,1562,4005}, 
                                            {1522,1002,2001,2100}, 
                                            {2522,1002,2563,3000}};
                 
            
            
            do{
               
            System.out.println("1 - Lowest Commission");
            System.out.println("2 - Highest Commission");
            System.out.println("3 - Average commissions");
            System.out.println("4 - View bar chart");
            System.out.println("5 - View all commissions (Tabular format)");
            System.out.println("9 - Exit");
            System.out.println("Enter your choice: "); // asks for menu choice
            choice = input.nextInt();
            Commission commission = new Commission(commissions2017, 1, choice);
            commission.setChoice(choice); // saves choice
            switch(commission.getChoice())
            {
             
                case 1:
                    commission.setLowestCommission(commissions2017);
                    System.out.println("lowest commission: $"+ commission.getLowestCommission()); 
                    break;
                case 2:
                    commission.setHighestCommission(commissions2017);
                    System.out.println("highest commission: $"+ commission.gethighestCommission()); 
                    break;
                    
                case 3:
                    int emp;
                    System.out.println("Which employee? (1-3): ");
                    emp = input.nextInt();
                    Commission commission2 = new Commission(commissions2017, emp, choice);
                    commission.setAverage(commissions2017, emp-1);
                    System.out.println("average of employee " + emp 
                            + ": $" + commission2.getAverage()); 
                    break;
                    
                case 4:
                    commission.setBarChart(commissions2017);
                    System.out.println(commission.getBarChart() ); 
                    break;
                    
                case 5:
                    commission.setTable(commissions2017);
                    System.out.println(commission.getTable() );
                    break;
                    
                case 9:
                    System.out.println("Thank you have a good day!");
                    System.exit(0);
                    break;
            }
            } while (running != false);

      
   }
    
}
