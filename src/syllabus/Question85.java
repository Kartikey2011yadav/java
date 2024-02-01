package syllabus;

import java.awt.*;
public class Question85 extends Question84 {
    Question85(){
        super();
    }
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(100,100,300,200);
        g.setColor(Color.RED);
        g.fillOval(175,125,150,150);
    }
    public static void main(String[] args) {
        Question85 recCirFill = new Question85();
    }
}
