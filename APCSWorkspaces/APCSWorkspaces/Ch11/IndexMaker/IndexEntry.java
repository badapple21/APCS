import java.util.ArrayList;

public class IndexEntry {
    private String word;
    private ArrayList<Integer> numsList;

    public IndexEntry(String a) {
        word = a.toUpperCase();
        numsList = new ArrayList<Integer>();
    }

    public void add(int num) {
        if (!numsList.contains(num))
            numsList.add(num);
    }

    public String getWord() {
        return word;
    }

    public String toString() {
        String rtn = word + " ";
        for (int n : numsList) {
            rtn = rtn + n + ", ";
        }
        return rtn.substring(0, rtn.length() - 2);
    }

}
