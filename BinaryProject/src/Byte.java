public class Byte {
	// array of null pointers
	private Bit[] value = new Bit[8];

	public Byte() {
		// initialize object and assign address to pointer
		for (int i = 0; i < 8; i++) {
			value[i] = new Bit();
		}
	}

	public Byte(double d) {
		for (int i = 0; i < 8; i++) {
			value[i] = new Bit();
		}
		decToBinSub(d);
	}

	public Byte(String s) {
		for (int i = 0; i < 8; i++) {
			value[i] = new Bit();
		}
		// byte
		if (s.length() == 8) {
			for (int j = 0; j < 8; j++) {
				value[j].setBit((int) s.charAt(j) - 48);
			}
		}
		// hexadecimal pair
		else if (s.length() == 2) {
			for (int k = 0; k < 8; k++) {
				hexToBin(s);
			}
		}
		
		else {
			System.out.println("Error: enter byte or hex");
		}
	}

	// index = power
	// start from highest power
	public void decToBinSub(double d) {
		for (int i = 7; i > -1; i--) {
			if (d - Math.pow(2, i) >= 0) {
				d = d - Math.pow(2, i);
				value[i].setBit(1);
			} else {
				value[i].setBit(0);
			}
		}
	}

	// index = power
	// start from lowest power
	public void decToBinDiv(int d) {
		for (int i = 0; i < 8; i++) {
			value[i].setBit(d % 2);
			d = Math.floorDiv(d, 2);
		}
	}

	public void hexToBin(String h) {
		double tot = 0;
		for (int i = 0; i < 2; i++) {
			int val = 0;
			if (65 <= (int) h.charAt(i) && (int) h.charAt(i) <= 70) {
				val = (int) h.charAt(i) - 55;
			} else if (48 <= (int) h.charAt(i) && (int) h.charAt(i) <= 57) {
				val = (int) h.charAt(i) - 48;
			}
			tot = tot + val * Math.pow(16, 1 - i);
		}
		decToBinDiv((int) tot);
	}

	public String getByte() {
		String byteString = "";
		for (int i = 0; i < 8; i++) {
			byteString = byteString + value[i].getBit();
		}
		return byteString;
	}

	public double getByteD() {
		double tot = 0;
		for (int i = 0; i < 8; i++) {
			tot = tot + value[i].getBit() * Math.pow(2, i);
		}
		return tot;
	}
	
	public String getByteRev() {
		String s = "";
		for (int i = 0; i < 8; i++) {
			s = s + getByte().charAt(7 - i);
		}
		return s;
	}
}
