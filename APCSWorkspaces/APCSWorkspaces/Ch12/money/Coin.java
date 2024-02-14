public class Coin implements Money {
    Double amount;

    public Coin(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
