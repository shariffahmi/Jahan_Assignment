package nonstaticParameterize;

public class NonStaticParameterizedDouble {

	public void number(double x, double y) {

		System.out.println("Multiple of double values:" + x * y);
	}

	public void number(double x, double y, double z) {

		System.out.println("MUltiple of double values:" + x * y * z);
       System.out.println( x + y + z+" :Summation of double values");
	}

	public static void main(String[] args) {
		NonStaticParameterizedDouble obj = new NonStaticParameterizedDouble();
		obj.number(25.0, 30.0);
		obj.number(5.0, 35.15, 30.0);

	}

}
