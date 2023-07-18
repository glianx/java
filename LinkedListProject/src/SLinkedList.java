public class SLinkedList {
	private SNode head;		// null head pointer points to first node
	
	public SLinkedList() {
		head = null;
	}
	
	public void add(int data) {
		SNode temp = new SNode();
		temp.setData(data);
		
		if (head == null) {
			head = temp;
		}
		
		else {
			SNode curr = head;
			SNode prev = head;
			
			if (data <= head.getData()) {
				temp.setNext(head);
				head = temp;
			}
			
			else {

				while (	curr != null && 	
						data > curr.getData()
				) {
					prev = curr;
					curr = curr.getNext();
				}
	
				temp.setNext(curr);
				prev.setNext(temp);
			}
		}
	}
	
	public void delete(int data) {
		SNode prev = head;
		SNode curr = head;

		while (curr != null && curr.getData() != data) {
			prev = curr;
			curr = curr.getNext();
		}
		
		if (curr != null) {
			if (curr == head) {
				head = curr.getNext();
			}
			else {
				prev.setNext(curr.getNext());
			}
		}
	}
	
	public boolean isInList(int data) {
		SNode curr = head;
		while (curr != null && curr.getData() != data) {
			curr = curr.getNext();
		}
		return curr != null;
	}
	
	public void replace(int data1, int data2) {
		if (isInList(data1)) {
			delete(data1);
			add(data2);
		}
	}
	
	public void reverse() {
		SNode prev = head;
		SNode curr = prev.getNext();
		SNode next = curr.getNext();
		prev.setNext(null);
		while (next != null) {
			curr.setNext(prev);
			prev = curr;
			curr = next;
			next = next.getNext();
		}
		
		head = curr;
		head.setNext(prev);
	}
	
	public void printLinkedList() {
		SNode curr = head;
		while (curr != null) {
			System.out.print(curr.getData() + " ");
			curr = curr.getNext();
		}
		System.out.println();
	}
	
	public String printReverse(SNode node) {
		if (node == null) {
			return;
		}
		System.out.print(printReverse(node.getNext()));
	} 
	
}
