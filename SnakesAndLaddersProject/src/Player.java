public class Player {
	private String name;
	private int points;
	private int matches;
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	public void setPoints(int p) {
		points = p;
	}
	public void addPoints(int a) {
		points += a;
	}
	public int getPoints() {
		return points;
	}
	
	public void incMatches() {
		matches ++;
	}
	
	public int getMatches() {
		return matches;
	}
}
