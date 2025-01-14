package nonStaticReturnType;

public class NonstaticReturnString {

	public String cityinfo() {
		String cityName = "REseda";
		String address = "15286 ShermanWay ";

		System.out.println("Name and Address of City:" + cityName + ", " + address);
		return address;

	}

	public String personalinfo() {
		String name = "Dona Trupm";
		String status = "\"Presedent of USA\"";
		String cellNUmber = "Secrate Number";
		System.out.println("Personal Info:" + name + ", " + status + " ," + cellNUmber);
		return null;
		

	}

	public static void main(String[] args) {
		NonstaticReturnString obj = new NonstaticReturnString();
		obj.cityinfo();
		obj.personalinfo();
	}

}
