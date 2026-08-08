package StringConcept;

public class EscapeCharacter {

	public static void main(String[] args) {

//		Escape character Concept:
//		When we split on the basis of . it will not work so we have to use Escape character--> \\
		String tool = "Selenium.Cypress.Playwright.Tosca";
		String t[] = tool.split("\\.");
		System.out.println(t[0]);
		System.out.println(t[1]);
		System.out.println(t[2]);
		System.out.println(t[3]);
		
		System.out.println("--------------");
		
		String lang = "Java|Python|C|JavaScript";
		String l[] = lang.split("\\|");
		System.out.println(l[0]);
		System.out.println(l[1]);
		System.out.println(l[2]);
		System.out.println(l[3]);
		
//		Single/Double quote on console
		String str = "Selenium Java Automation";
		System.out.println(str);//Selenium Java Automation
		System.out.println("Selenium 'Java' Automation");//Selenium 'Java' Automation
		System.out.println("Selenium \"Java\" Automation");//Selenium "Java" Automation
		System.out.println("\"Selenium Java Automation\"");//"Selenium Java Automation"
		
	}
	
}
