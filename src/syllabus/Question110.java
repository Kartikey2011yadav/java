package syllabus;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
public class Question110 {
    public static void main(String[] args) {
        String s = """
                In today's digital age, text analysis and text mining have become essential\s
                parts of various industries. Text analysis refers to the process of analyzing\s
                and extracting meaningful insights from unstructured text data. One of the most\s
                important subfields of text analysis is sentiment analysis, which involves\s
                determining the emotional tone of the text.
                                
                Sentiment analysis has numerous practical applications, \s
                from brand monitoring to customer feedback analysis. \s
                Python is a popular programming language used for text \s
                analysis and mining, and the Natural Language Toolkit (NLTK) \s
                library is one of the most widely used libraries for natural language \s
                processing in Python.

                This tutorial will provide a step-by-step guide for performing sentiment \s
                analysis using the NLTK library in Python. By the end of this tutorial, \s
                you will have a solid understanding of how to perform sentiment analysis \s
                using NLTK in Python, along with a complete example that you can use as \s
                a starting point for your own projects. So, let's get started!
                                
                In today's digital age, text analysis and text mining have become essential\s
                parts of various industries. Text analysis refers to the process of analyzing\s
                and extracting meaningful insights from unstructured text data. One of the most\s
                important subfields of text analysis is sentiment analysis, which involves\s
                determining the emotional tone of the text.
                                
                Sentiment analysis has numerous practical applications, \s
                from brand monitoring to customer feedback analysis. \s
                Python is a popular programming language used for text \s
                analysis and mining, and the Natural Language Toolkit (NLTK) \s
                library is one of the most widely used libraries for natural language \s
                processing in Python.

                This tutorial will provide a step-by-step guide for performing sentiment \s
                analysis using the NLTK library in Python. By the end of this tutorial, \s
                you will have a solid understanding of how to perform sentiment analysis \s
                using NLTK in Python, along with a complete example that you can use as \s
                a starting point for your own projects. So, let's get started!""";
        JPanel middlePanel = new JPanel();
        middlePanel.setBorder(new TitledBorder(new EtchedBorder(), "Display Area"));

        JTextArea display = new JTextArea(16, 58);
        display.setText(s);
        display.setEditable(false);
        JScrollPane scroll = new JScrollPane(display);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        middlePanel.add(scroll);

        JFrame frame = new JFrame();
        frame.add(middlePanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
