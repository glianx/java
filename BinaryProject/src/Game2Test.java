import java.io.IOException;

public class Game2Test {
	public static void main(String [] args) throws IOException {
		Game2 g = new Game2();
		double p  = g.decAndBin("decToBin", 0);
		double p2 = g.decAndBin("binToDec", p);
	}
	
}
