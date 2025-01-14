package nonstatic;

public class NonStaticString {
  
	
	public void malibu() {
		String firstname="Fahmi";
		String lastname=" Sharif";
		String fullname=firstname+lastname;
		System.out.println(fullname);
	}
	public void Altadena() {
		
	
		String text = " evacuation allert\t";
		String text1 = "\"mandatory evacuation\"";
		String order = text+" "+text1;
		System.out.println(order);
	}

	public static void main(String[] args) {
		NonStaticString obj = new NonStaticString();
		obj.malibu();
		obj.Altadena();
	

	}

}
