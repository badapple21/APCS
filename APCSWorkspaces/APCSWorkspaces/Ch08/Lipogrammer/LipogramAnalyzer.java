public class LipogramAnalyzer {
    String text = " ";

    LipogramAnalyzer(String s) {
        for (int i = 0; i < s.length(); i++) {
            text += Character.toLowerCase(s.charAt(i));
        }
        text = text + " ";
    }

    public String allWordsWith(char letter) {
        String word;
        letter = Character.toLowerCase(letter);
        String rtn = "\n";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                word = ExtractWord(i - 1);
                if (rtn.indexOf("\n" + word + "\n") == -1) {
                    rtn = rtn + word + "\n";
                }
            }
        }

        return rtn.substring(1);
    }

    public String mark(char letter) {
        String rtn = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == letter) {
                rtn += "#";
            } else {
                rtn += text.charAt(i);
            }
        }
        return rtn.trim();
    }

    private String ExtractWord(int i) {
        i = i + 1;
        String s;
        int pos1 = 0;
        int pos2 = 0;

        while (Character.isLetter(text.charAt(i + pos1))) {
            pos1++;
        }

        while (Character.isLetter(text.charAt(i - pos2))) {
            pos2++;
        }

        s = text.substring(i - pos2, i + pos1);

        return s.trim();
    }

    public static void main(String[] args) {
        LipogramAnalyzer test = new LipogramAnalyzer("Hello,i am not slow");
        System.out.println(test.text.charAt(7));
        System.out.println(test.ExtractWord(7));
    }
}