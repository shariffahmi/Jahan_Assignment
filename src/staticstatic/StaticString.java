package staticstatic;

public class StaticString {
	
	
	
	public static void pacific() {
		
		String beach = "Malibu";
		String ocean = "pacific";
		String area = beach+" "+ocean;
		System.out.println(area);
		
		
	}
	public static void losangeles() {
		 String county = "Ventura";
		 String city = " Northridge";
		String place = county+city;
		System.out.println(place);
		
	}
	public static void main(String[] args) {
		StaticString.pacific();
		StaticString.losangeles();

	}

}
