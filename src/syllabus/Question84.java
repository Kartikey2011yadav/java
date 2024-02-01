package syllabus;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Question84 extends Frame {
    Question84(){
        this.setVisible(true);
        this.setSize(500,400);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w){
                System.exit(0);
            }
        });

    }
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.drawRect(100,100,300,200);
        g.setColor(Color.RED);
        g.drawOval(175,125,150,150);
    }

    public static void main(String[] args) {
        Question84 recCir = new Question84();
    }
}
