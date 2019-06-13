package ds;

/**
* This is an implementation of the stack data structure. Stacks carry an LIFO (last-in-first-out)
* principle, meaning that the last element pushed into the stack is the first one to be popped 
* out. Stacks have two principal operations: push and pop. Push means inserting an element to 
* the stack, while pop means deleting the element at the top, or the most recently added element.
* Other operations of the stack data structure include peek, which returns the element at the 
* top of the stack, but does not delete it. 
*/

public class Stack {
	
	private Object[] array; // Array where data will be held
	private int capacity; // The maximum size of the stack
	private int top; // Top index
	
	/**
	 * Constructor to initialize a new stack with a specified size of elements.
	 * @param size The number of elements that the stack will hold.
	 */
	public Stack(int size) {
		array = new Object[size];
		capacity = size;
		top = -1;
	}
	
	/**
	 * Push a new element onto the stack. If the user attempts to add a new element when the stack 
	 * is already full, then this is a stack overflow, and an error will be thrown.
	 * @param obj The new object to be added to the stack.
	 * @throws ArrayIndexOutOfBoundsException Thrown if user tries to insert when stack is full.
	 */
	public void push(Object obj) throws ArrayIndexOutOfBoundsException {
		if (top >= capacity - 1) { // Stack is full, throw error
			System.out.println("Stack overflow! Pop something first!");
		}
		else {
			array[++top] = obj; // Add new element to stack
		}
	}
	
	/**
	 * Pop (or remove) the element at the top of the stack. Check to determine whether the stack is 
	 * empty. If this is the case, throw an error message; otherwise, pop the top element.
	 * @return The popped element.
	 * @throws ArrayIndexOutOfBoundsException if the user tries to pop from an empty stack.
	 */
	public Object pop() throws ArrayIndexOutOfBoundsException {
		if (isEmpty()) {
			System.out.println("Stack is empty! Push something first!");
		}
		else {
			return array[top--]; // Return element popped from stack
		}
		return -1; // Return if nothing is in the stack
	}
	
	/**
	 * Return the element at the peek (top) of the stack, but do not delete/remove it. If the stack 
	 * is empty, print an error message.
	 * @return Element at top of stack.
	 * @throws ArrayIndexOutOfBoundsException if the user tries to return an element when the stack 
	 * empty.
	 */
	public Object peek() throws ArrayIndexOutOfBoundsException {
		if (isEmpty()) {
			System.out.println("Stack is empty! Push something first!");
		}
		else {
			return array[top]; // Return element at the top
		}
		return -1; // Return if nothing is in the stack
	}
	
	/**
	 * @return capacity The maximum size of the stack.
	 */
	public int capacity() {
		return capacity;
	}
	
	/**
	 * @return size The current size of the stack.
	 */
	public int size() {
		return top + 1; // Size of stack
	}
	
	/**
	 * Method to check whether the stack is empty.
	 * @return true if the stack is empty; false otherwise.
	 */
	public boolean isEmpty() {
		return size() == 0;
	}
	
	/**
	 * Search for the first occurrence of a specified element. If the element is in the stack, return 
	 * its index; otherwise, return -1.
	 * @param obj The object to be found.
	 * @return The index of the found object. If object is not found, return -1.
	 */
	public int search(Object obj) {
		for (int i = 0; i < size(); i++) { // Iterate through array for element
			if (array[i].equals(obj)) {
				return i; // Element found; return index
			}
		}
		return -1; // Element not found
	}
	
	/**
	 * Method to find the element at a specified index. If the user gives an index greater than the 
	 * capacity, throw an error message.
	 * @param index The index where we want to search an object.
	 * @return The element at the specified index if found; return -1 otherwise.
	 */
	public Object elementAt(int index) throws ArrayIndexOutOfBoundsException {
		if (top == capacity) {
			System.out.println("Out of bounds!");
		}
		else {
			return array[index];
		}
		return -1; // Element not found
	}
}
