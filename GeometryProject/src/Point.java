public class Point {
	private double x;
	private double y;
	
	public Point() {
		x = 0;
		y = 0;
	}
	
	public double distance(Point P) {
		return Math.sqrt(Math.pow(x - P.x, 2) + (Math.pow(y - P.y, 2)));
	}
	
	public void reflect(String axis) {
		if (axis == "x") {
			y = -y;
		}
		else if (axis == "y") {
			x = -x;
		}
	}
	
	public void translate(double a, double b) {
		x = x + a;
		y = y + b;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double newX) {
		x = newX;
	}

	public void setY(double newY) {
		y = newY;
	}
}
