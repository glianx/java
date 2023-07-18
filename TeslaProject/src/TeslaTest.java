public class TeslaTest {
	public static void main(String [] args) {
		Tesla tesla = new Tesla();
		System.out.println("started: " + tesla.getStarted());
		System.out.println("charge: " + tesla.getCharge());
		System.out.println("self drive mode: " + tesla.getSelfDriveMode());
		System.out.println();
		
		tesla.start();
		System.out.println("started: " + tesla.getStarted());
		System.out.println();
		
		// demo drive function
		boolean driveStatus = tesla.drive(20);
		System.out.println("charge: " + tesla.getCharge());
		System.out.println("driveStatus: " + driveStatus);
		System.out.println();
		
		// demo only drive when enough battery
		boolean driveStatus2 = tesla.drive(20);
		System.out.println("charge: " + tesla.getCharge());
		System.out.println("driveStatus2: " + driveStatus2);
		System.out.println();
		
		// demo only drive when started
		tesla.stop();
		boolean driveStatus3 = tesla.drive(1);
		System.out.println("charge: " + tesla.getCharge());
		System.out.println("driveStatus3: " + driveStatus3);
		System.out.println();
		
		// demo only start when enough battery
		tesla.start();
		boolean driveStatus4 = tesla.drive(12);
		System.out.println("charge: " + tesla.getCharge());
		System.out.println("driveStatus3: " + driveStatus4);
		System.out.println();
		
		tesla.stop();
		tesla.start();
		System.out.println("started: " + tesla.getStarted());
		
		// demo overcharge handling
		tesla.charge(20);
		System.out.println("charge: " + tesla.getCharge());
		tesla.charge(2000);
		System.out.println("charge: " + tesla.getCharge());
		
		// demo toggle self drive mode
		tesla.switchMode();
		System.out.println("self drive mode: " + tesla.getSelfDriveMode());
	}
}
