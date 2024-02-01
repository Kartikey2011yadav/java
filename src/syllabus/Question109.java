package syllabus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Question109 extends Frame
{
    Question109()
    {
        JFrame f=new JFrame();
        String[] color={"Select","Red","Blue","Yellow","Green"};
        JComboBox jc=new JComboBox(color);
        jc.setBounds(30,30,100,20);
        f.add(jc);
        f.setSize(500,500);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setLayout(null);
        f.setVisible(true);
        jc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color=(String) jc.getItemAt(jc.getSelectedIndex());
                switch (color) {
                    case "Red" -> f.getContentPane().setBackground(Color.RED);
                    case "Blue" -> f.getContentPane().setBackground(Color.BLUE);
                    case "Yellow" -> f.getContentPane().setBackground(Color.YELLOW);
                    case "Green" -> f.getContentPane().setBackground(Color.GREEN);
                    case null, default -> f.getContentPane().setBackground(Color.WHITE);
                }
            }
        });
    }
    public static void main(String[] args)
    {
        Question109 obj=new Question109();
    }
}
