import java.util.ArrayList;

public class SortedWordList extends ArrayList<String> {
    int capacity;

    SortedWordList() {
    };

    SortedWordList(int c) {
        capacity = c;
    }

    public int indexOf(String str) {
        return bs(str);
    }

    public boolean contains(String str) {
        if (indexOf(str) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    // public int bs(String str, int start, int end) {
    // int m = (end - start) / 2;

    // if (super.get(m + start).compareToIgnoreCase(str) > 0.0) {
    // if (m == 1) {
    // if (super.get(start + m - 1).compareToIgnoreCase(str) == 0) {
    // return 0;
    // }
    // return (start + m) * -1;
    // }
    // return bs(str, start, m);
    // } else if (super.get(m + start).compareToIgnoreCase(str) < 0.0) {
    // if (m == 0) {
    // if (super.get(start).compareToIgnoreCase(str) == 0) {
    // return start + m;
    // }
    // return -1 * start - 1;
    // }
    // return bs(str, m + start, end);
    // } else if (super.get(m + start).compareToIgnoreCase(str) == 0) {
    // return m;
    // } else {
    // return -1 * m;
    // }
    // }

    public int bs(String str) {

        int start = 0;
        int end = super.size() - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (super.get(mid).compareToIgnoreCase(str) == 0) {
                return mid;
            }

            else if (super.get(mid).compareToIgnoreCase(str) < 0) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return (end + 1) * -1 - 1;
    }

    public String set(int i, String str) {
        if (i == 0 || (super.get(i - 1).compareToIgnoreCase(str) <= 0)) {
            if (super.size() == i + 1 || super.get(i + 1).compareToIgnoreCase(str) >= 0) {
                String rtn = super.get(i);
                super.set(i, str);
                return rtn;
            }
        }
        throw new IllegalArgumentException("word=" + str + " i=" + i);
    }

    public void add(int i, String str) {
        if (super.size() == 0) {
            super.add(str);
            return;

        }

        else if (contains(str)) {
            throw new IllegalArgumentException("word=" + str + " i=" + i);
        }

        else if (i == 0 || (super.get(i - 1).compareToIgnoreCase(str) <= 0)) {
            if (super.size() == i || super.get(i).compareToIgnoreCase(str) >= 0) {
                super.add(i, str);
                return;
            } else {
                throw new IllegalArgumentException("word=" + str + " i=" + i);
            }
        }

        throw new IllegalArgumentException("word=" + str + " i=" + i);
    }

    public boolean add(String str) {
        if (super.size() == 0) {
            super.add(str);
            return true;
        }
        if (contains(str)) {
            return false;
        }

        add(bs(str) * -1 - 1, str);
        return true;
    }

}
