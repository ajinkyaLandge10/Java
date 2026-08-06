package basicProgramming;

public class Language {

	public static void useLang(Language obj) {
		System.out.println("Use this lang");
//		obj=null;  ---> if we do obj = null then it will give NPE
		obj.readLang();
	}

	public void readLang() {
		System.out.println("read lang");
	}

	public static void main(String[] args) {
		
		Language lg = new Language();
		lg.readLang();
		Language.useLang(lg);
		
	}

	//POM -- page chaining model -- supply Webdriver driver
}
