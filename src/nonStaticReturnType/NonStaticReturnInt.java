package nonStaticReturnType;

public class NonStaticReturnInt {

	public int number() {
		int x = 1;
		int y = 2;
		int z = x + y;

		System.out.println(z);
		return z;

	}

	public int number1(int x, int y, int z) {

		System.out.println(x * y * z);
		return x;

	}

	public static void main(String[] args) {
		NonStaticReturnInt obj = new NonStaticReturnInt();
		obj.number();
		obj.number1(2, 3, 5);
	}

}
