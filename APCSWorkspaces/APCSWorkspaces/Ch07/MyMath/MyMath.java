import java.util.Scanner;

public class MyMath {
  /**
   * Returns the sum of all integers from 1 to n, if n >= 1,
   * and 0 otherwise.
   */
  public static int sumUpTo(int n) {
    int sum = 0;

    for (int k = 1; k <= n; k++)
      sum += k;

    return sum;
  }

  /**
   * Returns 1 * 2 * ... * n, if n >= 1; otherwise returns 1
   */
  public static long factorial(int n) {
    long f = 1;

    for (int k = 2; k <= n; k++)
      f *= k;

    return f;
  }

  /**
   * Returns true if n is a prime; otherwise returns false
   */
  public static boolean isPrime(int n) {
    if (n == 2)
      return true;
    else if (n <= 1 || n % 2 == 0)
      return false;

    int m = 3;

    while (m * m <= n) {
      if (n % m == 0)
        return false;
      m += 2;
    }

    return true;
  }

  public static void perfectNumbers() {
    int num = 0;
    for (int i = 0; true; i++) {
      if (isPrime((int) Math.pow(2, i) - 1)) {
        System.out.println((int) (Math.pow(2, i - 1) * (Math.pow(2, i) - 1)));
        num++;
      }
      if (num == 4) {
        break;
      }
    }
  }

  public static void mPrimes() {
    int num = 0;
    for (int i = 0; true; i++) {
      if (isPrime((int) Math.pow(2, i) - 1)) {
        System.out.print((int) ((Math.pow(2, i) - 1)) + " ");
        System.out.println((long) (Math.pow(2, i - 1) * (Math.pow(2, i) - 1)));
        num++;
      }
      if (num == 6) {
        break;
      }
    }
  }

  /**
   * Tests Goldbach conjecture for even numbers
   * up to bigNum
   */
  public static boolean testGoldbach(int bigNum) {
    for (int n = 6; n <= bigNum; n += 2) // obviously true for n = 4
    {
      boolean found2primes = false;

      for (int p = 3; p <= n / 2; p += 2) {
        if (isPrime(p) && isPrime(n - p))
          found2primes = true;
      }

      if (!found2primes) {
        System.out.println(n + " is not a sum of two primes!");
        return false;
      }
    }

    return true;
  }

  /*********************************************************************/

  public static void main(String[] args) {
    mPrimes();
  }
}
