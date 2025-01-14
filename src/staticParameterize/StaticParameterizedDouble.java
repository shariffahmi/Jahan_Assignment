package staticParameterize;

public class StaticParameterizedDouble {

	public static void number(double x, double y) {

		System.out.println("Multiple of double values:" + x * y);
	}

	public static void number(double x, double y, double z) {

		System.out.println("MUltiple of double values:" + x * y * z);
       System.out.println( x + y + z+" :Summation of double values");
	}

	public static void main(String[] args) {
		StaticParameterizedDouble.number(80, 10);
		StaticParameterizedDouble.number(5, 5, 10);

	}

}
