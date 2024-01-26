public class Complex {
    double a, b;

    public Complex(double num1) {
        a = num1;
        b = 0.0;
    }

    public Complex(double num1, double num2) {
        a = num1;
        b = num2;
    }

    public double abs() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public Complex add(Complex other) {
        return new Complex((a + other.a), (b + other.b));
    }

    public Complex add(double num) {
        Complex other = new Complex(num);
        return new Complex((a + other.a), (b + other.b));
    }

    public Complex multiply(Complex other) {
        return new Complex((a * other.a) - (b * other.b), (a * other.b) + (b * other.a));
    }

    public Complex multiply(double num) {
        Complex other = new Complex(num);
        return new Complex((a * other.a) - (b * other.b), (a * other.b) + (b * other.a));

    }

    public String toString() {
        return "" + a + " + " + b + "i";
    }

    public static void main(String[] args) {

        double a = -2;
        double b = 8;
        double c = 5;
        double d = -3;

        Complex c1 = new Complex(a, b);
        Complex c2 = new Complex(c, d);
        System.out.println(c1.abs());
        System.out.println(c2.abs());
        System.out.println(c1.add(c2));
        System.out.println(c1.add(-3.5));
        System.out.println(c1.multiply(c2));
        System.out.println(c1.multiply(2.1));
    }
}
