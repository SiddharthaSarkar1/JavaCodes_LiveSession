package myDemoProj;
public class ConstExamp {
	int number1;
	String name;
	//No-argument constructor
	ConstExamp(){
		System.out.println("This is no argument constructor.");
	}
	//parameterized constructors (passing one parameter)
	ConstExamp(int no){
		number1 = no;
		System.out.println("number1 -> "+number1);
	}
	//parameterized constructors (passing two parameter)
	ConstExamp(int no, String name){
		number1 = no;
		this.name = name;
		System.out.println("number1 -> "+number1+" and name1 ->"+name);
	}
	public static void main(String[] args) {
		ConstExamp obj = new ConstExamp();// No argument constructor will invoke
		ConstExamp obj1 = new ConstExamp(23456);// parameterized constructor will invoke
		ConstExamp obj2 = new ConstExamp(5, "Pintu Ray");// parameterized constructor will invoke
	}
}
