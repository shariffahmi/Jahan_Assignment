package nonstaticParameterize;

public class NonstaticParameterizeString {

	public void cityinfo(String name, String address) {

		System.out.println("Name and Address of City:" + name + ", " + address);

	}

	public void personalinfo(String name, String designation, String cell) {

		System.out.println("Personal Info:" + name + " " + designation + " ," + cell);

	}

	public static void main(String[] args) {
		NonstaticParameterizeString obj = new NonstaticParameterizeString();
		obj.cityinfo("Reseda", "193569 ShermanWay");
		obj.personalinfo("Donal Trump", "Presedent of USA", " Secrate number");

	}

}
