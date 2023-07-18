public class Duck {
	private String name;
	private String species;
	private String colour;
	private int age;
	
	public Duck() {
		// constructor function called with new Duck();
		age = 1;
		species = "American black duck";
		colour = "yellow";
	}
	
	public Duck(String n) {
		// overloading - same name & return, different parameters
		name = n;
	}
	
	public Duck(String n, String s, String c, int a) {
		// overloading - same name & return, different parameters
		name = n;
		species = s;
		colour = c;
		
		setAge(a);
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public String getColour() {
		return colour;
	}
	
	
	
	public void setName(String n) {
		name = n;
	}
	
	public boolean setAge(int a) {
		if (0 <= a && a <= 30) {
			age = a;
			return true;
		}
		return false;
	}
	
	public void setSpecies(String s) {
		species = s;
	}
	
	public void setColour(String c) {
		colour = c;
	}
	
	
	public void printDuck() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(colour);
		System.out.println(species);
	}
	
	
	public void quack() {
		System.out.println("quack quack");
	}

	public void quack(int n, boolean vol, String language) {
		// overloaded parameters - repeats, volume, language
		String quack;
		if (language == "chi") {
			quack = "gua gua";
		}
		else if (language == "fre") {
			quack = "coin coin";
		}
		else {
			quack = "quack quack";
		}
		if (vol) {
			quack = quack.toUpperCase();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(quack);	
		}
	}
	
	public void fly(String direction, int distance) {
		// precondition - required parameters
		// documentation may be required
		if (name != null) {
			System.out.println(name + " flew " + distance + " km " + direction);	
		}
		else {
			System.out.println("Your duck flew " + distance + " km " + direction);
		}
	}
	
	public void swim(double lng, double lat) {
		if (name != null) {
			System.out.println(name + " swam to " + lng + ", " + lat);	
		}
		else {
			System.out.println("Your duck swam to " + lng + ", " + lat);
		}
	}
	
	public void walk(int steps) {
		for (int i = 0; i < steps; i++) {
			System.out.println("waddle waddle");
		}
	}
}