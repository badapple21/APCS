import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kboard = new Scanner(System.in);
		
		System.out.print("What are your numbers: ");
		int num1 = kboard.nextInt();
		
		int num2  = kboard.nextInt();
		
		System.out.println(num1  + " * " + num2 + " = " + num1*num2);
	}

}
