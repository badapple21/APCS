public class totalWage {
    public static double totalWages(double hours, double rate){
        if(hours>40){
            return 40 * rate + (hours-40) * rate * 1.5;
        }
        return hours * rate;
    }
    public static void main(String[] args) {
    
    System.out.println(totalWages(45, 12.5));
}}
