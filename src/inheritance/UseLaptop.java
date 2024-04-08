package inheritance;

public class UseLaptop {
	public static void main (String[]args) {
		Laptop l= new Laptop("TATA",15000,"Black", "Acer");
		System.out.println(l+" "+l.isWarranty(true));
	}
}
