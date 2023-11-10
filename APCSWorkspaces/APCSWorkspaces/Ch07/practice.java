public class practice {

    public static void qaddr(int m, int n){
        int i = 0;
        while(m >= n){
            m-=n;
            i++;
        }
        System.out.println(m);
        System.out.println(i);
    }

    public static int GCF(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static int addOdds(int n){
        int sum = 0;
        for(int i = 1; i <= n; i+=2){
            sum += i;
        }
        return sum;
    }

    public static void addNum(int n){
        System.out.println(1);
        int sum = 1;
        for(int i = 1; i>0;i--){
            System.out.print(i + " + "); 
            sum+=i;
        }
        System.out.print(" = " + sum);
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 32;
        qaddr(26, 3);

    }
}