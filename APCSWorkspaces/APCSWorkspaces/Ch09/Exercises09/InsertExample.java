public class InsertExample 
{

public static void outputArray( int[] arr)
	{
		for( int i = 0; i < arr.length; i++)
			System.out.print( arr[i] + " ");
		System.out.println();
	}


public static boolean insert(int[] arr, int count, int value)
{
    int index = 0;
    if(count >= arr.length){
        return false;
    }
    for(int i = 0; i < arr.length;i++){
        if(arr[i]>value){
            index = i;
            break;
        }
        index = i;
    }

    for(int j = count;j>index;j--){
        arr[j] = arr[j-1];
    }
    arr[index] = value;
    return true;
}

 	public static void main(String[] args) 
    	{
       int[] a = { 3, 9, 15, 28, 37, 64, 0, 0, 0 };
        if ( !insert(a, 6, 18))
            System.out.println( "No room");
        else
            outputArray(a);
        if ( !insert(a, 7, 2))
            System.out.println( "No room");
        else
            outputArray(a);
  
        if ( !insert(a, 8, 78))
            System.out.println( "No room");
        else
            outputArray(a);
        
        if ( !insert(a, 9, 20))
            System.out.println( "No room");
        else
            outputArray(a);
}
}
