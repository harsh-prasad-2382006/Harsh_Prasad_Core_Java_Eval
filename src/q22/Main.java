package q22;

class Manager{
	int id=101;
	String name="Shubham";
	public Manager() {
		System.out.println("Parent Constructor...");
	}
	
	void display() {
		System.out.println(id);
		System.out.println(name);
	}
}

class Emp extends Manager{
	int id=102;
	String name="Harhs";
	public Emp() {
		super();
		super.display();
		System.out.println("Child Constructor....");
	}
	
	void show() {
		System.out.println(id);
	System.out.println(name);
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.show();
	}
}
