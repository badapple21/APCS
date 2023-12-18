import java.util.Arrays;

public class Polynomial {
    private double[] c;

    Polynomial(double[] a) {
        c = new double[a.length];
        for (int i = 0; i < c.length; i++) {
            c[i] = a[i];
        }
    }

    public int degree() {
        return c.length - 1;
    }

    public double getValue(double x) {
        double rtn = 0;
        for (int i = 0; i < c.length; i++) {
            double base = x;
            double pow = i;
            double co = c[i];
            rtn = (Math.pow(base, pow) * co) + rtn;
        }
        return rtn;
    }

    public String toString() {
        String rtn = "";
        for (int i = c.length; i > 0; i--) {
            rtn = rtn + "" + c[i-1] + "(x)" + "^" + (i-1) + " + ";
        }
        return rtn.substring(0, rtn.length()-3);
    }

    public static void main(String[] args) {
        double[] d = { 2, -3, 4, 0.5 };
        Polynomial p = new Polynomial(d);
        System.out.println("The degree of " + p + " is " + p.degree());
        System.out.println("p(-2.5) = " + p.getValue(-2.5));
    }
}
