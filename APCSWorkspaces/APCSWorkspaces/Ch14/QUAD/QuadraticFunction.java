public class QuadraticFunction {
    private int a, b, c;

    public QuadraticFunction(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double valueAt(double x) {
        return x * x * a + x * b + c;
    }

    public String toString() {
        return a + "x^2+" + b + "x+" + c;
    }

    public boolean equals(QuadraticFunction cmp) {
        return a == cmp.a && c == cmp.c && b == cmp.b;
    }

    public int compareTo(QuadraticFunction cmp) {
        if (a > cmp.a) {
            return 1;
        } else if (a < cmp.a) {
            return -1;
        } else {
            if (b > cmp.b) {
                return 1;
            } else if (b < cmp.b) {
                return -1;
            } else {
                if (c > cmp.c) {
                    return 1;
                } else if (c < cmp.c) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

}
