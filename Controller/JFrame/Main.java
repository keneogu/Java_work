package JFrame;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;

public class Main {

  public static void main(String[] args) {
    // JFrame = a GUI window to add components to
    JFrame frame = new JFrame("My Frame");
    frame.setSize(400, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);  
  
    JButton button = new JButton("click me!");
    frame.add(button);

    frame.getContentPane().setBackground(new Color(123,50,250));
    frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.repaint();
  }
}
