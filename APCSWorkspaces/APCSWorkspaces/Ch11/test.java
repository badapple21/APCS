import java.util.ArrayList;
import java.util.Scanner;

public class Exercises {
    /**
     * #23 from the ch11 worksheet with Double wrapper class.
     * This will take an ArrayList and find the minimum value in the list
     **/
    public static Double findMinimum(ArrayList<Double> list) {
        double min = list.get(0);
        for (double num : list) {
            if (min > num) {
                min = num;
            }
        }

        return min;
    }

    /**
     * #23 from the ch11 worksheet with primitive double.
     * This will take an ArrayList and find the minimum value in the list
     **/
    public static double findMinimum2(ArrayList<Double> list) {
        Double min = list.get(0);
        for (Double num : list) {
            if (min.compareTo(num) < 0) {
                min = num;
            }
        }

        return min;
    }

    /**
     * #5 on page 333. This will take an array list and put the list in reversed
     * order
     * reverseOrder is going from size() - 1 down to 0
     **/
    public static ArrayList<Double> reverseOrder(ArrayList<Double> list) {
        ArrayList<Double> rtn = new ArrayList<Double>();
        for (int i = list.size(); i >= 0; i--) {
            rtn.add(list.get(i));
        }

        return rtn;
    }

    public static void filter(ArrayList<Double> list1, ArrayList<Double> list2) {
        for (double k : list2) {
            for (int i = list.size() - 1; i >= 0; i--) {
                if (d == list1.get(i)) {
                    list1.remove(k);    
                }
            }
        }
    }

    /**
     * #7 on page 333. This will take two array lists of double.
     * If a value in list 2 is in list 1, it will remove the value from list 1.
     * USING A FOR LOOP
     **/
    public static void filter2(ArrayList<Double> list1, ArrayList<Double> list2) {

    }

    public static void main(String[] args)
   
    {
        /** Add your code from day 1:
        prompt user, store values in an ArrayList, print the ArrayList
        **/
       ___________________________________________
       
//        System.out.println("The minimum value in list 1 is: " + findMinimum(arrLST));
//        System.out.println("The minimum value in list 1 is: " + findMinimum2(arrLST));
       
//        System.out.println("List 1 in reverse order is: " + reverseOrder(arrLST));    
//        System.out.println("List 1 in reverse order is: " + reverseOrder2(arrLST));
       
//        filter(arrLST, arrLST2);
//        System.out.println("List 1 filtered by list 2 using filter is: " + arrLST);
             
//        filter2(arrLST, arrLST2);
//        System.out.println("List 1 filtered by list 2 using filter2 is: " + arrLST);


        kboard.close();
       
    }
}