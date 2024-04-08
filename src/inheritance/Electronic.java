package inheritance;

public class Electronic {
	private String brand;
	private int price;
	
	public Electronic(String brand, int price) {
		this.brand = brand;
		this.price = price;
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
		return brand+" "+price;
	}
	
	public String isWarranty(boolean a) {
		if(a == true) {
			return "is Warranty";
		}
		else {
			return "No Warranty";
		}
	}
}
