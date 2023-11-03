import java.awt.Color;

public class bestMatchClass {
    public static Color bestMatch(int r, int g, int b) {
        if (r == g && r == b) {
            return Color.GRAY;
        } else if (r > g) {
            if (r > b) {
                return Color.red;
            } else if (b > g) {
                return Color.MAGENTA;
            } else {
                return Color.YELLOW;
            }
        } else if (g > b) {
            if (b > r) {
                return Color.CYAN;
            } else {
                return Color.GREEN;
            }
        }
        return Color.BLUE;
    } 
    public static void main(String[])
}
