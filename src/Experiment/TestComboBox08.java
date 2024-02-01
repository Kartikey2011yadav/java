package Experiment;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TestComboBox08 {

    public static void main(String[] args) {
        new TestComboBox08();
    }

    public TestComboBox08() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }

                JFrame frame = new JFrame("Test");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new TestPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }

        });
    }

    public class TestPane extends JPanel {

        public TestPane() {
            final JComboBox cb = new JComboBox();
            cb.addItem(new SelectableColor("Red", Color.RED));
            cb.addItem(new SelectableColor("Green", Color.GREEN));
            cb.addItem(new SelectableColor("Blue", Color.BLUE));
            cb.setRenderer(new ColorCellRenderer());
            add(cb);
            cb.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Object value = cb.getSelectedItem();
                    if (value instanceof SelectableColor) {
                        cb.setBackground(((SelectableColor) value).getColor());
                    } else {
                        cb.setBackground(null);
                    }
                }
            });
            cb.setSelectedItem(null);
        }

    }

    public class SelectableColor {
        private String name;
        private Color color;

        public SelectableColor(String name, Color color) {
            this.name = name;
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public Color getColor() {
            return color;
        }

    }

    public class ColorCellRenderer extends DefaultListCellRenderer {

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            if (value instanceof SelectableColor) {
                SelectableColor sc = (SelectableColor) value;
                if (!isSelected) {
                    setBackground(sc.getColor());
                    setOpaque(true);
                }
                setText(sc.getName());
            }
            return this;
        }

    }
}
