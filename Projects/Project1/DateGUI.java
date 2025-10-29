package Projects.Project1;

import java.awt.GridLayout;
import javax.swing.*;
import java.util.ArrayList;

public class DateGUI extends JFrame {
    
    public DateGUI(ArrayList<String> originalDates, ArrayList<Date212> sortedDates) {
        setTitle("Project 1");
        setLocation(100, 100);
        setSize(700, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2));
        
        // Left panel - original format
        JTextArea leftTextArea = new JTextArea();
        leftTextArea.setEditable(false);
        StringBuilder leftContent = new StringBuilder("Original Dates:\n\n");
        for (String date : originalDates) {
            leftContent.append(date).append("\n");
        }
        leftTextArea.setText(leftContent.toString());
        JScrollPane leftScrollPane = new JScrollPane(leftTextArea);
        add(leftScrollPane);
        
        // Right panel - sorted dates in formatted output
        JTextArea rightTextArea = new JTextArea();
        rightTextArea.setEditable(false);
        StringBuilder rightContent = new StringBuilder("Sorted Dates:\n\n");
        for (Date212 date : sortedDates) {
            rightContent.append(date.toString()).append("\n");
        }
        rightTextArea.setText(rightContent.toString());
        JScrollPane rightScrollPane = new JScrollPane(rightTextArea);
        add(rightScrollPane);
        
        setVisible(true);
    }
}