/**
 * @author Ralph Harris
 * CSS 346 - written for Mrs. Lindy :)
 * 
 * This program is for an online retailer which sells 5 products:
 * 
 * Product 1, $2.98; 
 * product 2, $4.50; 
 * product 3, $9.98; 
 * product 4, $4.49; 
 * and product 5, $6.87.  
 * 
 * This application reads a series of pairs of numbers as follows:
 * 
 * Product number
 * Quantity sold
* 
* It uses a switch statement to determine the products ordered, calculate the 
* price and display an appropriate summary with a checkout total. It uses a 
* sentinel-controlled loop to determine when the program should stop looping
* and display the final results.
 */

package calculatingsales;

import java.util.Scanner; // usual scanner
import java.text.DecimalFormat; // I had to hunt this down, but it formats the total nicely.

public class CalculatingSales {

    public static void main(String[] args) {
        

	Scanner keyboard = new Scanner(System.in); // input scanner
        DecimalFormat decimalPlaces = new DecimalFormat(".##");// This formats to 2 decimals
        
	boolean checkout = false; // set to determine checkout
        
        // Below is our introductory message
        System.out.println("Hello. Welcome To the java sales register!");
        /**
         * The loop below will go to checkout if the user enters -1 or allow the 
         * user to enter up to 5 products (the maximum number of products)
         */
        double total =0; // Final total of all products
        double productTotal = 0.00; // total of individual products
        double price = 0; // price of each product
        int quantity = 0; // quantity of each product
        String summary = ""; // This displays a different summary based on purchases
        
	for(int i=1; i<=50 && !checkout ;i++){ 
            
            /**
             * The following menu prompts the user to enter a product number and
             * quantity in the following format:
             * 
             * Please refer to the following chart to make your selections: 
             * Enter product number (1-5),or -1 to checkout
             * 1 - Product 1 - $2.98
             * 2 - Product 2 - $4.50
             * 3 - Product 3 - $9.98
             * 4 - Product 4 - $4.49
             * 5 - Product 5 - $6.87
             * ->2
             * Enter number(s) of this product sold: 
             * ->100
             * 
             * This menu allows up to 5 different selections and displays a 
             * different message/total for each combination.
             */
		System.out.println("\nPlease refer to the following chart"
                        + "to make your selections: \n"
                        + "Enter product number (1-5),or -1 to checkout: \n"
                        + "1 - Product 1 - $2.98\n"
                        + "2 - Product 2 - $4.50\n"
                        + "3 - Product 3 - $9.98\n"
                        + "4 - Product 4 - $4.49\n"
                        + "5 - Product 5 - $6.87\n"
                );
		int product = keyboard.nextInt(); // get input for product number
                
                /**
                 * the switch statement below is based off the users input and 
                 * will set the price variable in each loop based on the 
                 * selection.
                 */
                
		switch (product){ 
		case 1:
			price = 2.98;// product 1
			break;
		case 2:
			price = 4.5;// product 2
			break;
		case 3:
			price = 9.98;// product 3
			break;
		case 4:
			price = 4.49;// product 4
			break;
		case 5:
			price = 6.87;// product 5
			break;
		default:
			checkout = true;// checkout on -1 (or any invalid number)
		}

                /**
                 * if the user is NOT ready to checkout, ask for the quantity 
                 * of the product chosen
                 */
                if (!checkout) {
		System.out.println("Enter number(s) of this product sold: ");
		quantity = keyboard.nextInt();// set quantity variable
		}
                
                productTotal = price * quantity;//Calculate total of this product
		total += productTotal; // caculate overall total
                
                /**
                 * The if statement below adds a string to our summary variable
                 * which displays the products entered, the quantity of those
                 * products, and the final price of each product in the 
                 * following format:
                 * 
                 * Product 4 * 99 - $444.51
                 * Product 1 * 100 - $298.00
                 */
                if (!checkout) {
                if (price == 2.98)
                {
                 summary += "\nProduct 1 * " + quantity + " - $" + decimalPlaces.format(productTotal);   
                }else if (price == 4.5)
                {
                 summary += "\nProduct 2 * " + quantity + " - $" + decimalPlaces.format(productTotal);   
                }else if (price == 9.98)
                {
                 summary += "\nProduct 3 * " + quantity + " - $" + decimalPlaces.format(productTotal);   
                }else if (price == 4.49)
                {
                 summary += "\nProduct 4 * " + quantity + " - $" + decimalPlaces.format(productTotal);   
                }else if (price == 6.87)
                {
                 summary += "\nProduct 5 * " + quantity + " - $" + decimalPlaces.format(productTotal);
                }
                }
                        
        }// end loop
        
                /**
                 * This is our checkout summary which puts all the pieces together
                 * and displays the total in the following format:
                 * 
                 * Thank you for your purchase!
                 * your cart summary is below: 
                 * 
                 * Product 4 * 99 - $444.51
                 * Product 1 * 100 - $298.0
                 * Product 3 * 100 - $298.0
                 * 
                 * Your total comes to: $1040.51
                 * Your business is appreciated. Have a nice day!
                 */
        	System.out.println("Thank you for your purchase!\n" 
                        +"your cart summary is below: \n"  + summary
                        + "\n\nYour total comes to: $" + decimalPlaces.format(total) + "\n\n"
                        + "Your business is appreciated. Have a nice day!");

    }	
}

