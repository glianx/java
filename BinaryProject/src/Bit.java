public class Bit {
	private int value;
	
	public Bit() {
		value = 0;
	}
	
	public void setBit(int x) {
		if (x == 0) {
			value = 0;
		}
		else {
			value = 1;
		}
	}
	
	public int getBit() {
		return value;
	}
}