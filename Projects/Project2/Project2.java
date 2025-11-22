package Projects.Project2;
import java.util.StringTokenizer;

/**
 * Main driver class for Project 2.
 * Reads dates from a text file, stores them in both sorted and unsorted linked lists,
 * and displays them in a graphical user interface.
 * 
 * @author Your Name
 * @version 1.0
 */
public class Project2 {
	/** The name of the input file containing dates */
	public static String filename = "Date.txt";
	
	/**
	 * Main method that creates the lists, reads the file, and launches the GUI.
	 * 
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		SortedDate212List sorted = new SortedDate212List();
		UnsortedDate212List unsorted = new UnsortedDate212List();
		
		inputFromFile(filename, sorted, unsorted);
		new Date212GUI(unsorted, sorted);
	}

	/**
	 * Reads dates from a text file and adds them to both sorted and unsorted lists.
	 * Dates in the file should be in YYYYMMDD format and can be comma-separated.
	 * Each date string is parsed into a Date212 object and added to both lists.
	 * 
	 * @param name the name of the file to read from
	 * @param sorted the sorted list to add dates to
	 * @param unsorted the unsorted list to add dates to
	 */
	private static void inputFromFile(String name, SortedDate212List sorted, UnsortedDate212List unsorted) {
		TextFileInput inFile = new TextFileInput(name);
		
		String line = inFile.readLine();
		while (line != null) {
			StringTokenizer myTokens = new StringTokenizer(line, ",");
			while (myTokens.hasMoreTokens()) {
				String temp = myTokens.nextToken();
				Date212 d = new Date212(temp);
				sorted.add(d);
				unsorted.add(d);
			}
			line = inFile.readLine();
		}
		inFile.close();
	}
}