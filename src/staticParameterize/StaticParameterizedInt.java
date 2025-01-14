package staticParameterize;

public class StaticParameterizedInt {

	public static void number(int x, int y) {

		System.out.println("Multiple of values:" + x * y);
	}
	
	public static void number(int x, int y, int z) {

		System.out.println("MUltiple of values:" + x * y* z);
		System.out.println("Summation of values:" + x+y+z);
	}

	public static void main(String[] args) {
		StaticParameterizedInt.number(5, 30);
		StaticParameterizedInt.number(15, 15, 10);

	}

}
