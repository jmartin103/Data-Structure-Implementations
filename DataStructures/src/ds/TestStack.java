package ds;

/**
 * This is a test class of the Stack class implemented within this package. It will test all of the 
 * methods in the Stack class to ensure that they function properly.
 * @author John Martin
 *
 */

public class TestStack {

	public static void main(String[] args) {
		Stack myStack = new Stack(5); // Create a new stack with a capacity of 6
		myStack.pop(); // Attempt to pop the first element from the stack
		myStack.push(7);
		System.out.println(myStack.peek() + " has been pushed to the stack");
		System.out.println("Size of stack: " + myStack.size());
		System.out.println("Capacity of stack: " + myStack.capacity());
		
		myStack.push("John");
		System.out.println(myStack.peek() + " has been pushed to the stack");
		
		System.out.println("Size of stack is now " + myStack.size());
		
		myStack.push(4.5);
		System.out.println(myStack.peek() + " has been pushed to the stack");
		System.out.println("Size of stack is now " + myStack.size());
		
		System.out.println(myStack.pop() + " has been popped from the stack");
		System.out.println("Size of stack is now " + myStack.size());
		
		System.out.println("The element at the top is " + myStack.peek());
		
		System.out.println("The index of John is " + myStack.search("John"));
		
		if (myStack.search(6) == -1) {
			System.out.println("6 is not in the stack");
		}
		else {
			System.out.println("6 is in the stack");
		}
		
		myStack.push(6);
		System.out.println(myStack.peek() + " has been pushed to the stack");
		
		if (myStack.search(6) == -1) {
			System.out.println("6 is not in the stack");
		}
		else {
			System.out.println("6 is in the stack");
		}
		
		for (int i = 0; i < myStack.size(); i++) {
			System.out.print(myStack.elementAt(i) + " ");
		}
		
		System.out.println();
		
		myStack.push(9.474);
		System.out.println(myStack.peek() + " has been pushed to the stack");
		
		myStack.push(false);
		System.out.println(myStack.peek() + " has been pushed to the stack");
		
		for (int i = 0; i < myStack.size(); i++) {
			System.out.print(myStack.elementAt(i) + " ");
		}
		
		System.out.println();
		
		myStack.push(8); // This will throw an error, as the stack is now full
		myStack.pop();
		System.out.println(myStack.pop() + " has been popped from the stack");
		
		myStack.push("George");
		System.out.println(myStack.peek() + " has been pushed to the stack");
		myStack.push("James");
		System.out.println(myStack.peek() + " has been pushed to the stack");
		myStack.pop();
		
		System.out.println("Size of stack: " + myStack.size());
		
		myStack.push(1);
		System.out.println("Size of stack: " + myStack.size());
		
		for (int i = 0; i < myStack.size(); i++) {
			System.out.print(myStack.elementAt(i) + " ");
		}
	}

}
