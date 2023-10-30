import java.util.Scanner;

public class Square {
    public static boolean isSquare(int n){
        return (Math.sqrt(n)*Math.sqrt(n) == n);
    }
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter a number: ");
            int n = kboard.nextInt();
            System.out.println(isSquare(n));
          
        }
    }
}
