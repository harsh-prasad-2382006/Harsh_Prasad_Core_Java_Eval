package q16;



class Emp implements Cloneable {
	int id;
	String name;
	double salary;
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}


public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp emp = new Emp(101, "Harsh",23330);
		System.out.println(emp);
		
		Emp emp2 = (Emp) emp.clone();
		System.out.println(emp2);
		
	}
}
