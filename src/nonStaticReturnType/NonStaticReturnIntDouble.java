package nonStaticReturnType;

public class NonStaticReturnIntDouble {

	public double number() {
		double x = 1.50;
		double y = 2.50;
		double z = x + y;

		System.out.println(z);
		return z;

	}

	public double number1(double x, double y, double z) {

		System.out.println(x * y * z);
		return x;

	}

	public static void main(String[] args) {
		NonStaticReturnIntDouble obj = new NonStaticReturnIntDouble();
		obj.number();
		obj.number1(2, 3, 5);
	}

}
