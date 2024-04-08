package inheritance;

public class Electro {

	private String brand;
	private int capacity;
	
	public Electro(String brand, int capacity) {
		this.brand = brand;
		this.capacity = capacity;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getCapacity() {
		return capacity;
	}
	public String cString() {
		return "Brand: "+brand+" "+"Capacity: "+capacity;
	}
}
