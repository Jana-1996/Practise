package oopsDayFirst;

public class UseBike {
	public static void main (String[]args) {
		Fuel f1 = new Fuel();
		f1.setPrice(105);
		f1.setType("Petrol");
	    
		Bike b1 = new Bike();
		b1.setBrand("Splender");
		b1.setPrice(95000);
		b1.setFuel(f1);
		/*System.out.println("Bike Model: "+b1.getBrand()+" "+
		                   "Bike Price: "+b1.getPrice()+" "+
				           "Fuel Price: "+b1.getFuel().getPrice()+" "+
		                   "Fuel Type: "+b1.getFuel().getType());*/
		System.out.println(b1.getFuel().getPrice());
	}

}
