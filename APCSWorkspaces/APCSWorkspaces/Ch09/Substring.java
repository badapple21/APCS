public class Substring {
    public static String[] allSubStrings(String w) {
        w = w.trim();
        w = w.toLowerCase();
        int n = w.length();
        String[] rtn = new String[(n * (n + 1)) / 2];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                rtn[index] = w.substring(i, j + 1);
                index += 1;
            }
        }

        return rtn;

    }

    public static void output2D(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static String[][] testString(String[] ws) {
        String[][] rtn = new String[ws.length][];

        for (int i = 0; i < ws.length; i++) {
            rtn[i] = allSubStrings(ws[i]);
        }

        return rtn;
    }

    public static void outputArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        String[] ws = {"cat1", "cat2", "cat3"};
        // output2D(testString(ws));
        outputArray(allSubStrings("cat"));
    }
}
