import java.util.Scanner;

public class BestFit {
    public static int findBestFit(int size1, int size2, int space) {
        int rtn;
        if (size1 + size2 <= space) {
            rtn = 3;
        } else if (size1 <= space && size1 > size2) {
            rtn = 1;
        } else if (size2 <= space && size2 > size1) {
            rtn = 2;
        } else {
            rtn = 0;
        }

        return rtn;
    }

    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter space: ");
            int space = kboard.nextInt();

            System.out.print("1: ");
            int s1 = kboard.nextInt();

            System.out.print("2: ");
            int s2 = kboard.nextInt();

            System.out.println(findBestFit(s1, s2, space));
        }
    }
}
