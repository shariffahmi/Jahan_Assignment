package nonstatic;

public class NonStaticInt {

	
	public void number() {
     int a=10;
     int b=20;
     int c=30;
		System.out.println(a+b+c);
	}

	public void number1() {
	   int a=2;
       int b=2;
       int c=2;
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {

		NonStaticInt obj = new NonStaticInt();
		obj.number();
		obj.number1();
	}

}
Console 60
         6
