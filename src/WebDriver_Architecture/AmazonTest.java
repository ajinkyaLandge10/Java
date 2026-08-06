package WebDriver_Architecture;

public class AmazonTest {
	static WebDriver driver;
	
	public static void main(String[] args) {
//		Chrome
//		ChromeDriver driver = new ChromeDriver();	
//		Firefox:
//		FirefoxDriver driver = new FirefoxDriver();	
//		Edge:
//		EdgeDriver driver = new EdgeDriver();
		
		
//		Top Casting : Cross browser Logic
		String browser = "Chrome";
		
		switch (browser.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the right browser name...." + browser);
			break;
		}
		
		
		driver.get("https://www.amazon.com");
		String title = driver.getTitle();
		System.out.println("Title : " + title);
		driver.findElement("emailId");
		driver.findElement("Password");
		driver.sendKeys("emailId", "admin@gmail.com");
		driver.sendKeys("Password", "admin123");
		driver.click("login button");
		driver.close();
		

	}

}
