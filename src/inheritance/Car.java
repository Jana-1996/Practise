package inheritance;

public class Car extends Vehicle{
	String colour;
	
	public String isPetrol(boolean a) {
		if( a == true) {
			return "is Petrol";
		}
		else {
			return "is Electric";
		}
	}

}
