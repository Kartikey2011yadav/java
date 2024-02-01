package syllabus;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Question87 extends Frame {
    Label msg;
    Button btn;
    Question87(){
        this.setVisible(true);
        this.setSize(500,400);
        this.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent w){
            System.exit(0);
        }
    });
    }
    void message(){
        msg = new Label("Button Clicked!!!!!");
        msg.setBounds(180,170,280,30);
        msg.setForeground(Color.BLUE);
        this.add(msg);
        msg.setVisible(false);
    }
    void button(){
        btn = new Button("Click Me..");
        btn.setBounds(100,170,280,30);
        btn.setBackground(Color.GREEN);
        this.add(btn);
        this.setLayout(null);
        this.setVisible(true);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                btn.setVisible(false);
                msg.setVisible(true);
            }
        });
    }
    public static void main(String[] args) {
        Question87 btnClick = new Question87();
        btnClick.message();
        btnClick.button();
    }
}
