import java.util.Scanner;

public class Leapyear {

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter a year: ");
            int year = kboard.nextInt();
            if (isLeapYear(year))
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is NOT a leap year.");
        }
    }
}
