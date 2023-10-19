import java.util.Scanner;

public class Order {
    public static double getOrderTotal(int bp, int nb) {
        int total = bp + nb;
        if (total >= 12) {
            return (double) total * 16.00;
        }
        if (total >= 3) {
            return (double) total * 16.95;
        }
        if (bp == 1 && nb == 1) {
            return 39.95;
        } else {
            return (double) bp * 20.95 + nb * 21.95;
        }

    }

    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);
        while (true) {
            System.out.print("Bp: ");
            int bp = kboard.nextInt();
            System.out.print("Nb: ");
            int nb = kboard.nextInt();

            System.out.println(getOrderTotal(bp, nb));
        }
    }
}
