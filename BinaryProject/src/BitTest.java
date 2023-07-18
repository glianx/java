public class BitTest {
	public static void main(String [] args) {
		Bit bit = new Bit();
		System.out.println(bit.getBit());
		bit.setBit(7);
		System.out.println(bit.getBit());
		bit.setBit(0);
		System.out.println(bit.getBit());
	}
}
