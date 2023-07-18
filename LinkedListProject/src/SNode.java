public class SNode {
	private int data;
	private SNode next;
	public SNode() {
		data = 0;
		next = null;
	}
	
	public int getData() {
		return data;
	}
	
	public SNode getNext() {
		return next;
	}
	
	public void setData(int d) {
		data = d;
	}
	
	public void setNext(SNode n) {
		next = n;
	}
}
