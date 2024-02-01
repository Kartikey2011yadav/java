package syllabus;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Question114{
    Question114(){
        Frame f= new Frame("Checkbox Demo");
        MenuBar mb = new MenuBar();
        Menu m = new Menu();
        f.setMenuBar(mb);
        m.setLabel("Although this is a Menu Bar");
        mb.add(m);
        
        final Label label = new Label("Select any one of the following");
        label.setAlignment(Label.CENTER);
        label.setSize(400,100);
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox checkBox1 = new Checkbox("Flutter", cbg, false);
        checkBox1.setBounds(100,100, 50,50);
        Checkbox checkBox2 = new Checkbox("Java", cbg, false);
        checkBox2.setBounds(100,150, 50,50);
        Checkbox checkBox3 = new Checkbox("Kotlin", cbg, false);
        checkBox3.setBounds(100,200, 50,50);
        f.add(checkBox1); f.add(checkBox2); f.add(checkBox3); f.add(label);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        checkBox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                m.setLabel("Status: Flutter checkbox is selected");
            }
        });
        checkBox2.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                m.setLabel("Status: Java checkbox is selected");
            }
        });
        checkBox3.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                m.setLabel("Status: Kotlin checkbox is selected");
            }
        });
    }
    public static void main(String [] args)
    {
        new Question114();
    }
}
