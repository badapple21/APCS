import java.util.Scanner;

public class SwapDigits {
    public static int swap(int num){   

        if(num < 10){
            return Integer.parseInt(num * 10 + "");
        }

        int ones = num % 10;
        int tens = num / 10 % 10;
        int otherDigits = num / 100;

        return Integer.parseInt(otherDigits + "" + ones + "" + tens + "");
    } public static void main(String[] args){
         Scanner kboard = new Scanner(System.in);


        while(true){
            System.out.print("int: ");
            int num = kboard.nextInt();


            System.out.println(swap(num));
        }


    }
}
