package basicProgramming;

public class IfELseType {
	public static void main(String[] args) {

		String str = "Selenium";
		if (str.equals("Selenium")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		System.out.println("\n");

		String browser = "Chrome";
		if (browser.equals("Chrome")) {
			System.out.println("Launch Chrome");
		}
		if (browser.equals("Firefox")) {
			System.out.println("Launch Firefox");
		}
		if (browser.equals("Edge")) {
			System.out.println("Launch Edge");
		}
		if (browser.equals("Safari")) {
			System.out.println("Launch Safari");
		} else {
			System.out.println("Please pass the right browser...." + browser);
		}
		
		System.out.println("\n");
		
		String Browser = "Safari";
		if (Browser.equals("Chrome")) {
			System.out.println("Launch Chrome");
		}else if (Browser.equals("Firefox")) {
			System.out.println("Launch Firefox");
		}else if (Browser.equals("Edge")) {
			System.out.println("Launch Edge");
		}else if (Browser.equals("Safari")) {
			System.out.println("Launch Safari");
		}else {
			System.out.println("Please pass the right browser...." + browser);
		}

	}
}
