// Chapter 5 Question 20


import java.util.Scanner;

public class WaitForBus
{
	/*
	 * curHour and curMin represent the current time, and depHour, depMin represent the departure time of a bus.  
	 * Both times are between 1 pm and 11 pm of the same day.
	 * This method will display the waiting time in hours and minutes
	 */
  public static void waitTime(int curHour, int curMin, int depHour, int depMin)
  {
	  int totalMins = (depHour - curHour) * 60 + (depMin - curMin);
	  System.out.println ("The bus will depart in " + totalMins/60 + " hours and " + (totalMins%60) + " minutes");
   
  }

  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);

    System.out.print("Current Hour: ");
    int cH = kboard.nextInt();

    System.out.print("Current Minutes: ");
    int cM = kboard.nextInt();
    
    System.out.print("Departure Hour: ");
    int dH = kboard.nextInt();

    System.out.print("Departure Minutes: ");
    int dM = kboard.nextInt();

    kboard.close();
    
    waitTime(cH, cM, dH, dM);

    

    
  }
}