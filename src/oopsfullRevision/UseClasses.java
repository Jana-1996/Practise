package oopsfullRevision;

public class UseClasses {
	public static void main (String[]args) {
		Class1 c1 = new Class1();
		System.out.println(c1.write()); // Holiday
		System.out.println(c1.add(5, 5)); //10
		
		Class2 c2 = new Class2();
	    System.out.println(c2.add(5, 5)); //0
	    System.out.println(c2.write()); // working day
	    
	    Class1 c3 = new Class2();
	    System.out.println(c3.add(8, 4));	//4
	    
	    
	}
}
