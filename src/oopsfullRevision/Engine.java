package oopsfullRevision;

public class Engine {
	private String brand;
	private int price;

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Engine [brand=" + brand + ", price=" + price + "]";
	}
}
