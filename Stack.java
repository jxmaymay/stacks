
/**
 * This is the class to implement a stack.
 * 
 * The stack should hold string data and have a constructor with one
 * integer parameter (the size of the stack).
 *
 * You have the freedom to choose how to implement your stack using any
 * of the data structures we have already studied (arrays, ArrayLists,
 * linked lists, binary trees, etc.).
 * 
 * @author Michael Ida
 *
 */
public class Stack implements StackInterface {
	private String[] stack;
	private int top;
	
	public Stack(int size) {
		String[] arr = new String[size];
		stack = arr;
		this.top = size;
	}

	
	public boolean push(String record) {
		int count = 0;
		int num = 0;
		boolean bottom = false;
		while(count == 0 && num < top){
			if(stack[num] == null){
				stack[num] = record;
				count++;
				bottom = true;
			} else {
			num++;
			}
		}
		if (count == 0 && num == top) {
			bottom = false;
		}
		return bottom;
	}

	
	public String pop() {
		int count = 0;
		int num = top - 1;
		String temp = null;
		while (count == 0 && num >= 0) {
			if (stack[num] != null) {
				temp = stack[num];
				stack[num] = null;
				count++;
			} else {
				num--;
			}
		}
		return temp;
	}

	public void printStack() {
		for (int i = top - 1; i >= 0; i--) {	
			if (stack[i] != null) { 
				System.out.println(stack[i]);
			}
		}
	}
}
