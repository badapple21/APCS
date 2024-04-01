public class OLDFraction {

  // ****************** Instance variables ******************

  private int num;
  private int denom;
  public static final int DFLT_DENOM = 10000;

  // ********************* Constructors *********************

  public OLDFraction() // no-args constructor
  {
    num = 0;
    denom = 1;
  }

  public OLDFraction(int n) {
    num = n;
    denom = 1;
  }

  public OLDFraction(int n, int d) {
    if (d != 0) {
      num = n;
      denom = d;
      reduce();
    } else {
      throw new IllegalArgumentException(
          "Fraction construction error: denominator is 0");
    }
  }

  public OLDFraction(OLDFraction other) // copy constructor
  {
    num = other.num;
    denom = other.denom;
  }

  // ******************** Public methods ********************

  // Returns the sum of this fraction and other
  public OLDFraction add(OLDFraction other) {
    int newNum = num * other.denom + denom * other.num;
    int newDenom = denom * other.denom;
    return new OLDFraction(newNum, newDenom);
  }

  // Returns the sum of this fraction and m
  public OLDFraction add(int m) {
    return new OLDFraction(num + m * denom, denom);
  }

  public OLDFraction Subtract(OLDFraction other) {
    int newNum = num * other.denom - denom * other.num;
    int newDenom = denom * other.denom;
    return new OLDFraction(newNum, newDenom);
  }

  public OLDFraction Subtract(int m) {
    return new OLDFraction(num - m * denom, denom);
  }

  // Returns the product of this fraction and other
  public OLDFraction multiply(OLDFraction other) {
    int newNum = num * other.num;
    int newDenom = denom * other.denom;
    return new OLDFraction(newNum, newDenom);
  }

  // Returns the product of this fraction and m
  public OLDFraction multiply(int m) {
    return new OLDFraction(num * m, denom);
  }

  public OLDFraction Divide(OLDFraction other) {
    if (other.getValue() == 0) {
      throw new IllegalArgumentException(
          "CANT DIVIDE BY 0!!");
    } else {
      return new OLDFraction(num * other.denom, denom * other.num);
    }
  }

  public OLDFraction Divide(int m) {
    if (m == 0) {
      throw new IllegalArgumentException(
          "CANT DIVIDE BY 0!!");
    } else {
      return new OLDFraction(num, denom * m);
    }
  }

  // Returns the value of this fraction as a double
  public double getValue() {
    return (double) num / (double) denom;
  }

  public OLDFraction valueOf(double x) {
    return new OLDFraction((int) Math.round(x * DFLT_DENOM), DFLT_DENOM);
  }

  // Returns a string representation of this fraction
  public String toString() {
    return num + "/" + denom;
  }

  // ******************* Private methods ********************

  // Reduces this fraction by the gcf and makes denom > 0
  private void reduce() {
    if (num == 0) {
      denom = 1;
      return;
    }

    if (denom < 0) {
      num = -num;
      denom = -denom;
    }

    int q = gcf(Math.abs(num), denom);
    num /= q;
    denom /= q;
  }

  // Returns the greatest common factor of two positive integers
  private int gcf(int n, int d) {
    if (n <= 0 || d <= 0) {
      throw new IllegalArgumentException(
          "gcf precondition failed: " + n + ", " + d);
    }

    while (d != 0) {
      int temp = d;
      d = n % d;
      n = temp;
    }
    return n;
  }

  public static void main(String[] args) {
    System.out.println(valueOf(14.5));
  }
}
