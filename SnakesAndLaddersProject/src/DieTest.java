public class DieTest {
	public static void main(String [] args) {
		Die d = new Die(6);
		System.out.println(d.read());
		
		for (int i = 0; i < 100; i++) {
			d.roll();
			System.out.println(d.read());
		}
	}
	
}
