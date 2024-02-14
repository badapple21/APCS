public class Bill implements Money {
    double num;

    public Bill(int num) {
        this.num = (double) num;
    }

    public double getAmount() {
        return num;
    }

    public String toString() {
        return "$" + num;
    }
}
