public class Test {

    public static int[] mpt(int num1, int num2) {
        int[] rtn = new int[3];
        int m, n, a, b, c;
        if (num1 > num2) {
            m = num1;
            n = num2;
        } else {
            m = num2;
            n = num1;
        }

        rtn[0] = m * m - n * n;
        rtn[1] = 2 * m * n;
        rtn[2] = m * m + n * n;

        return rtn;

    }

    public static int[] wedge(int n) {
        int[] rtn = new int[n * 2 - 1];
        for (int i = 0; i < n - 1; i++) {
            rtn[i] = i + 1;
            rtn[n * 2 - i - 2] = i + 1;
        }
        rtn[n - 1] = n;

        return rtn;
    }

    public static int[] fib(int n) {
        int[] rtn = new int[n + 1];
        rtn[0] = 0;
        rtn[1] = 1;
        for (int i = 2; i <= n; i++) {
            rtn[i] = rtn[i - 1] + rtn[i - 2];
        }

        return rtn;

    }

    public static boolean isMedian(double[] sample, double m) {

        int lessCount = 0;
        int equalCount = 0;
        int greaterCount = 0;

        for (double value : sample) {
            if (value < m) {
                lessCount++;
            } else if (value == m) {
                equalCount++;
            } else {
                greaterCount++;
            }
        }

        if (sample.length % 2 == 0) {
            return equalCount > 0 && (lessCount == greaterCount || lessCount == greaterCount - 1);
        } else {
            return equalCount > 0 && lessCount == greaterCount;
        }
    }

    public static void outputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        outputArray(fib(6));

    }
}