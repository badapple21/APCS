import java.util.Scanner;
import Cylinder;

public class CylinderTest {
    public static void main(String[] args ){
        Scanner kboard = new Scanner(System.in);
		
		System.out.print("What is the radius: ");
        int radius = kboard.nextInt();

        System.out.print("What is the height: ");
        int height = kboard.nextInt();


        Cylinder myCylinder = new Cylinder(radius, height);

        System.out.println(myCylinder.getArea());

    }
}
