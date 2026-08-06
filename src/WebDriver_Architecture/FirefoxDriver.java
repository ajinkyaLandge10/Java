package WebDriver_Architecture;

public class FirefoxDriver implements WebDriver {

	public FirefoxDriver() {
		System.out.println("Launch Firefox browser....");
	}

	@Override
	public void findElement(String locator) {
		System.out.println("Finding element: " + locator);
	}
	@Override
	public void click(String locator) {
		System.out.println("Click on : " + locator);
	}
	@Override
	public void sendKeys(String locator, String value) {
		System.out.println("Enter value in : " + locator + " " + "value = " + value );
	}
	@Override
	public String getTitle() {
		return "Amazon";
	}
	@Override
	public void get(String url) {
		System.out.println("Enter url: " + url);
	}
	@Override
	public void close() {
		System.out.println("Close the browser...");
	}
}
