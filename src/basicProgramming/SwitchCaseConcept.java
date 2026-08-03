package basicProgramming;

public class SwitchCaseConcept {

	public static void main(String[] args) {
		String browser = "FIREFOX     ";
		int version = 150;

		switch (browser.toLowerCase().trim()) {
		case "chrome":
			if (version == 150) {
				System.out.println("Give the Permission");
			} else {
				System.out.println("No need to give Permission");
			}
			System.out.println("Launch Chrome");
			break;
		case "firefox":
			System.out.println("Launch Firefox");
			String mode = "Headless";
			switch (mode.toLowerCase().trim()) {
			case "headless":
				System.out.println("Run Test Cases in HeadLess Mode");
				break;
			case "incognito":
				System.out.println("Run Test Cases in Incognito Mode");
				break;
			default:
				System.out.println("Please pass the Right Mode of Execution...."+mode);
				break;
			}
			break;
		case "edge":
			System.out.println("Launch Edge");
			break;
		case "safari":
			System.out.println("Launch Safari");
			break;

		default:
			System.out.println("Please pass the Right Browser " + browser);
			break;
		}

//		Switch case is allowed with following Data types only
//		Allowed --> byte, short, int, String, char
//		Not Allowed --> long, float, double, boolean

		char ch = 'A';
		switch (ch) {
		case 'a':
			System.out.println(ch + " = is a Vowel");
			break;
		case 'e':
			System.out.println(ch + " = is a Vowel");
			break;
		case 'i':
			System.out.println(ch + " = is a Vowel");
			break;
		case 'o':
			System.out.println(ch + " = is a Vowel");
			break;
		case 'u':
			System.out.println(ch + " = is a Vowel");
			break;
		case 'A':
			System.out.println(ch + " = is a Vowel");
			break;
		case 'E':
			System.out.println(ch + " = is a Vowel");
			break;
		case 'I':
			System.out.println(ch + " = is a Vowel");
			break;
		case 'O':
			System.out.println(ch + " = is a Vowel");
			break;
		case 'U':
			System.out.println(ch + " = is a Vowel");
			break;

		default:
			System.out.println(ch + " is a Consonant");
			break;
		}

//		Switch case UseCases--->
//		cross browser logic
//		cross platform/OS/devices: Linux, Mac, windows, android, ios
//		user access based permission : RBAC: admin/seller/vendor/customer/distributor
//		multi-environment execution: dev/qa/stage/uat/prod
//		payment options: Credit Card/UPI/mobile app/online/Cash On Delivery
//		Language cases: English, Arabic,German
//		Web Page: Electronics, Fashion

	}

}
