import java.lang.reflect.Array;
import java.util.ArrayList;

public class written {
    public static ArrayList<Integer> remove(ArrayList<Integer> l) {
        int min = l.get(0);
        int minIndex = 0;

        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).compareTo(min) < 0) {
                min = l.get(i);
                minIndex = i;
            }
        }

        l.remove(minIndex);
        return l;
    }

    public static void removeConsecutiveDuplicate(ArrayList<String> lst) {
        for (int i = lst.size() - 1; i > 0; i--)
            if (lst.get(i).equals(lst.get(i - 1)))
                lst.remove(i);
    }

    public static ArrayList<ArrayList<String>> buckets(ArrayList<String> words) {
        ArrayList<ArrayList<String>> b = new ArrayList<ArrayList<String>>();

        for (int i = 0; i < 26; i++) {
            b.add(new ArrayList<>());
        }

        for (String word : words) {
            char letter = word.toLowerCase().charAt(0);
            int index = letter - 'a';
            b.get(index).add(word);
        }

        return b;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(6);

        System.out.println("Original List: " + numbers);

        remove(numbers);

        System.out.println("List after removing the minimum element: " + numbers);
    }
}
