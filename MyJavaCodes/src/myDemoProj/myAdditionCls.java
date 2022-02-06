package myDemoProj;
import java.util.Scanner;
public class myAdditionCls {
	static int num3;
	public static void main(String[] args) {
		int num1;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two number : ");
		num1 = scn.nextInt();
		int num2 = scn.nextInt();
		scn.close();
		int result = num1+num2;
		System.out.println("The addition of two number is : "+result);
		System.out.println(num3);
	}

}
