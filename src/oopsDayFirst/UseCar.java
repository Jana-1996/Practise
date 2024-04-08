package oopsDayFirst;

public class UseCar {
	public static void main (String[]args) {
		Engine e1 = new Engine();
		e1.type = "Petrol";
		e1.cc = 3500;
		
		Car c1 = new Car();
		c1.brand = "BMW";
		c1.colour = "White";
		c1.price = 4500000;
		c1.eng = e1;
		System.out.println(c1.brand+" "+c1.price+" "+c1.colour+" "+c1.eng.cc+" "+c1.eng.type);
	}

}
