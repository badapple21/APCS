// Chapter 7 Question 6

import java.util.Scanner;

public class Population
{
  private static final int startYear = 2021;
  private static final double growthRate = 1.01; // 1 percent growth
                                                   //    per year
  private static final double startingPopulation = 130.3;

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Target population (in million): ");
    double target = input.nextDouble();
    input.close();

    int year = startYear;
    double population = startingPopulation;

    while (population < target)
    {
      population *= growthRate;
      year++;
    }

    System.out.println("The population will reach " + target
         + " million in " + year);
  }
}
