public class Examples09Day1 {
   public static void outputArray(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);
      }
   }

   public static void swapFirstLast(int[] arr) {
      int temp1 = arr[0];
      int temp2 = arr[arr.length - 1];

      arr[0] = temp2;
      arr[arr.length - 1] = temp1;
   }

   public static double averageTopTwo(int[] scores) {
      int i, n = scores.length;
      int iMax1 = 0;
      int iMax2 = 1;
      
      if (scores[iMax2] > scores[iMax1]) {
         i = iMax1;
         iMax1 = iMax2;
         iMax2 = i;
      }

      for (i = 2; i < n; i++) {
         if (scores[i] > scores[iMax1]) {
            iMax2 = iMax1;
            iMax1 = i;
         }

         else if (scores[i] > scores[iMax2]) {
            iMax2 = i;
         }
      }
      return (double)(scores[iMax1] + scores[iMax2]) / 2;
   }

   public static void main(String[] args) {
      int[] a = { 1, 2, 3, 4, 5 ,60,100};
      int[] b = new int[3];
      b[0] = 1;
      b[1] = 2;
      b[2] = 3;

      int[] c;
      c = new int[3];

      
      System.out.println(averageTopTwo(a));

   }
}