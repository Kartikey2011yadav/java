package syllabus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Question115 extends Frame
{
    Question115()
    {
        JFrame f=new JFrame();
        String[] color={"Select","Red","Blue","Yellow","Green","Gray","Magenta","Orange","Pink"};
        JComboBox jc=new JComboBox(color);
        jc.setBounds(30,30,100,20);
        f.setSize(500,500);
        f.add(jc);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        jc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color=(String) jc.getItemAt(jc.getSelectedIndex());
                switch (color) {
                    case "Red" -> f.getContentPane().setBackground(Color.RED);
                    case "Blue" -> f.getContentPane().setBackground(Color.BLUE);
                    case "Yellow" -> f.getContentPane().setBackground(Color.YELLOW);
                    case "Green" -> f.getContentPane().setBackground(Color.GREEN);
                    case "Gray" -> f.getContentPane().setBackground(Color.LIGHT_GRAY);
                    case "Magenta" -> f.getContentPane().setBackground(Color.MAGENTA);
                    case "Orange" -> f.getContentPane().setBackground(Color.ORANGE);
                    case "Pink" -> f.getContentPane().setBackground(Color.PINK);
                    case null, default -> f.getContentPane().setBackground(Color.WHITE);
                }
            }
        });
    }
    public static void main(String[] args)
    {
        Question115 obj=new Question115();
    }
}

