//String to Integer Conversion 
package myDemoProj;

public class strToInt {
	public static void main(String[] args) {
		String myVal = "100000";
		int convVal = Integer.parseInt(myVal);
		System.out.println("Type of "+myVal+" before convertion is : "+myVal.getClass().getSimpleName());
		System.out.println("Type of "+convVal+" after convertion is : "+((Object)convVal).getClass().getSimpleName());
	}
}
