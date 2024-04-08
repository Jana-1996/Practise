package inheritance;

public class ButtonMobile extends Electro {

	private int price;
	
	public  ButtonMobile(String brand, int capacity, int price) {
		super(brand,capacity);
		this.price = price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return super.cString()+" Price: "+price;
	}
	
}
