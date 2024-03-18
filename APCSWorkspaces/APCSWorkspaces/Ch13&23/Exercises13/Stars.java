import java.util.Scanner;

public class Stars {
    public static void PrintStarsB(int n) {
        if (n == 0) {
            System.out.println();
            return;
        }
        PrintStar(n);
        PrintStarsB(n - 1);

    }

    private static void PrintStar(int n) {
        if (n == 0) {
            System.out.println();
            return;
        }
        System.out.print('*');
        PrintStar(n - 1);
    }

    public static void PrintStarsA(int n) {
        if (n == 0) {
            System.out.println();
            return;
        }
        PrintStarsA(n - 1);
        PrintStar(n);

    }

    public static int product(int a, int b) {
        if (b == 1) {
            return a;
        }
        return a + product(a, b - 1);
    }

    public static String process(String str) {
        int n = str.length();
        if (n >= 2) {
            int n2 = n / 2;
            str = process(str.substring(n2)) + process(str.substring(0, n2));
        }
        return str;
    }

    public static boolean isGood(String s) {
        int n = s.length();
        return n < 2 || (s.charAt(0) == s.charAt(n - 1) && isGood(s.substring(1, n - 1)));
    }

    public static void enigma(int n) {
        for (int i = 0; i < n; i++) {
            enigma(i);
            System.out.println("i = " + i + " N = " + n);
        }
    }

    public static int power3(int n) {
        if (n == 0) {
            return 1;
        } else {
            int p = power3(n / 2);
            p *= p;
            System.out.println('L');
            if (n % 2 == 1) {
                p *= 3;
                System.out.println("L");
            }
            return p;
        }
    }

    public static long fibonacci(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3;
        for (int i = 0; i < n; i++) {
            c = n1 + n2;
            n1 = n2;
            n2 = cn3;
        }
        return a;
    }

    public static double computeSequence(int n) {
        if (n == 1) {
            return 1;
        } else {
            double xn = computeSequence(n - 1);
            return 1 + (1 / xn);
        }
    }

    public long countPaths(int x, int y) {
        if (x == 0 || y == 0)
            return 1;
        else
            return countPaths(x, y - 1) + countPaths(x - 1, y);
    }

    public static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
        }
    }

    public static void main(String[] args) {

        System.out.println(computeSequence(2));
    }
}
