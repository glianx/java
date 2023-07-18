public class SNodeTest {
	public static void main(String [] args) {
		SNode node1 = new SNode();
		SNode node2 = new SNode();
		
		// add node2 to node 1
		node1.setData(4);
		node2.setData(9);
		node1.setNext(node2);
		System.out.println(node1.getNext().getData());
		
		// add node3 between node1 and node2
		SNode node3 = new SNode();
		node3.setData(25);
		
		node1.setNext(node3);
		node1.getNext().setNext(node2);
		
		// print node1, 2, 3 in order
		System.out.println(
			node1.getData() + " " + 
			node1.getNext().getData() + " " +
			node1.getNext().getNext().getData()	
		);
		
		// add 10, 20, 30 nodes
		SNode node4 = new SNode();			node4.setData(10);
		SNode node5 = new SNode();			node5.setData(20);
		SNode node6 = new SNode();			node6.setData(30);
		
		node1.getNext().getNext().setNext(node4);
		node1.getNext().getNext().getNext().setNext(node5);
		node1.getNext().getNext().getNext().getNext().setNext(node6);
		
		System.out.println();
		SNode pointer = node1;
		while (pointer != null) {
			System.out.print(pointer.getData() + " ");
			pointer = pointer.getNext();
		}
		
		System.out.println();
		SNode pointer2 = node1.getNext().getNext().getNext().getNext();
		pointer2.setNext(pointer2);
		for (int i = 0; i < 10; i++) {
			SNode newSNode = new SNode();
			newSNode.setData(2 * i);
			newSNode = newSNode.getNext();
		}
		
		System.out.println();
		SNode pointer3 = node1;
		while (pointer3 != null) {
			System.out.print(pointer3.getData() + " ");
			pointer = pointer3.getNext();
		}
	}
}
