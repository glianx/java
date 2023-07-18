
public class PlayerTest {
	public static void main(String [] args) {
		Player p = new Player();
		System.out.println(p.getName());
		System.out.println(p.getPoints());
		
		p.setName("Gordon");
		p.addPoints(100);
		
		System.out.println(p.getName());
		System.out.println(p.getPoints());
	}
}
