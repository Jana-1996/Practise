package polymorphism;

public class UseLoan {
	public static void main (String[]args) {
		Loan l = new Loan();
		System.out.println(l.loan(30000));
		System.out.println(l.sloan(15000, 30000));
		System.out.println(l.pploan(30000, 15000, 50000));
		
	}

}
