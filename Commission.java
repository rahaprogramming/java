/******************************************************************************
 * @Author Ralph Harris
 * CSS 346 - For Mrs. Lindy :)
 * Chapter 07 - Programming Assignment
 * 11/3/2017 at 7:35pm
 * 
 * class called Commission uses a two dimensional array to store
 * employees' commission over four quarters of the year.  Each row of the array 
 * represents a single employee's commission for the entire year, and each
 * column represents the commission of all the employees over one particular 
 * quarter.  A separate class called CommissionTest passes the array as an 
 * argument to the Commission constructor and demonstrates the functionality of 
 * the Commission class.  Commission has getters and setters as well as 
 * methods that perform each of the following: determine the lowest commission 
 * of any employee for the year, determine the highest commission of any
 * employee for the year, determine a particular employee's yearly average, 
 * output a commission bar chart for the entire company's quarterly commission, 
 * output the entire array in tabular form, along with each employee's average 
 * (don't forget table headings). 
 *****************************************************************************/
package commission;
import java.util.Arrays;
import java.util.Scanner;

public class Commission {    
    public static Object array;
        // initialize variables
        static int userChoice;// menu choice
        static double lowestCommission;
        static double highestCommission;
        static double employeeYearlyAverage;
        static String barChart;
        static String table;
        
        /**
         * constructor - passes our array over as commissionArray to "array"
         * @param commissionArray - obviously our array
         * @param employee - employee for average
         * @param choice - choice from menu
         */
        public Commission(double[][] commissionArray, int employee, int choice){
           array = commissionArray;
        }
          
        // set menu choice
        public static void setChoice( int choice ) {
            userChoice = choice;                
        }
        // get menu choice
        public static int getChoice( ) { 
            return userChoice;
        }
        
        // setter for average. needs the array and which employee to average
        public static void setAverage(double[][] array, int employee){
            int columns=0;// qtrs - could've just made this 4 i guess
            double sum = 0;// total for employees commissions           
            for(int j=0;j<array[employee].length;j++){// iterate over commissions
                sum = sum+array[employee][j];// total
                columns++;// qtrs
            }
        employeeYearlyAverage = sum / columns;//final average
        }
        //getter for avg
        public static double getAverage( ) { 
            return employeeYearlyAverage;
        }
        //set lowest commission
        public static void setLowestCommission( double[][] array ) {
            double minValue = array[0][0];// start w/ 1st commission
            for (int i=0; i<array.length; i++){//iterate columns
                for (int j=0; j<array[i].length; j++){//iterate rows
                    //if next commission is lower, it's the lowest
                    if (array[i][j] < minValue) {
                    minValue = array[i][j];
                    }
                }
            }
        lowestCommission = minValue;     // set final lowest value   
        }
        
        //getter for lowest
        public static double getLowestCommission( ) { 
            return lowestCommission;
        }
        
        //highest setter & getter
        public static void setHighestCommission( double[][] array ) {
          double maxValue = 0;// start w/ zero
            for (int i=0; i<array.length; i++){//iterate columns
                for (int j=0; j<array[i].length; j++){//iterate rows
                    if (array[i][j] > maxValue) {// if next is bigger, its the biggest
                    maxValue = array[i][j];
                    }
                }
            }    
        highestCommission = maxValue;// set highest value
        }

        // getter for highest value
        public static double gethighestCommission( ) { 
            return highestCommission;
        }
        
