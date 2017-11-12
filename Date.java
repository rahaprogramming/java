/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bodymass;

/**
 *
 * @author Laptop
 */
public class Date {
    

	
   private int month;
   private int day;
   private int year;

   
   
   /******************************************************************************************
    * Constructor for class Date
    * 
    * @param monthValue
    * @param dayValue
    * @param yearValue
    ******************************************************************************************/
   public Date( int monthValue, int dayValue, int yearValue ) {
      
	  month = monthValue;
      day = dayValue;
      year = yearValue;
   
   } 

   
   /******************************************************************************************
    * Setter for variable month
    * 
    * @param monthValue
    ******************************************************************************************/
   public void setMonth( int monthValue ) {
      month = monthValue;
   } 
   
  
   
   /******************************************************************************************
    * Getter for variable month
    * 
    * @return month
    ******************************************************************************************/
   public int getMonth() {
      return month;
   } 

   

   /******************************************************************************************
    * Setter for variable day
    * 
    * @param dayValue
    ******************************************************************************************/
   public void setDay( int dayValue ) {
      day = dayValue;
   } 

   
   
   /******************************************************************************************
    * Getter for variable day
    * 
    * @return day
    ******************************************************************************************/ 
   public int getDay() {
      return day;
   } 

   
   
   /******************************************************************************************
    * Setter for variable year
    * 
    * @param yearValue
    ******************************************************************************************/
   public void setYear( int yearValue ) {
      year = yearValue;
   } 

   
   
   /******************************************************************************************
    * Getter for variable year
    * 
    * @return year
    ******************************************************************************************/ 
   public int getYear() {
      return year;
   }
   
   
   
   /******************************************************************************************
    * displayDate - prints the date
    * 
    * Prints a formatted date. 
    ******************************************************************************************/ 
   public void displayDate() {
      System.out.printf( "%d/%d/%d", getMonth(), getDay(), getYear() );
   } 
   
   

} 

