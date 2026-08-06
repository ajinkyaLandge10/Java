package OOP_Abstract;

public class PageTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(10);
		lp.title();//overridden
		lp.url();//overridden
		lp.pageLoadTime();//overridden
		lp.doLogin("admin", "admin123");//individual
		lp.logo();//inherited 

//		Top casting: child class object can be referred by parent abstract.. class reference variable
		Page p = new LoginPage();
		p.url();
		p.title();
		p.pageLoadTime();
		p.logo();
		
//		Down casting: Not applicable as we can't create object of abstract class 
		
	}

}
