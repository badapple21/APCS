public class TestFractions {
  public static void testConstructors() {
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

  public static void testArithmetic() {
    Fraction f1 = new Fraction(2, 3);
    Fraction f2 = new Fraction(5, 6);
    Fraction f3 = new Fraction(0, 7);
    int num = 5;
    System.out.print("f1 = ");
    System.out.println(f1);
    System.out.print("f2 = ");
    System.out.println(f2);
    System.out.print("f3 = ");
    System.out.println(f3);

    System.out.print(f1 + " / " + f2 + " = ");
    System.out.println(f1.Divide(f2));

    System.out.print(f1 + " - " + f2 + " = ");
    System.out.println(f1.Subtract(f2));

    System.out.print(f1 + " / " + num + " = ");
    System.out.println(f1.Divide(num));

    System.out.print(f1 + " - " + num + " = ");
    System.out.println(f1.Subtract(num));

    System.out.print(f1 + " / " + f3 + " = ");
    System.out.println(f1.Divide(f3));

  }

  public static void testValues() {
    Fraction f = new Fraction(2, 3);
    System.out.println(f + " = " + f.getValue());
    System.out.println();
  }

  public static void main(String[] args) {
    // // testConstructors();
    // testArithmetic();
    // // testValues();

    System.out.println(Fraction.valueOf(14.0));

  }
}
