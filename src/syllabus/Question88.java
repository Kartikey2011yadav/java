package syllabus;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Question88 extends Frame {
    public Question88(){
        this.setVisible(true);
        this.setSize(500,400);
        this.setLayout(new BorderLayout(10, 10));
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w){
                System.exit(0);
            }
        });
    }
    void buttons(){
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");
        Button btn5 = new Button("Button 5");
        this.add(btn1, BorderLayout.NORTH);
        this.add(btn2, BorderLayout.SOUTH);
        this.add(btn3, BorderLayout.EAST);
        this.add(btn4, BorderLayout.WEST);
        this.add(btn5, BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        Question88 btn = new Question88();
        btn.buttons();
    }
}
