package polymorphism;

public class Loan {
   
	public int loan(int l) {
		return l;
	}
	public String sloan(int salary, int loan) {
		int percentage = (salary*10)/100;
		return "salary loan: "+(percentage+loan);
	}
	public String pploan(int loan, int salary, int property) {
		return "porperty loan: "+(loan+salary*10/100+property*10/100);
	}
}
