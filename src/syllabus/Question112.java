package syllabus;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Question112 {
    int c = 0;
    Question112() {
        final int[] c = {0};
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setSize(600, 500);
        Label l = new Label("Press any key on key");
        Label l1 = new Label("Number of times key pressed:" + c[0]);
        l.setSize(200, 100);
        frame.add(l);
        frame.add(l1);
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                c[0] += 1;
                l.setText("Key is Pressed.");
                l1.setText("Number of times key is  pressed:" + c[0]);
            }
            public void keyReleased(KeyEvent e) {
                l.setText("Key is Released");
            }
            public void keyTyped(KeyEvent e) {
                l.setText("Key is typed");
            }
        });
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        Question112 obj = new Question112();
    }
}
