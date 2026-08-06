package OOP_Abstract;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("Login Page constructor...");
	}
	
	public LoginPage(int a) {
//		super(a); // This will call parent class constructor
		System.out.println("Login Page constructor..."+ a);
	}

	@Override
	public void title() {
		System.out.println("LoginPage....Title");
	}

	@Override
	public void url() {
		System.out.println("LoginPage....URL");
	}
	
	@Override
	public void pageLoadTime() {
		System.out.println("Page load timeout = 2 secs");
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("Logged in user with : " + un + " " + pwd);
	}

}
