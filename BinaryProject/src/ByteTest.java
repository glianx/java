public class ByteTest {
	public static void main (String [] args) {
		Byte b = new Byte();
		System.out.println(b.getByte());
		
		b.decToBinSub(1);
		System.out.println(b.getByte());
		b.decToBinSub(42);
		System.out.println(b.getByte());
		b.decToBinSub(69);
		System.out.println(b.getByte());
		
		b.decToBinDiv(1);
		System.out.println(b.getByte());
		b.decToBinDiv(42);
		System.out.println(b.getByte());
		b.decToBinDiv(69);
		System.out.println(b.getByte());
		
		System.out.println();
		
		Byte b1 = new Byte("00101010");
		System.out.println(b1.getByte());
		
		Byte b2 = new Byte("EF");
		System.out.println(b2.getByte());
		
		Byte b3 = new Byte(42);
		System.out.println(b3.getByte());
		System.out.println(b3.getByteD());
	}
}
