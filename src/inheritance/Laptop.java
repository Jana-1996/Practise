package inheritance;

public class Laptop extends Electronic {
     
	private String colour;
	private String model;
	
	public Laptop(String brand, int price, String colour, String model) {
		super(brand, price);
		this.colour = colour;
		this.model = model;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getColour() {
		return colour;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public String toString() {
		return colour+" "+model+" "+super.toString();
	}
}
