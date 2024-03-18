public class Examples13 {
    public static int findMin(int[] list, int n) {
        int min = list[n - 1];

        if (n == 1) {
            return min;
        } else {
            if (findMin(list, n - 1) < min) {
                return findMin(list, n - 1);
            } else {
                return min;
            }
        }

    }

    public static int sumDigits(int n) {
        if (n < 10) {
            return (n % 10);
        } else {
            return n % 10 + sumDigits(n / 10);
        }
    }

    public static boolean isDivBy3(int n) {
        if (n < 10) {
            return (n == 3 || n == 6 || n == 9);
        } else {
            return isDivBy3(sumDigits(n));
        }
    }

    public boolean contains(String name) {
        for (FileItem child : children) {
            if (child.getName().equals(name)) {
                return true;
            } else if (child instanceof Folder) {
                if (((Folder) child).contains(name)) {
                    return true;
                }
            }
        }
        return false;
    }

}

    public static void main(String[] args) {
        int[] arr = { 2, 4, 9, 1, -3, 7, 8 };
        // System.out.println(findMin(arr,7));
        // System.out.println(sumDigits(123456788));
        System.out.println(isDivBy3(123456788));
    }
}