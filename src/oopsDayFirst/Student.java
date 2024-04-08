package oopsDayFirst;

public class Student {
	private String name;
	private int age;
	private String dept;
	
	public Student(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public String toString() {
		return name+" "+age+" "+dept;
	}

}
