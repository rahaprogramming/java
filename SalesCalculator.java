import java.util.Scanner;

public class SalesCalculator 
{
    /*** @param args*/
    public static void main(String[] args) {
//Scanner for keyBoard
        Scanner keyBoard =new Scanner(System.in);
//total Retail
        double totalRetail=0;
// Use a sentinel-controlled loop to determine when the
//program should stop looping and display the final results.
        while(true){
//display menu
            System.out.println("1 -Product 1, $2.98");
            System.out.println("2 -Product 2, $4.50"); 
            System.out.println("3 -Product 3, $9.98"); 
            System.out.println("4 -Product 4, $4.49");
            System.out.println("5 -Product 5, $6.87");
            System.out.println("6 -Exit program");
            System.out.print("Enter product number: ");
                    int productnumber=keyBoard.nextInt();
//exit program
                    if(productnumber==6)
                    {
                        break;
                    }
///Enter quantity sold
                    System.out.print("Enter quantity sold: ");
                    int quantitySold=keyBoard.nextInt();
//use a switch statement to determine the retail price
//                    for each product.
                    switch(productnumber)
                    {
                        case 1:totalRetail+=2.98*quantitySold;
                    break;
                    case 2: totalRetail+=4.50*quantitySold;
                    break;
                    case 3: totalRetail+=9.98*quantitySold;
                    break;case 4:totalRetail+=4.49*quantitySold;
                    break;case 5:totalRetail+=6.87*quantitySold;break;
        }
//display resut
        System.out.println("\nThe total retail value of all products sold: $"+totalRetail);
    }
}
}

