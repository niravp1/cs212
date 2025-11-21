import java.awt.GridLayout;
import javax.swing.*;

/**
 * Creates and displays a graphical user interface (GUI) for displaying Date212 lists.
 * Shows two text areas side by side: one for unsorted dates and one for sorted dates.
 * Includes a menu bar with File menu options.
 * 
 * @author Your Name
 * @version 1.0
 */
public class Date212GUI {

	/**
	 * Constructs a Date212GUI and displays the window.
	 * 
	 * @param list1 the unsorted list of Date212 objects to display
	 * @param list2 the sorted list of Date212 objects to display
	 */
	public Date212GUI(UnsortedDate212List list1, SortedDate212List list2) {
		createAndShowGUI(list1, list2);
	}

	/**
	 * Creates and configures the GUI components and displays the window.
	 * Sets up a JFrame with two text areas in a grid layout,
	 * one displaying unsorted dates and one displaying sorted dates.
	 * Includes a menu bar with File menu containing Open and Quit options.
	 * 
	 * @param unsorted the unsorted list of Date212 objects to display
	 * @param sorted the sorted list of Date212 objects to display
	 */
	private void createAndShowGUI(UnsortedDate212List unsorted, SortedDate212List sorted) {
		// Create and set up the window.
		JFrame frame = new JFrame("Dates");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLocation(200, 200);
		frame.setLayout(new GridLayout(1, 2)); // 1 row, 2 columns
		
		// Create JMenuBar
		JMenuItem item;
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		
		item = new JMenuItem("Open");
		fileMenu.add(item);
		
		fileMenu.addSeparator();
		
		item = new JMenuItem("Quit");
		fileMenu.add(item);
		
		frame.setJMenuBar(menuBar);
		menuBar.add(fileMenu);
		// End of JMenuBar

		// Create left text area for unsorted dates
		JTextArea textArea = new JTextArea(5, 20);
		textArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(textArea);
		frame.getContentPane().add(scrollPane);
		
		textArea.setText("Unsorted: " + "\n");
		textArea.append(unsorted + "\n");
		
		// Create right text area for sorted dates
		JTextArea textArea2 = new JTextArea(5, 20);
		textArea2.setEditable(false);
		frame.getContentPane().add(textArea2);
		
		textArea2.setText("Sorted: " + "\n");
		textArea2.append(sorted + "\n");

		// Display the window
		frame.pack();
		frame.setVisible(true);
	}
}