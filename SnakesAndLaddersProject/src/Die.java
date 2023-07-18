import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Die {
	Random r = new Random();
	
	private int numFaces;
	private int faceValue;
	
	public Die(int n) {
		numFaces = n;
		roll();
	}
	
	public int roll() {
		faceValue = ThreadLocalRandom.current().nextInt(1, numFaces + 1);
		return faceValue;
	}
	
	public int read() {
		return faceValue;
	}
}
