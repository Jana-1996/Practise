package polymorphism;

public class UseSBI {
	public static void main (String[]args) {
		Bank b = new SBI();
		System.out.println(b.branch("chengam"));
		System.out.println(b.interest(500));
		
		
		
		
		Bank r = new Bank();
		System.out.println(r.branch("Chennai"));
		System.out.println(r.interest(500));
		
	
	
	}
}
