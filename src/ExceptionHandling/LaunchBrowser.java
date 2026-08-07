package ExceptionHandling;

public class LaunchBrowser {

	public static void main(String[] args) {

		String browser = "Opera";

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Chrome is launched");
			break;
		case "firefox":
			System.out.println("Firefox is launched");
			break;
		case "edge":
			System.out.println("Edge is launched");
			break;
		default:
			System.out.println("please pass the right browser name...." + browser);
			throw new AppException("Invalid Browser Exception");
		}
		
		System.out.println("Enter the URL");
		System.out.println("Click on SIgnUp Button");
	}
}
