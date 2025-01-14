package staticRetrunType;

public class StaticReturnString {

	public static String cityinfo() {
		String cityName = "REseda";
		String address = "15286 ShermanWay ";

		System.out.println("Name and Address of City:" + cityName + ", " + address);
		return address;

	}

	public static String personalinfo() {
		String name = "Dona Trupm";
		String status = "\"Presedent of USA\"";
		String cellNUmber = "Secrate Number";
		System.out.println("Personal Info:" + name + ", " + status + " ," + cellNUmber);
		return null;
		

	}

	public static void main(String[] args) {
		
		StaticReturnString.cityinfo();
		StaticReturnString.personalinfo();
	}

}
