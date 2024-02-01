package syllabus;

import java.awt.*;
import java.awt.event.*;
class AdapterExample {
    Frame f;
    AdapterExample() {
        f = new Frame("Window Adapter");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
}
class MouseAdapterExample extends AdapterExample {
    MouseAdapterExample() {
        MouseAdapter ma = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Graphics g = f.getGraphics();
                g.setColor(Color.RED);
                g.fillOval(e.getX(), e.getY(), 25, 25);
            }
        };
        f.addMouseListener(ma);
        f.setSize(500, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
    public class Question116 {
    public static void main(String[] args) {
        MouseAdapterExample m = new MouseAdapterExample();
    }
}
