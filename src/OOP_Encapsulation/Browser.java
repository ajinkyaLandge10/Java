package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("Launching Browser");
		checkRAM();
		checkCPU();
		checkBrowserVersion();
		checkBrowserUpgrade();
		System.out.println("Browser launched..!!!!!");
	}

	private void checkRAM() {
		System.out.println("Check_RAM...");
	}

	private void checkCPU() {
		System.out.println("Check_CPU...");
	}

	private void checkBrowserVersion() {
		System.out.println("Check_Browser_Version...");
	}

	private void checkBrowserUpgrade() {
		System.out.println("Check_Browser_Upgrade...");
	}

}
