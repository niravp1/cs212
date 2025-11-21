/**
 * Abstract base class for linked lists of Date212 objects.
 * Implements a linked list with a head node structure.
 * Provides common functionality for both sorted and unsorted lists.
 * 
 * @author Your Name
 * @version 1.0
 */
public abstract class Date212List {
	/** Reference to the head node of the list (empty head node) */
	protected Date212Node first = new Date212Node(null);
	
	/** Reference to the last node in the list */
	protected Date212Node last = first;
	
	/** The number of Date212 objects in the list */
	protected int length = 0;
	
	/**
	 * Returns the number of Date212 objects in the list.
	 * 
	 * @return the length of the list
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Appends a Date212 object to the end of the list.
	 * Creates a new node and adds it after the current last node.
	 * 
	 * @param d the Date212 object to append to the list
	 */
	public void append(Date212 d) {
		Date212Node node = new Date212Node(d);
		last.next = node;
		last = node;
		++length;
	}
	
	/**
	 * Returns a string representation of all Date212 objects in the list.
	 * Each date is formatted on a separate line.
	 * 
	 * @return a string containing all dates in the list, one per line
	 */
	public String toString() {
		Date212Node p = first.next;
		String returnString = "";
		while (p != null) {
			returnString += p.data + " \n";
			p = p.next; 
		}
		return returnString;
	}
}