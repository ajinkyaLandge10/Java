package basicProgramming;

public class Browser {

	// WAF: to launch the browser
	// name: launchBrowser : chrome/ff/safari/edge
	// parameter: browserName(String)
	// return: boolean

	public boolean launchBrowser(String browserName) {

		System.out.println("Browser Name is : " + browserName);
		boolean flag = true;

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("Chrome is Launched");
			break;
		case "firefox":
			System.out.println("Firefox is Launched");
			break;
		case "safari":
			System.out.println("Safari is Launched");
			break;
		case "edge":
			System.out.println("Edge is Launched");
			break;

		default:
			System.out.println("Please pass the right browser name..." + browserName);
			flag = false;
			break;
		}
		return flag;

	}

	public boolean launchBrowserTest(String browserName) {

		System.out.println("browser name is : " + browserName);
		boolean flag = true;

		if (browserName.equals("chrome")) {
			System.out.println("chrome is launched");
		} else if (browserName.equals("firefox")) {
			System.out.println("firefox is launched");
		} else if (browserName.equals("safari")) {
			System.out.println("Safari is launched");
		} else if (browserName.equals("edge")) {
			System.out.println("Edge is launched");
		} else {
			System.out.println("error");
			flag = false;
		}
		return flag;

	}

	// WAF: to return the student marks
	// function name: getStudentMarks(String stName)
	// return: marks(int): 0-100

//	1.with multiple return statements
	public int getStudentMarks(String studentName) {
		System.out.println("Getting Marks For Stduent : " + studentName);

		if (studentName.equals("Ajinkya")) {
			return 90;
		} else if (studentName.equals("Akshay")) {
			return 95;
		} else if (studentName.equals("Neha")) {
			return 85;
		} else if (studentName.equals("Sakshi")) {
			return 0;
		} else {
			System.out.println("Please Pass The Right Student Name : " + studentName);
			return -1;
		}
	}

//	2.with single return statement
	public int getStudentMarks1(String studentName) {
		System.out.println("Getting Marks For Stduent : " + studentName);
		int marks = -1;
		if (studentName.equals("Ajinkya")) {
			marks = 90;
		} else if (studentName.equals("Akshay")) {
			marks = 95;
		} else if (studentName.equals("Neha")) {
			marks = 85;
		} else if (studentName.equals("Sakshi")) {
			marks = 0;
		} else {
			System.out.println("Please Pass The Right Student Name : " + studentName);
		}
		return marks;
	}

	public static void main(String[] args) {

		Browser br = new Browser();
		boolean flag = br.launchBrowser("chrome");
		if (flag) {
			System.out.println("Enter Url..");
		} else {
			System.out.println("Error..");
		}
		
		System.out.println();
		
		boolean isOpen = br.launchBrowserTest("firefox");
		if (isOpen) {
			System.out.println("enter url");
		}
		
		System.out.println();

		int stMarks = br.getStudentMarks("Sakshi");
		System.out.println(stMarks);
		if (stMarks >= 0) {
			System.out.println("Print the mark sheet...");
		}

	}

}
