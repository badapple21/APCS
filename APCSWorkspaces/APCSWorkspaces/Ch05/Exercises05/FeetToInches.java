// Chapter 5 Question 12

import java.util.Scanner;

public class FeetToInches
{
  public static int toInches(int feet, int inches)
  {

    return feet * 12 + inches;
  }

  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in);

    System.out.print("Feet: ");
    int feet = kboard.nextInt();

    System.out.print("Inches: ");
    int inches = kboard.nextInt();

    kboard.close();

    int totalInches = toInches(feet, inches) ;

    System.out.println(feet + " feet and " + inches + " inches = " + totalInches + " inches");
  }
}
