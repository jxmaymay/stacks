/**
 * This is the interface for the implementation of a Stack class.
 * 
 * The stack should hold string data, and have a constructor with one
 * integer parameter which is the size of the stack.
 * 
 * @author Michael Ida
 *
 */
public interface StackInterface {

	/*
	 * This method should add a record to the top of the stack.
	 * It returns true if the operation was successful, and false
	 * if the stack is already full.
	 */
	public boolean push(String record);
	
	/*
	 * This method removes the top element of the stack and returns
	 * its value.
	 */
	public String pop();
	
	/*
	 * This method prints out the elements in the stack.
	 */
	public void printStack();
	
}
