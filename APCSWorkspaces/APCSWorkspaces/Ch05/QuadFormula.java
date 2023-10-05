import java.util.Scanner;

public class QuadFormula {

    public static String Quad(int a, int b, int c) {
        if(((b * b)  - (4 * a * c))<0){
            return "No Real Solutions";
        }

        double ans1 = ((-1 * b) + Math.sqrt(((b * b) - (4 * a * c)))) / (2 * a);
        double ans2 = ((-1 * b) - Math.sqrt(((b * b) - (4 * a * c)))) / (2 * a);

        if(ans1 == ans2){
            return ans1 + "";
        }

       return ans1 + " and " + ans2;

    }

    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);

        System.out.print("a: ");
        int a = kboard.nextInt();

        System.out.print("b: ");
        int b = kboard.nextInt();

        System.out.print("c: ");
        int c = kboard.nextInt();

        kboard.close();

        System.out.println(Quad(a, b, c));
    }

}
