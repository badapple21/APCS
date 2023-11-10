public class sumDigits {

    public static int getLength(int num) {
        int multiplier = 1;
        int digits = 0;
        while (multiplier <= num) {
            multiplier *= 10;
            digits += 1;
        }
        return digits;
    }

    public static int sumDigits(int n) {
        int digits = getLength(n);
        int sum = 0;
        int digit = 0;
        for(int i = digits;i>0;i--){
            digit = (int) (n/(Math.pow(10, i-1)));
            sum += digit;
            n -= digit * Math.pow(10, i-1);


        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(123456789));
    }
}
