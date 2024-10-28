/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author sivagamasrinivasan
 jn 22nd
 */
public class Days {
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       
         
   /* Scanner in =new Scanner(System.in);
    System.out.println("Enter the day number (one,two,three,four,five) in string");
    String code = in.next();
    Weekdays t= new Weekdays();
    t.nameOfDay(code); 
    */
   
  
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the day of the week (e.g., MONDAY): ");
        String userInput = input.nextLine().toUpperCase();

        // Convert user input to a Day enum
        Day selectedDay;
        try {
            selectedDay = Day.valueOf(userInput);
            Weekdays weekdays = new Weekdays();
            weekdays.printDay(selectedDay);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid day entered. Please enter a valid day of the week.");
 }


     
        }
    }

    // TODO code application logic here
    
    

