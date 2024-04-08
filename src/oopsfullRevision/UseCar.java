package oopsfullRevision;

public class UseCar {
	public static void main(String[] args) {
		Tyres t1 = new Tyres("CEAT", 4000);
		Tyres t2 = new Tyres("APOLLO", 4500);
		Tyres t3 = new Tyres("MRF", 5000);
		Tyres t4 = new Tyres("XXX", 3500);

		Tyres[] t = { t1, t2, t3, t4 };

		Engine e = new Engine();
		e.setBrand("Chandra");
		e.setPrice(350000);

		Car c = new Car();
		c.setBrand("TATA");
		c.setColour("Black");
		c.setT(t);
		c.setE(e);
		System.out.println(c.getT()[0].getBrand() + " " + c.getT()[1].getBrand() + " " + c.getE().getBrand());
		System.out.println(c);
	}

}
