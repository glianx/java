public class PointTest {
	public static void main(String [] args) {
		Point o = new Point();
		Point p = new Point();
		System.out.println(p.x + ", " + p.y);
		System.out.println(p.distance(o));	
		
		p.translate(3, 4);
		System.out.println(p.x + ", " + p.y);
		System.out.println(p.distance(o));	
		
		p.reflect("x");
		System.out.println(p.x + ", " + p.y);
		System.out.println(p.distance(o));	
	}
}
