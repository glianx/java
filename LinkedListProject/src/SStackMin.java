public class SStackMin {
	private SStack mainStack = new SStack();
	private SStack auxiStack = new SStack();

	public void push(int data) {
		mainStack.push(data);
		if (auxiStack.isEmpty() || data <= auxiStack.peek()) {
			auxiStack.push(data);
		}
	}
	
	public void pop() {
		if (mainStack.peek() == auxiStack.peek()) {
			auxiStack.pop();
		}
		mainStack.pop();	
	}
	
	public int getMin() {
		return auxiStack.peek();
	}
	
	public void printStackMin() {
		mainStack.printStack();
		auxiStack.printStack();
	}
}
