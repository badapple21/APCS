public class Comparator {
    boolean ifa = false;

    Comparator(char l) {
        if (l == 'a') {
            ifa = true;
        }
    }

    public int compare(Complex a, Complex b) {
        if (ifa) {
            if (a.geta > b.geta) {
                return 1;
            } else if (a.geta < b.geta) {
                return -1;
            }
            return 0;
        } else {
            return Complex.compare(a, b);
        }
    }
}
