package Label;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {
  
  public static void main(String[] args) {

    ImageIcon image = new ImageIcon();

    JLabel label = new JLabel();
    label.setText("Bro do you code atall?");
    label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.RIGHT);
    label.setVerticalTextPosition(JLabel.TOP);
    label.setForeground(new Color(0x00FF00));
    label.setFont(new Font("My Boil", Font.PLAIN, 20));

    JFrame frame = new JFrame("My Frame");
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.setVisible(true);

    frame.add(label);
  }
}
