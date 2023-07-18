public class Calc {
	private static double m1 = 0;
	private double m2;
	
	public static void main(String [] args) {
//		System.out.println(Calc.getM1());
//		Calc.add(3, 4);
//		System.out.println(Calc.getM1());
//		Calc.multiply(m1, m1);
//		System.out.println(Calc.getM1());
//		Calc.mod(103, 5);
//		System.out.println(Calc.subtract(3, 4));
//		System.out.println(Calc.multiply(3, 4));
//		System.out.println(Calc.divide(3, 4));
//		System.out.println(Calc.sqrt(3));
//		System.out.println(Calc.sqrt2(225));
		
//		Calc myCalc = new Calc();
//		System.out.println(myCalc);
//		System.out.println(myCalc.add(5, 6));
		
		Calc calc1 = new Calc();
		Calc calc2 = new Calc();
		
//		System.out.println(calc2.getM1());
//		calc1.add(13, 14);
//		System.out.println(calc1.getM1());
//		System.out.println(calc2.getM1());
		calc1.mod(104, 5);
		System.out.println(calc1.getM2());
//		
//		calc2.add(15, 16);
//		System.out.println(calc2.getM1());
		calc2.mod(105, 5);
		System.out.println(calc2.getM2());
		
//		System.out.println(m1);

	}
	
	public static double add(double a, double b) {
		m1 = a + b;
		return m1;
	}
	public static double subtract(double a, double b) {
		m1 = a - b;
		return m1;
	}
	public static double multiply(double a, double b) {
		m1 = a * b;
		m2 = m1;
		return m1;
	}
	public static double divide(double a, double b) {
		m1 = a / b;
		return m1;
	}
	public static double sqrt(double x) {
		m1 = Math.sqrt(x);
		return m1;
	}
	
	public static double getM1() {
		return m1;
	}
	
	public static double sqrt2(double x) {
		double r = x / 10;
		while (Math.abs(  (Math.pow(r, 2) - x) / x)   / 100 > 1);
			if (Math.pow(r, 2) > x) {
				r = r / 1.1;
			}
			else {
				r = r * 1.1;
			}
			System.out.println(r);
		return r;
	}
	
	public double mod(double a, double b) {
		m2 = a % b;
		return m2;
	}
	
	public double getM2() {
		return m2;
	}
}
