
public class TestIncrementOperators {

	public static void main(String[] args) {
		
		int total = 10;
		int x = 5; 
		
		total = total + x++;
		System.out.println("total: " + total + " x: " + x);
		
		total = 10;
		x = 5; 
		total = total + ++x;
		System.out.println("total: " + total + " x: " + x);
		
		total = 10;
		x = 5; 
		total = total + x--;
		System.out.println("total: " + total + " x: " + x);
				
		total = 10;
		x = 5; 
		total = total + --x;
		System.out.println("total: " + total + " x: " + x);
		

	}

}
