/**
 * This is a test class for the Fraction class
 * Author: Blair
 */

public class TestFractions
{
  public static void testConstructors()
  {
    Fraction f1 = new Fraction();
    Fraction f2 = new Fraction(7);
    Fraction f3 = new Fraction(12, -20);
    Fraction f4 = new Fraction(f3);

    System.out.println("f1 = " + f1);
    System.out.println("f2 = " + f2);
    System.out.println("f3 = " + f3);
    System.out.println("f4 = " + f4);
    System.out.println();
  }

  public static void testCompareTo()
  {
      Fraction f1 = new Fraction(1,3);
      Fraction f2 = new Fraction(1,5);
      Fraction f3 = new Fraction(1,2);
      Fraction f4 = new Fraction(1,4);
      Fraction [] list = {f1, f2, f3,f4 };
    
      for(Fraction f: list)
      {
          System.out.println(f);
      }
    
      System.out.println();
    
      Arrays.sort(list);
    
      for(Fraction f: list)
      {
          System.out.println(f);
      }
    
      System.out.println();
  }


public static void testEquals()
{
    Fraction f1 = new Fraction(1,2);
    Fraction f2 = new Fraction(1,3);
    Fraction f3 = new Fraction(1,4);
    Fraction f4 = new Fraction(1,5);
    ArrayList<Fraction> list = new ArrayList<Fraction>();
    list.add(f1);
    list.add(f2);
    list.add(f3);
    list.add(f4);
    System.out.println(list);
   
    System.out.println(list.contains(new Fraction (1,3)));
    System.out.println(list.contains(new Fraction (1,6)));

    System.out.println( list.indexOf(new Fraction (1,4)));
    System.out.println( list.indexOf(new Fraction (1,6)));    
}
  public static void testArithmetic()
  {
    Fraction f1 = new Fraction(1, 2);
    Fraction f2 = new Fraction(1, 3);

    Fraction sum = f1.add(f2);
    System.out.println(f1 + " + " + f2 + " = " + sum);

    Fraction product = f1.multiply(f2);
    System.out.println(f1 + " * " + f2 + " = " + product);

    System.out.println();
  }

  public static void testValues()
  {
    Fraction f = new Fraction(2, 3);
    System.out.println(f + " = " + f.getValue());
    System.out.println();
  }



  public static void main(String[] args)
  {
    testEquals();
    testCompareTo();
  }
}
