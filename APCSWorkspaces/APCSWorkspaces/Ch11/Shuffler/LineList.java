import java.lang.reflect.Array;
import java.util.ArrayList;

public class LineList {
    ArrayList<String> lines;

    public LineList() {
        lines = new ArrayList<String>();
    }

    public int size() {
        return lines.size();
    }

    public String get(int k) {
        return lines.get(k);
    }

    public void add(String Line) {
        lines.add(Line);
    }

    public String remove(int k) {
        return lines.remove(k);
    }

    public void move(int index, int newIndex) {
        int n = 0;
        int m = 0;
        if (newIndex < index) {
            n++;
        } else {
            m++;
        }
        lines.add(newIndex + m, lines.get(index));
        lines.remove(index + n);
    }

    public void shuffle() {
        int n = lines.size();
        double r;
        int pos;
        String temp;
        while (n >= 2) {
            r = Math.random();
            pos = (int)( r * (n));
            temp = lines.get(n-1);
            lines.set(n-1, lines.get(pos));
            lines.set(pos, temp);
            n--;
        }
    }
}
