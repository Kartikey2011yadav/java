package Experiment;
import java.awt.*;
import javax.swing.*;

class MyCanvas extends JComponent {

    public void paint(Graphics g)
    {

        // draw and display the line
        g.drawLine(30, 20, 80, 90);
    }
}

public class GFG1 {
    public static void main(String[] a)
    {

        // creating object of JFrame(Window popup)
        JFrame window = new JFrame();

        // setting closing operation
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // setting size of the pop window
        window.setBounds(30, 30, 200, 200);

        // setting canvas for draw
        window.getContentPane().add(new MyCanvas());

        // set visibility
        window.setVisible(true);
    }
}
