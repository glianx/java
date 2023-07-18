public class Tesla {
	private boolean started;
	private int batteryCharge;
	private boolean selfDriveMode;
	private int useRate;
	
	public Tesla() {
		batteryCharge = 100;
		started = false;
		selfDriveMode = false;
		useRate = 3;
	}
	
	public void start() {
		if (batteryCharge > 9) {
			started = true;
		}
	}
	
	public void stop() {
		started = false;
	}
	
	public int charge(int chargeAmount) {
		batteryCharge = Math.min(batteryCharge + chargeAmount, 100);
		return batteryCharge;
	}
	
	public void switchMode() {
		selfDriveMode = !selfDriveMode;
	}
	
	public boolean drive(int km) {
		if (started && batteryCharge > useRate * km) {
			batteryCharge -= (useRate * km);
			return true;
		}
		return false;
	}
	

	public boolean getStarted() {
		return started;
	}
	
	public int getCharge() {
		return batteryCharge;
	}
	
	public boolean getSelfDriveMode() {
		return selfDriveMode;
	}
}
