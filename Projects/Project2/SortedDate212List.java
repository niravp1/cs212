package Projects.Project2;
/**
 * Represents a sorted linked list of Date212 objects.
 * Dates are maintained in chronological order from earliest to latest.
 * Extends the abstract Date212List class.
 * 
 * @author Your Name
 * @version 1.0
 */
public class SortedDate212List extends Date212List {
	
	/**
	 * Adds a Date212 object to the list in its proper sorted position.
	 * The list remains sorted in chronological order after insertion.
	 * Uses the compareTo method of Date212 to determine the correct position.
	 * 
	 * @param d the Date212 object to add to the sorted list
	 */
	public void add(Date212 d) {
		Date212Node node = new Date212Node(d);
		// If list is empty, add as first element
		if (first.next == null) {
			last.next = node;
			last = node;
			length++;
			return;
		}
		// Find the correct position to insert
		Date212Node i = first;
		while (i.next != null && i.next.data.compareTo(d) < 0)
			i = i.next;
		// Insert at end if date is largest
		if (i.next == null) {
			last.next = node;
			last = node;
			length++;
		} else {
			// Insert in middle of list
			node.next = i.next;
			i.next = node;
			length++;
		}
	}
}