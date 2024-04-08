package oopsDayFirst;

public class UseCollege {
	public static void main(String[] args) {
		Student std1 = new Student("Velu", 21, "Tamil");
		College clg = new College("Government Arts College", 5, "arts" + " " + std1);
		System.out.println(clg);
  }
}