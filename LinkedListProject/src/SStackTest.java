public class SStackTest {
	public static void main(String[] args) {
		SStack s1 = new SStack();
		
		System.out.println(s1.peek());
		s1.push(3);
		s1.push(1);
		s1.push(4);
		s1.push(1);
		s1.push(5);
		s1.push(9);
		s1.push(2);
		
		s1.printStack();

	}
}
