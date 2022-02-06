package myDemoProj;

public class ReturnDataTypeDemo {
	public static void typeVoid() {
		System.out.println("Not return anything.");
	}
	public static int typeInt(int a) {
		return a;
	}
	public static double typeDouble(double b) {
		return b;
	}
	public static char typeChar(char c) {
		return c;
	}
	public static boolean typeBoolean(boolean d) {
		return d;
	}
	public static String typeString(String e) {
		return e;
	}
	
	public static void main(String[] args) {
		typeVoid();
		int res = typeInt(10);
		System.out.println(res);
		double res2 = typeDouble(20.75);
		System.out.println(res2);
		char res3 = typeChar('A');
		System.out.println(res3);
		boolean myVal = true;
		boolean res4 = typeBoolean(myVal);
		System.out.println(res4);
		String res5 = typeString("Siddhartha");
		System.out.println(res5);
	}

}
