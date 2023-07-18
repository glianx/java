public class LineSegment {
	private Point a;
	private Point b;
	
	public LineSegment() {
		a = new Point();
		b = new Point();
	}
	
	public LineSegment(Point A, Point B) {
		a = A;
		b = B;
	}
	
	public double calcSlope() {
		return (a.getY() - b.getY()) / (a.getX() - b.getX());
	}
	
	public Point calcMidpoint() {
		Point m = new Point();
		m.setX((a.getX() + b.getX()) / 2);
		m.setY((a.getY() + b.getY()) / 2);
		return m;
	}
	
	public double calcLength() {
		return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + 
						(Math.pow(a.getY() - b.getY(), 2)));
	}
	
	public void translate(double c, double d) {
		a.translate(c, d);
		b.translate(c, d);
	}
	
	public void setA(double x, double y) {
		a.setX(x);
		a.setY(y);
	}
	
	public void setB(double x, double y) {
		b.setX(x);
		b.setY(y);
	}
	
	public Point getA() {
		return a;
	}
	
	public Point getB() {
		return b;
	}
}
