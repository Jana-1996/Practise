package oopsDayFirst;

public class College {
	private String name;
	private int noOfDept;
	private String type;
	private Student std;

	public College(String name, int noOfDept, String type) {
		this.name = name;
		this.noOfDept = noOfDept;
		this.type = type;
	}

	public void setStudent(Student std) {
		this.std = std;
	}

	public Student getStudent() {
		return std;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNoOfDept(int noOfDept) {
		this.noOfDept = noOfDept;
	}

	public int getDept() {
		return noOfDept;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public String toString() {
		return name + " " + noOfDept + " " + type;
	}

}
