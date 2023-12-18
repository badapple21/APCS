public class rotate {
    public static void rotateRight(int[] a) {
        int temp = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = temp;
    }

    public static void rotateLeft(int[] a) {
        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = temp;
    }

    public static void outputArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static void rotate(int[] a, int d) {
        if (d > 0) {
            for (int i = 0; i < d; i++) {
                rotateRight(a);
            }

        } else {
            for (int i = d; i < 0; i++) {
                rotateLeft(a);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        rotateLeft(arr);
        outputArray(arr);
        rotateRight(arr);
        outputArray(arr);
        rotate(arr, -2);
        outputArray(arr);
        rotate(arr, 4);
        outputArray(arr);



    }
}
