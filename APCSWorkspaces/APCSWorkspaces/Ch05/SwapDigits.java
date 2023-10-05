import java.util.Scanner;

public class SwapDigits {
    public static String swap(int num){   

        String rtn;

        int ones = num % 10;
        int tens = num / 10 % 10;
        int otherDigits = num / 100;
        if(otherDigits==0){
            rtn = "";
        }else{
            rtn = otherDigits + "";
        }

        return rtn + "" + ones + "" + tens + "";
    } public static void main(String[] args){
         Scanner kboard = new Scanner(System.in);


        while(true){
            System.out.print("int: ");
            int num = kboard.nextInt();


            System.out.println(swap(num));
        }


    }
}
