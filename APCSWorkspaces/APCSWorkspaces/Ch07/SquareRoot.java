public class SquareRoot {
    public static double sqrtEst(double a) {
        double x = a / 2;
        double diff;

        do {

            x = .5 * (x + a / x);
            diff = x * x - a;
        } while (Math.abs(diff) >= 0.01);

        return x;
    }

    public static void main(String[] args) {
        System.out.println(sqrtEst(72));
    }
}
