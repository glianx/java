public class SStack {
	private SNode top;
	
	public SStack() {
		top = null;
	}
	
	public void push(int data) {
		SNode newTop = new SNode();
		newTop.setData(data);
		newTop.setNext(top);
		top = newTop;
	}
	
	public int pop() {
		int data = top.getData();
		top = top.getNext();
		return data;
	}
	
	public int peek() {
		return top.getData();
	}
	
	public void printStack() {
		SNode curr = top;
		while (curr != null) {
			System.out.print(curr.getData() + " ");
			curr = curr.getNext();
		}
		System.out.println();
	}
}
