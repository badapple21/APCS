import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Box;

public class StringTest extends JFrame
    implements ActionListener {
  private JTextField input, result;

  public StringTest() {
    super("String test");
    Box box1 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Input:"));
    box1.add(Box.createVerticalStrut(20));
    box1.add(new JLabel("Result:"));

    input = new JTextField(20);
    input.setBackground(Color.YELLOW);
    input.addActionListener(this);
    input.selectAll();

    result = new JTextField(20);
    result.setBackground(Color.WHITE);
    result.setEditable(false);

    Box box2 = Box.createVerticalBox();
    box1.add(Box.createVerticalStrut(20));
    box2.add(input);
    box2.add(Box.createVerticalStrut(20));
    box2.add(result);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(box1);
    c.add(box2);
    input.requestFocus();
  }

  public String removeTag(String word) {
    word = word.trim();
    String opentag = "";
    String closetag = "";
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == '<') {
        for (int j = 0; j < word.length(); j++) {
          if (word.charAt(j) == '>') {
            opentag = word.substring(i + 1, j);
            for (int g = j; g < word.length(); g++) {
              if (word.charAt(g) == '<' && word.charAt(g + 1) == '/') {
                for (int h = g; h < word.length(); h++) {
                  if (word.charAt(h) == '>') {
                    closetag = word.substring(g + 2, h);
                    if (opentag.equals(closetag)) {
                      return word.substring(j + 1, g);
                    }
                  }
                }
                return word;
              }
            }
            return word;

          }
        }
        return word;

      }
    }

    return word;
  }

  public String cc(String num) {
    String ccNumber = "" + num.charAt(13) + num.charAt(15) + num.charAt(16) + num.charAt(17) + num.charAt(18);
    return ccNumber;
  }

  public String changeName(String name) {
    int i = name.indexOf(",");
    String firstLast = name.substring(i + 1, name.length()) + " " + name.substring(0, i);
    return firstLast.trim();
  }

  public String negative(String str) {
    return str.replaceAll("0", "2").replaceAll("1", "0").replaceAll("2", "1");
  }

  public boolean StartsWith(String Str2) {
    return this.equals(this.substring(0, Str2.length()));
  }

  public boolean EndsWith(String Str2) {
    return this.equals(this.substring(this.length() - Str2.length(), this.length()));
  }

  public boolean isValidISBN(String ISBN) {
    int sum = 0;
    for (int i = 0; i < ISBN.length(); i++) {
      if (i % 2 != 0) {
        sum += (Character.digit(ISBN.charAt(i), 10) * 3);
      } else {
        sum += Character.digit(ISBN.charAt(i), 10);
      }

    }
    return (sum % 10 == 0);

  }

  public boolean isPlaindrome(String word) {
    word = word.toLowerCase();
    for (int i = 0; i < word.length(); i++) {
      if (!Character.isLetter(word.charAt(i))) {
        word = word.substring(0, i) + word.substring(i + 1, word.length());
        i--;
      }
    }

    word.trim();
    int len = word.length() - 1;
    for (int i = 0; i < len; i++) {
      if (word.charAt(i) == word.charAt(len - i)) {
      } else {
        return false;
      }
    }

    return true;
  }

  public void actionPerformed(ActionEvent e) {
    String str = input.getText();

    // String Newstr = String.valueOf(isPlaindrome(str));
    String Newstr = "" + isValidISBN(str);

    // int offset = 0;
    // String Month;
    // String Day;

    // if (str.charAt(1) == '/') {
    // Month = "0" + str.charAt(0);
    // } else {
    // Month = "" + str.charAt(0) + str.charAt(1);
    // offset++;
    // }

    // if (str.charAt(3 + offset) == '/') {
    // Day = "0" + str.charAt(2 + offset);
    // } else {
    // Day = "" + str.charAt(2 + offset) + str.charAt(3 + offset);
    // offset++;
    // }
    // String Year = "" + str.charAt(4 + offset) + str.charAt(5 + offset) +
    // str.charAt(6 + offset)
    // + str.charAt(7 + offset);

    // String Newstr = "" + Day + "-" + Month + "-"
    // + Year;

    result.setText(Newstr);
    input.selectAll();

  }

  public static void main(String[] args) {
    StringTest window = new StringTest();
    window.setBounds(100, 100, 360, 160);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}
