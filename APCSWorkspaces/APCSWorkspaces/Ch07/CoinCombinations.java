public class CoinCombinations {

    public static int countCoinCombinations(int amount) {
        int quarters = 25;
        int dimes = 10;
        int nickels = 5;
        int pennies = 0;

        int count = 0;

        for (int numQuarters = 0; numQuarters <= amount / quarters; numQuarters++) {
            for (int numDimes = 0; numDimes <= (amount - numQuarters * quarters) / dimes; numDimes++) {
                for (int numNickels = 0; numNickels <= (amount - numQuarters * quarters - numDimes * dimes)
                        / nickels; numNickels++) {
                    pennies = amount - numQuarters * quarters - numDimes * dimes - numNickels * nickels;
                    System.out.println(amount + " Cents = " + numQuarters + " Quarters " + numDimes + " Dimes "
                            + numNickels + " Nickles " + pennies + " pennies ");
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Test the method with 30 cents and $1
        System.out.println("Number of combinations for 142 cents: " + countCoinCombinations(142));
        // System.out.println("Number of combinations for $1: " +
        // countCoinCombinations(100));
    }
}
