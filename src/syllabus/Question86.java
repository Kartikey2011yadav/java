package syllabus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Question86 extends JFrame {
    JFrame f;
    Label msg;
    Question86() {
        f = new JFrame("ComboBox Example");
        msg = new Label("Select .....");
        String[] country = {"Red", "Yellow", "Green", "Blue", "Cyan"};
        JComboBox cb = new JComboBox(country);
        msg.setBounds(150, 50, 90, 20);
        cb.setBounds(150, 150, 90, 20);
        f.add(cb);
        f.add(msg);
        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);
        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String) cb.getItemAt(cb.getSelectedIndex());
                msg.setText(s);
                switch (s) {
                    case "Red":
                        msg.setForeground(Color.RED);
                        break;
                    case "Yellow":
                        msg.setForeground(Color.YELLOW);
                        break;
                    case "Green":
                        msg.setForeground(Color.GREEN);
                        break;
                    case "Cyan":
                        msg.setForeground(Color.CYAN);
                        break;
                    default:
                        msg.setForeground(Color.BLACK);
                }
            }
        });
    }
    public static void main(String[] args) {
        Question86 comBox = new Question86();
    }
}


