import java.awt.Color;

public class AreaFill {
    private static boolean isValid(Color[][] plane, int row, int col) {
        return row >= 0 && row <= plane.length && col >= 0 && col < plane[0].length;
    }

    public static void fillPool(Color[][] plane, int row, int col, Color color) {
        if (!isValid(plane, row, col) || plane[row][col].equals(color) || plane[row][col].equals(Color.WHITE)) {
            return;
        }

        else {
            plane[row][col] = color;
            fillPool(plane, row + 1, col, color);
            fillPool(plane, row - 1, col, color);
            fillPool(plane, row, col + 1, color);
            fillPool(plane, row, col - 1, color);

        }
    }
}
