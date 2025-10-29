package Projects.Project1;

import java.util.*;
import java.io.*;

public class Project1 {

    public static void main(String args[]) {
        ArrayList<String> originalDates = new ArrayList<>();
        ArrayList<Date212> dateObjects = new ArrayList<>();
        
        try {
            Scanner inFile = new Scanner(new File("Project1Data.txt"));
            
            // Read all lines from file
            while (inFile.hasNextLine()) {
                String line = inFile.nextLine().trim();
                if (!line.isEmpty()) {
                    // Use StringTokenizer to separate dates by comma
                    StringTokenizer tokenizer = new StringTokenizer(line, ",");
                    while (tokenizer.hasMoreTokens()) {
                        String dateStr = tokenizer.nextToken().trim();
                        originalDates.add(dateStr);
                        dateObjects.add(new Date212(dateStr));
                    }
                }
            }
            inFile.close();
            
            // Sort the dates using Selection Sort
            selectionSort(dateObjects);
            
            // Create and display the GUI
            DateGUI gui = new DateGUI(originalDates, dateObjects);
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: Project1Data.txt file not found!");
            System.out.println("Please make sure the file is in the correct location.");
            e.printStackTrace();
        }
    }
    
    // Selection Sort implementation
    public static void selectionSort(ArrayList<Date212> dates) {
        int n = dates.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (dates.get(j).compareTo(dates.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            if (minIndex != i) {
                Date212 temp = dates.get(i);
                dates.set(i, dates.get(minIndex));
                dates.set(minIndex, temp);
            }
        }
    }
}