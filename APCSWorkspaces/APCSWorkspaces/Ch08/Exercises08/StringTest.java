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

  public boolean isPlaindrome(String word) {
    word = word.replaceAll(" ", "");
    word = word.replaceAll("'", "");
    word = word.replaceAll(",", "");
    word = word.toLowerCase();
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

    String Newstr = String.valueOf(isPlaindrome(str));

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
