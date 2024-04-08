package oopsDayFirst;

public class Fuel {
	private String type;
	private int price;
	
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setPrice(int price) {
		 this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return type+" "+price;
	}
}
