public class Button {
	private boolean state;
	
	public Button() {
		state = false;
	}
	
	public void push() {
		state = !state;
	}
	
	public boolean getState() {
		return state;
	}
}