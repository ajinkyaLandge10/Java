package basicProgramming;

public class CallByRef {

	public static void sendMail(CallByRef ref) {
		System.out.println("send mail");
		ref.readMail();
	}

	public void readMail() {
		System.out.println("read mail");
	}

	public static void main(String[] args) {

		CallByRef obj = new CallByRef();
		CallByRef.sendMail(obj);

	}

}
