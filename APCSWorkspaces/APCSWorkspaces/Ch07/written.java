import java.util.Scanner;

public class written {

    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);
        final double PRICE = 0.26;
        int quantity;

        char answer = ' ';
        int ctn = 1;

        while (ctn == 1) {
            System.out.print("Enter quantity: ");
            quantity = kboard.nextInt();
            kboard.nextLine();

            if (quantity % 25 == 0) {
                System.out.printf("You have ordered %d Ripples -- $%.2f\n\n", quantity, PRICE * quantity);
            } else {
                System.out.println("Ripples can only be ordered in packs of 25");
            }

            answer = ' ';
            while (answer != 'y' && answer != 'n') {
                System.out.print("Next Customer: ");
                String str = kboard.nextLine().trim();
                if (str.length() == 1) {
                    answer = str.charAt(0);
                } else {
                    answer = ' ';
                }
            }
            if (answer == 'y') {
                ctn = 1;
            } else {
                ctn = 0;
            }

        }

    }
}
