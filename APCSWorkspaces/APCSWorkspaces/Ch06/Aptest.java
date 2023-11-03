public class Aptest {
    public static double for_loop(int n){
        double sum = 0;
        for(int i = n;i>0;i--){
            sum += (1.0/(i*i));
        }
        return sum;
    }
    public static double do_while_loop(int n){
        double sum = 0;
        do{
            sum += 1.0/(n*n);
            n--;
        }while(n>0);

        return sum;
    }

    public static double while_loop(int n){
        double sum = 0;
        while(n>0){
            sum += 1.0/(n*n);
            n--;
        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(for_loop(999999));
    }
}
