package polymorphism;

public class Action extends Movie {
	
	public String add(float a) {
		if(a >= 1 && a <= 3.5) {
			return "Bad";
		}
		else if(a > 3.5 && a <= 5.5 ) {
			return "Good";
		}
		else if(a > 5.5 && a <= 7.5) {
			return "Very Good";
		}
		else {
			return "Excellent";
		}
	}

}
