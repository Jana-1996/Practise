package inheritance;

public class Vehicle {
	String brand;
	int price;
	
	public int netPrice(int price, int percentage) {
		return (price*percentage)/100+price;
	}

}
