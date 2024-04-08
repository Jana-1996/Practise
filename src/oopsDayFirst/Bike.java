package oopsDayFirst;

public class Bike {
	private String brand;
	private int price;
	private Fuel fu;

	public void setFuel(Fuel fu) {
		this.fu = fu;
	}

	public Fuel getFuel() {
		return fu;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String toString() {
		return brand + " " + price + " " + fu;
	}
	

}
