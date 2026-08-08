package DataConversion;
//@formatter:off
public class WrapperClassConcept {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20);// 10020
		
//		String to int --> Integer:
		int i = Integer.parseInt(x);
		System.out.println(i+20);//120
		
//		String to double -->Double:
		String y = "12.33";
		System.out.println(y+20);//12.3320
		double d = Double.parseDouble(y);
		System.out.println(d+20);//32.33
		
//		String to boolean -->Boolean:
		String remoteExecution = "true";
		boolean flag = Boolean.parseBoolean(remoteExecution);
		if(flag) {
			System.out.println("Run TCs on AWS");
		}else {
			System.out.println("Run TCs on Local");
		}
		
//		int to String -->
		int age = 30;
		String ageVal = String.valueOf(age);//"30"
		System.out.println(ageVal+20);//3020

//		double to String
		double d1 = 22.33;
		String salary = String.valueOf(d1);//"22.33"
		System.out.println(salary+10);//22.3310
		
//		boolean to String
		boolean f = false;
		String f1 = String.valueOf(false);//"false"
		System.out.println(f1+12);//false12
		
		
//Interview Question --> parse method works only on pure integer not on alphanumeric value
//		String l = "100A";
//		int l1 = Integer.parseInt(l); //NumberFormatException
//		System.out.println(l1+20);
		
		System.out.println();
		
// Range of all Primitive Data types :
		System.out.println(Byte.MIN_VALUE +" to "+Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE +" to "+Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE +" to "+Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE +" to "+Long.MAX_VALUE);
		System.out.println(Double.MIN_VALUE +" to "+Double.MAX_VALUE);
		System.out.println(Float.MIN_VALUE +" to "+Float.MAX_VALUE);
		
		
		
		
		
		

	}

}
