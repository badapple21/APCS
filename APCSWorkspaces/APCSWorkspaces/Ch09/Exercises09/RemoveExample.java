public class RemoveExample 
{

public static void outputArray( int[] arr)
	{
		for( int i = 0; i < arr.length; i++)
			System.out.print( arr[i] + " ");
		System.out.println();
	}


public static boolean remove(int[] arr, int k)
{
  		 //Complete the method.
}


public static void main(String[] args) 
    	{
   int[] b = {1, 8, 5, 7, 9, 2, 4, 3, 6};
        
        if( !remove(b, 9))
            System.out.println("Out of bounds");
        else
            outputArray(b);
        
        if( !remove(b, 2))
            System.out.println("Out of bounds");
        else
            outputArray(b);
        
        if( !remove(b, 0))
            System.out.println("Out of bounds");
        else
        outputArray(b);
        if( !remove(b, 6))
            System.out.println("Out of bounds");
        else
            outputArray(b);   
}
}
