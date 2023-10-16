public class cost {

    public static double computeShippingCost(int nJars) {
        int nCartons = (nJars + 11) / 12;
        int totalOunces = (nJars * 21) + (nCartons * 25);
        int lbs = totalOunces / 16;
        return lbs * 0.96 + 3.00;
    }

    

    public static void main(String[] args) {
        System.out.println(Area(6.0, 6.0, 6.0));
    }
}