/**
 * This program prompts the user to enter his or her
 * first name and last name and displays a greeting message.
 * Author: Maria Litvin
 */

 import java.util.Scanner;

 public class favorite
 {
   public static void main(String[] args)
   {
     Scanner kboard = new Scanner(System.in);
 
     System.out.print("what is your 5k time:  ");
     int time = kboard.nextInt();
    
     float pace = time/5;

     System.out.println("your 5k time is " + time);
     System.out.println("Thats " + pace + " min per kilometer");
 
     kboard.close();
   }
 }
 
