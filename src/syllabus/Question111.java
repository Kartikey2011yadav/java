package syllabus;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Question111 extends Frame
{
    Question111()
    {
        Frame f=new Frame();
        f.setVisible(true);
        f.setSize(500,500);
        Label l=new Label("Hello there");
        Button btn=new Button("hey");
        f.add(l);
        f.add(btn);
        btn.setBounds(80,50,100,100);
        l.setBounds(80,30,100,100);
        f.setLayout(null);
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                l.setText("Mouse clicked");
            }
            public void mouseEntered(MouseEvent e) {
                l.setText("Mouse entered");
            }
            public void mouseExited(MouseEvent e) {
                l.setText("Mouse Exited");
            }
            public void mousePressed(MouseEvent e) {
                l.setText("Mouse Pressed");
            }
            public void mouseReleased(MouseEvent e) {
                l.setText("Mouse Released");
            }
        });
        f.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args)
    {
        Question111 obj=new Question111();
    }
}
