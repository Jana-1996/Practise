package inheritance;

public class Android extends ButtonMobile {
	private String colour;
	
	
	public Android(String brand, int price, int capacity, String colour) {
		super(brand, price, capacity);
		this.colour = colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getColour() {
		/*String a = "jana";
		System.out.println(a);*/
		return colour;
	}
	public String toString() {
		return super.toString()+" Colour: "+colour;
	}
}
