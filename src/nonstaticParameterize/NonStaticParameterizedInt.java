package nonstaticParameterize;

public class NonStaticParameterizedInt {

	public void number(int x, int y) {

		System.out.println("Multiple of values:" + x * y);
	}
	
	public void number(int x, int y, int z) {

		System.out.println("MUltiple of values:" + x * y* z);
		System.out.println("Summation of values:" + x+y+z);
	}

	public static void main(String[] args) {
		NonStaticParameterizedInt obj = new NonStaticParameterizedInt();
		obj.number(25, 30);
		obj.number(10,15, 5);

	}

}
