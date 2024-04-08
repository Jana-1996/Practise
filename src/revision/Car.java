package revision;

public class Car {
	private String brand;
	private int price;
	private Engine engine;

	public void setEng(Engine engine) {
		this.engine = engine;
	}

	public Engine getEng() {
		return engine;
	}

	public Car(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		System.out.println();
		return brand;
		// System.out.println();
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}
