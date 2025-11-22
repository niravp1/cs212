package Projects.Project2;
/**
 * Represents an unsorted linked list of Date212 objects.
 * Dates are added to the end of the list in the order they are received.
 * Extends the abstract Date212List class.
 * 
 * @author Your Name
 * @version 1.0
 */
public class UnsortedDate212List extends Date212List {
	/**
	 * Adds a Date212 object to the end of the unsorted list.
	 * Calls the append method from the superclass to add the date.
	 * 
	 * @param d the Date212 object to add to the list
	 */
	public void add(Date212 d) {
		append(d);
	}
}