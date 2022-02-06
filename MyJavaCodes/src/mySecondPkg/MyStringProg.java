//String, StringBuilder, StringBuffer
package mySecondPkg;

public class MyStringProg {

	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = new String("Hii World");
		StringBuffer strbf = new StringBuffer("Siddhartha");
		StringBuilder strbl = new StringBuilder("Full Stack Java Development");
		
		System.out.println("String using reference : "+str1);
		str1 = str1.concat("New Concat");
		System.out.println(str1);
		System.out.println("String using new keyword : "+str2);
		System.out.println("StringBuffer : "+strbf);
		System.out.println("StringBuilder : "+strbl);
		
		

	}

}
