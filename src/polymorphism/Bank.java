package polymorphism;

public class Bank {
	
	public int interest(int price) {
		return price+(price*10)/100;
	}
	public String branch(String a) {
		return a;
	}

}
