package syllabus;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Question83 extends Frame {
    boolean isParallel;
    public Question83(boolean isParallel) {
        this.isParallel = isParallel;
        this.setVisible(true);
        this.setSize(500,400);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w){
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g){
        if(isParallel){
            g.drawLine(10,100,250,100);
            g.drawLine(10,150,200,150);
        }
        else {
            g.drawLine(300,200,450,200);
            g.drawLine(375,100,375,300);
        }
    }
    public static void main(String[] args) {
        Question83 Perpendicular = new Question83(false);
        Question83 Parallel = new Question83(true);
    }

}
