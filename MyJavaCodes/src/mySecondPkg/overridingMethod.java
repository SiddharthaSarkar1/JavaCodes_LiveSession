package mySecondPkg;

class animal{
	public void eat() {
		System.out.println("Animals can eat food");
	}
}

class dog extends animal{
	public void eat() {
		System.out.println("Dog eats food.");
	}
}

public class overridingMethod {

	public static void main(String[] args) {
		animal an = new animal();
		an.eat();
		dog dg = new dog();
		dg.eat();
		
		animal an2 = new dog();
		an2.eat();
		
		

	}

}
