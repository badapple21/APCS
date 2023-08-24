//page 359 #14

public class TestPlace 
{
	//returns true if p1 is equidistant from p2 and p3
	public boolean sameDistance(Place p1, Place p2, Place p3)
	{
		return p1.distance(p2) == p1.distance(p3);
	}

	
	public static void main(String[] args) 
	{
		Point point1 = new Point( 0, 0);
		Point point2 = new Point( -5, 0);
		Point point3 = new Point( 0, 5);
		TestPlace test = new TestPlace();
		
		System.out.println(point1.distance(point2));
		System.out.println(point1.distance(point3));
		System.out.println(test.sameDistance(point1, point2, point3));
		

	}

}
