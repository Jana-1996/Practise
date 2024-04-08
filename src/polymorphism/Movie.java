package polymorphism;

public class Movie {
	public String add(float a) {
		if(a <= 2.5) {
			return "Bad";
		}
		else if(a > 2.5 & a < 3) {
			return "Good";
		}
		else {
			return "Excellent";
		}
	}
}
