public class LineSegmentTest {
	public static void main(String [] args) {
		LineSegment l = new LineSegment();
		l.setA(0,0);
		l.setB(3,4);
		
		LineSegment l2 = new LineSegment();
		l2.setA(2,4);
		l2.setB(2,0);

		System.out.println(intersects(l, l2));
		
	}
	
//	public static boolean intersects(LineSegment l, LineSegment l2) {
//		double x1min = Math.min(l.getA().getX(),l.getB().getX());
//		double x1max = Math.max(l.getA().getX(),l.getB().getX());
//		
//		double x2min = Math.min(l2.getA().getX(),l2.getB().getX());
//		double x2max = Math.max(l2.getA().getX(),l2.getB().getX());
//		
//		double y1min = Math.min(l.getA().getY(),l.getB().getY());
//		double y1max = Math.max(l.getA().getY(),l.getB().getY());
//		
//		double y2min = Math.min(l2.getA().getY(),l2.getB().getY());
//		double y2max = Math.max(l2.getA().getY(),l2.getB().getY());
//		
//		return !((x2max < x1min || x2min > x1max) || (y2max < y1min || y2min > y1max));
//	}
	
	public static boolean intersects(LineSegment l, LineSegment l2) {
		double m1 = (l.getA().getY() - l.getB().getY()) / 
					(l.getA().getX() - l.getB().getX());
		double m2 = (l2.getA().getY() - l2.getB().getY()) / 
					(l2.getA().getX() - l2.getB().getX());
		
		System.out.println(l2.calcSlope()-l2.calcSlope());
		
		double b1 = l.getA().getY() - m1 * l.getA().getX();
		double b2 = l2.getA().getY() - m2 * l2.getA().getX();
		
		double x = (b2 - b1) / (m1 - m2);
		return (x >= Math.min(l.getA().getX(), l.getB().getX()) &&
			    x <= Math.max(l.getA().getX(), l.getB().getX())) &&
			   (x >= Math.min(l2.getA().getX(), l2.getB().getX()) &&
			    x <= Math.max(l2.getA().getX(), l2.getB().getX()));
	}
}
