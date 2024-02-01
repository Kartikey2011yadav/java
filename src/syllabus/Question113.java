package syllabus;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Question113 {
    Frame f;
    Question113()
    {
        f = new Frame();
        Button btn1 = new Button("1");
        btn1.setBackground(Color.ORANGE);
        Button btn2 = new Button("2");
        btn2.setBackground(Color.ORANGE);
        Button btn3 = new Button("3");
        btn3.setBackground(Color.ORANGE);
        Button btn4 = new Button("4");
        btn4.setBackground(Color.ORANGE);
        Button btn5 = new Button("5");
        btn5.setBackground(Color.ORANGE);
        Button btn6 = new Button("6");
        btn6.setBackground(Color.ORANGE);
        Button btn7 = new Button("7");
        btn7.setBackground(Color.ORANGE);
        Button btn8 = new Button("8");
        btn8.setBackground(Color.ORANGE);
        Button btn9 = new Button("9");
        btn9.setBackground(Color.ORANGE);

        f.add(btn1); f.add(btn2); f.add(btn3);
        f.add(btn4); f.add(btn5); f.add(btn6);
        f.add(btn7); f.add(btn8); f.add(btn9);

        f.setLayout(new GridLayout(3, 3, 20, 25));
        f.setSize(300, 300);
        f.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }
    public static void main(String[] args) {
        Question113 Gl = new Question113();
    }
}
