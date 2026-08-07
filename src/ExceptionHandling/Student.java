package ExceptionHandling;

public class Student {

	public int getMarks(String studentName) {

		System.out.println("Getting marks for student: " + studentName);

		if (studentName.equals("Neha")) {
			//System.exit(0);//shutdown the JVM - only in this case finally will not executed
			try {
				int i = 9 / 3;
				return 100;
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException is Coming..");
				return 50;
			} finally {
				System.out.println("Fail....");
				return 75; // return from finally is on top priority exception is coming or not
			}
		} else if (studentName.equals("Ajinkya")) {
			return 90;
		} else if (studentName.equals("Sakshi")) {
			return 80;
		} else {
			System.out.println("Please pass the right student name...");
			throw new AppException("Student not found....");
		}
	}

	public static void main(String[] args) {

		Student st = new Student();
		int mark = st.getMarks("Neha");
		System.out.println(mark);
	}

}
