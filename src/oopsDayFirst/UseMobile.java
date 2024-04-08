package oopsDayFirst;

public class UseMobile {
	public static void main (String[]args) {
		Battery b1 = new Battery();
		b1.capacity = 5000;
	    b1.type = "Lithiam";
	    
	    Mobile m1 = new Mobile();
	    m1.brand = "Vivo";
	    m1.price = 6000;
	    m1.btry = b1;
	    
	    System.out.println(m1.brand+" "+m1.price+" "+m1.btry.type+" "+m1.btry.capacity);
	}
}
