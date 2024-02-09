import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry> {
    public DocumentIndex(int s) {
        super(s);
    }

    public DocumentIndex() {
        super();
    }

    public void addWord(String word, int num) {
        boolean a = true;

        if (word.equals("") || word.equals(" "))
            return;

        if (this.size() > 0) {
            for (int i = 0; i < this.size(); i++) {
                if (this.get(i).getWord().toUpperCase().equals(word.toUpperCase())) {
                    a = false;
                    this.get(i).add(num);
                    System.out.println(this);
                }
            }
        }
        if (a) {
            for (int j = 0; j < this.size(); j++) {
                if (word.compareToIgnoreCase(this.get(j).getWord()) < 0) {
                    this.add(j, new IndexEntry(word));
                    this.get(j).add(num);
                    return;

                }
            }
            this.add(this.size(), new IndexEntry(word));
            this.get(this.size() - 1).add(num);

        }
    }

    public void addAllWords(String str, int num) {
        String[] strs = str.split("[, ?.!]+");
        for (String s : strs) {
            this.addWord(s, num);
        }
    }
}
