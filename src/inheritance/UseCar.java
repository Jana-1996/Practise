package inheritance;

public class UseCar {
	public static void main (String[]args) {
		Car c = new Car();
		c.brand = "TATA";
		c.colour = "Black";
		c.price = 450000;
		c.netPrice(4500000, 5);
		System.out.println(c.isPetrol(false));
		System.out.println(c.brand+" "+c.colour+" "+c.netPrice(4500000, 5));
	}
}
