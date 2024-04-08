package polymorphism;

public class SBI extends Bank {
@Override
	public int interest(int price) {
		return price+(price*25)/100;
	}
}
