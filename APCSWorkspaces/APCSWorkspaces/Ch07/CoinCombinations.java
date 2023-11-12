public class CoinCombinations {

    public static int countCoinCombinations(int amount) {
        int quarters = 25;
        int dimes = 10;
        int nickels = 5;

        int count = 0;

        for (int numQuarters = 0; numQuarters <= amount / quarters; numQuarters++) {
            for (int numDimes = 0; numDimes <= (amount - numQuarters * quarters) / dimes; numDimes++) {
                for (int numNickels = 0; numNickels <= (amount - numQuarters * quarters - numDimes * dimes) / nickels; numNickels++) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Test the method with 30 cents and $1
        System.out.println("Number of combinations for 30 cents: " + countCoinCombinations(30));
        System.out.println("Number of combinations for $1: " + countCoinCombinations(100));
    }
}
