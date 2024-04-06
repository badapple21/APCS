public class written {
    public static int DC(char[] li, int start, int end) {
        System.out.println("Step");
        int i = (end - start) / 2 + start;
        if (li[i] == 'O') {
            return DC(li, start, i);
        } else if (li[i] == 'X') {
            if (li[i + 1] == 'O') {
                return i + 1;
            } else {
                return DC(li, i, end);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        char[] a = { 'X','O' };
        System.out.println(DC(a, 0, a.length));
    }
}