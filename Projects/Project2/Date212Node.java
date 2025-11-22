package Projects.Project2;
/**
 * Represents a node in a linked list of Date212 objects.
 * Each node contains a Date212 data element and a reference to the next node.
 * 
 * @author Your Name
 * @version 1.0
 */
public class Date212Node {
	/** The Date212 data stored in this node */
	protected Date212 data;
	
	/** Reference to the next node in the linked list */
	protected Date212Node next;
	
	/**
	 * Constructs a Date212Node with the specified Date212 object.
	 * The next reference is initialized to null.
	 * 
	 * @param d the Date212 object to store in this node
	 */
	public Date212Node(Date212 d) {
		data = d;
		next = null;
	}
}