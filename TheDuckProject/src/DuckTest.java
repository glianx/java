import java.util.Random;

public class DuckTest {
	public static void main(String [] args) {
		Random rand = new Random();
		int n = 10;
		int int_random = rand.nextInt(n);
		
		Duck duck1 = new Duck();
//		duck1.quack();
//		duck1.fly("N", 500);
//		duck1.swim(2/3, -71.0000);	
//		duck1.walk(int_random);
		
		Duck duck2 = new Duck("Donald");
//		duck2.quack();
//		duck2.fly("N", 500);
//		duck2.swim(2/3, -71.0000);
//		duck2.walk(int_random);
		
//		System.out.println(duck1.species);
//		System.out.println(duck2.species);
//		
//		System.out.println(duck1.name);
//		System.out.println(duck2.name);
		
//		duck1.name = "Daphne";
//		System.out.println(duck1.name);
		
//		System.out.println(duck1.getName());
//		System.out.println(duck1.getAge());
//		System.out.println(duck1.getSpecies());
//		System.out.println(duck1.getColour());
//		
//		System.out.println(duck2.getName());
//		System.out.println(duck2.getAge());
//		System.out.println(duck2.getSpecies());
//		System.out.println(duck2.getColour());
		
//		boolean success1 = duck2.setAge(0);
//		System.out.println(success1);
//		System.out.println(duck2.getAge());
//		boolean success2 = duck2.setAge(70);
//		System.out.println(success2);
//		System.out.println(duck2.getAge());
//		boolean success3 = duck2.setAge(29);
//		System.out.println(success3);
//		System.out.println(duck2.getAge());
		
//		duck1.fly("N", 500);
//		duck2.fly("N", 500);
//		
//		duck1.swim(2/3, -71.0000);
//		duck2.swim(2/3, -71.0000);
		
		duck1.quack();
		duck1.quack(3, false, "chi");
		
//		System.out.println(duck2.getAge());
//		System.out.println(duck2.getSpecies());
//		System.out.println(duck2.getColour());
		
		Duck duck3 = new Duck("Dewey","orange","Mallard",19);
		duck3.printDuck();
	}
}
