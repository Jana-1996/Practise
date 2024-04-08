package oopsfullRevision;

public class Tyres {
	private String brand;
	private int price;
	
	public Tyres(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
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
		return "Tyre1 [brand=" + brand + ", price=" + price + "]";
	}
}
