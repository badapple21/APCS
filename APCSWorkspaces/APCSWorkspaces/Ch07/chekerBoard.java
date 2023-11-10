public class chekerBoard {

    public static void printCheckerBoard(int n) {
        int printNum = -1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                printNum = -1;
            } else {
                printNum = 1;
            }
            for (int j = 0; j < n; j++) {
                if (printNum == -1) {
                    System.out.print('#');
                } else {
                    System.out.print('O');
                }
                printNum *= -1;
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        printCheckerBoard(7);
    }
}