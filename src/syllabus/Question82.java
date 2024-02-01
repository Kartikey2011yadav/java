package syllabus;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Question82 extends Frame {
    public Question82() {
        this.setVisible(true);
        this.setSize(500,400);
        this.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent w){
            System.exit(0);
        }
        });
    }
    public void paint(Graphics g){
        g.drawLine(10,100,250,100);
    }

    public static void main(String[] args) {
        Question82 line = new Question82();
    }
}
