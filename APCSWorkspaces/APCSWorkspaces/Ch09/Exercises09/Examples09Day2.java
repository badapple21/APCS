import java.util.Scanner;

public class Examples09Day2 {
    public static int[][] input2D(int r, int c) {
        int[][] arr = new int[r][c];

        Scanner kboard = new Scanner(System.in);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Enter and Integer for [" + i + "][" + j + "]");
                int x = kboard.nextInt();
                arr[i][j] = x;
            }
        }

        kboard.close();
        return arr;
    }

    public static void output2D(int[][] a) {
        for(int i = 0; i < a.length;i++){
            for(int j = 0; j < a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }

    }

    public static int positiveMax(int[][] m) // page 261 #14
    {

        int max = 0;

        for(int e : m){
            if(e>max){
                max = e;
            }
        }

        return max;

    }

    public static int sumElements(int[] m) // page 262 #18a
    {
        int sum = 0;

        for(int e : m){
            sum +=e;
        }

        return sum;

    }

    public static int[] sumOfRows(int[][] t) // page 262 #18b
    {
        int[] sums = new int[t.length];

        for(int i = 0; i < t.length;i++){
            for(int j = 0; j < t[i].length;j++){
                sums[j] += t[i][j];
            }
        }

        return sums;

    }

    // public static void outputArray(int[] arr) {
    //     // Copy your outputArray method from the ExamplesDay1 class
    // }

    public static void main(String[] args) {
        int[][] arr2 = { { 3, 5 }, { 7, 9 }, { 12, 4, 6 }, { -4, 4 } };
        output2D(arr2);

    }
}