        /**
         * Below is our happy table :) 
         * it displays our array in the following format:
         *              ***** Quarterly Commissions Report ***** 
         *  __________________________________________________________________
         * |  Employee  |   qtr1  |  qtr2  |  qtr3  |  qtr4   |   Averages    |
         *  -----------------------------------------------------------------
         *   Employee1:    $1200.0  $3002.0   1562.0   4005.0   Average: $2442.25
         *   Employee2:    $1522.0  $1002.0   2001.0   2100.0   Average: $1656.25
         *   Employee3:    $2522.0  $1002.0   2563.0   3000.0   Average: $2271.75
         * @param array 
         */
        public static void setTable(double[][] array){
            table =       "             ***** Quarterly Commissions Report *****              \n";
            table +=      "______________________________________________________________________\n";
                table += "|  Employee  |   qtr1   |   qtr2  |   qtr3  |   qtr4   |   Averages    |\n";
                table += " ---------------------------------------------------------------------- \n";
            for ( int columns = 0; columns < array.length; columns++ ) {
            int column=0;       
             double sum;  
                double avg = 0;
                sum = 0;
                int emp = columns + 1;
                
                table += "  Employee"  + emp + ": ";
                
            for ( int rows = 0; rows < array[columns].length; rows++ ){
                sum = sum+array[columns][rows];
                column++;
                avg = sum/column;
                table += "   $" + array[columns][rows];   
            }
            table += "   Average: $" + avg + "\n";
            }
        }
        
        public static String getTable( ) { 
            return table;
        }
        /**
         * The following gives the bar chart in the following format:
         * ** Employee commissions Bar Chart **
         * $0000.00-$1000.00: 
         * $1000.00-$2000.00:  *  *  *  *  * 
         * $2000.00-$3000.00:  *  *  *  *  * 
         * $3000.00-$4000.00: 
         * $4000.00-$5000.00:  * 
         * Over $5000.00!!!!: 
         * @param array 
         */
        
        public static void setBarChart(double[][] array){
            // get the number of stars ready and put everything into the "chart" 
            //string variable
            String chart = "";
            int stars1000 = 0;
            int stars2000 = 0;
            int stars3000 = 0;
            int stars4000 = 0;
            int stars5000 = 0;
            int starsUnlimited = 0;
            // columns
            for ( int columns = 0; columns < array.length; columns++ ) {
            // rows
            for ( int rows = 0; rows < array[columns].length; rows++ ){
                //get number of stars from the array
                System.out.println( array[columns][rows] );
                if (array[columns][rows] > 0 && array[columns][rows] <= 1000){
                    stars1000++;
                }else if (array[columns][rows] >= 1000 && array[columns][rows] <= 2000){
                    stars2000++;
                }else if (array[columns][rows] >= 2000 && array[columns][rows] <= 3000){
                    stars3000++;
                }else if (array[columns][rows] >= 3000 && array[columns][rows] <= 4000){
                    stars4000++;
                }else if (array[columns][rows] >= 4000 && array[columns][rows] <= 5000){
                    stars5000++;
                }
                else if (array[columns][rows] >= 5000){
                    starsUnlimited++;
                }
            }
            }
            // below we make the bar chart
            chart += "** Employee commissions Bar Chart **\n\n";
            chart +=  "$0000.00-$1000.00: " ;
            for ( int star1000 = 0; star1000 < stars1000; star1000++ )
            {
                chart +=  " * " ;
            }
            // start a new line of output
            chart +=  "\n$1000.00-$2000.00: ";
            for ( int star2000 = 0; star2000 < stars2000; star2000++ )
            {
                chart += " * " ;
            }
             // start a new line of output
            chart += "\n$2000.00-$3000.00: " ;
            for ( int star3000 = 0; star3000 < stars3000; star3000++ )
            {
                chart +=  " * ";
            }
             // start a new line of output            
            chart += "\n$3000.00-$4000.00: " ;
            for ( int star4000 = 0; star4000 < stars4000; star4000++ )
            {
                System.out.print( " * " );
            }
            // start a new line of output            
            chart +=  "\n$4000.00-$5000.00: " ;
            for ( int star5000 = 0; star5000 < stars5000; star5000++ )
            {
                chart +=  " * " ;
            }
            // start a new line of output            
            chart +=  "\nOver $5000.00!!!!: " ;
            for ( int starUnlimited = 0; starUnlimited < starsUnlimited; starUnlimited++ )
            {
                chart +=  " * " ;
            }
            chart += "\n"; // start a new line of output           
        barChart = chart;
        } // end BarChart

        // getter for bar chart
        public static String getBarChart( ) { 
            return barChart;
        }
     
        
       
}