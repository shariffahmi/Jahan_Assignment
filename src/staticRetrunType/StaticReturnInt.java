package staticRetrunType;

public class StaticReturnInt {

	public static int number() {
		int x = 1;
		int y = 2;
		int z = x + y;

		System.out.println(z);
		return z;

	}

	public static int number1(int x, int y, int z) {

		System.out.println(x * y * z);
		return x;

	}

	public static void main(String[] args) {
		 
		StaticReturnInt.number();
		StaticReturnInt.number1(2, 3, 5);
	}

}
