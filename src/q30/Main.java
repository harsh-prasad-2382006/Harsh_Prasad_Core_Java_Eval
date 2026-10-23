package q30;

class Emp{
	int id;
	String name;
	double salary;
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void displayInfo() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp(101,"harsh", 2330);
		emp.displayInfo();
	}
}
