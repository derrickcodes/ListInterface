/**
 * An interface for the ADT list.
 * Entries in the list have positions that begin with 1 (one).
 * Length of zero is empty, so the first node is 1 not zero.
 * 
 * NOTE: The lists don't begin at zero.
 * 
 * @author derrick
 * @date July 2014
 */
public interface ListInterface {
	public boolean add(Object newEntry);
	
	public boolean add(int newPosition, Object newEntry);
	
	public Object remove(int givenPosition);
	
	public void clear();
	
	public boolean replace(int givenPosition, Object newEntry);
	
	public Object getEntry(int givenPosition);
	
	public boolean contains(Object anEntry);
	
	public int getLength();
	
	// Length of zero is empty, therefore the list starts at 1 (one).
	public boolean isEmpty();
	
	public boolean isFull();
	
	public void display();
	
} // end ListInterface
