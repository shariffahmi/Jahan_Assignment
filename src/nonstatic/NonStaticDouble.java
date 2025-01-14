package nonstatic;

public class NonStaticDouble {

	public void inaya() {
		double a = 6.9;
		double b = 2.5;
		double c = a + b;
		System.out.println(c);
	}

	public void israa() {
		double a = 10;
		double b = 20;
		double c = a * b;
		System.out.println(c);
	}

	public static void main(String[] args) {

		NonStaticDouble obj = new NonStaticDouble();
		obj.inaya();
		obj.israa();

	}

}
console 
	Sum of :9.4
Multiply of :200.0
