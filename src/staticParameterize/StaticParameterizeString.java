package staticParameterize;

public class StaticParameterizeString {

	public static void cityinfo(String name, String address) {

		System.out.println("Name and Address of City:" + name + ", " + address);

	}

	public static  void personalinfo(String name, String designation, String cell) {

		System.out.println("Personal Info:" + name + " " + designation + " ," + cell);

	}

	public static void main(String[] args) {
		
		StaticParameterizeString.cityinfo("Reseda", "193569 ShermanWay");
		StaticParameterizeString.personalinfo("Donal Trump", "Presedent of USA", " Secrate number");

	}

}
