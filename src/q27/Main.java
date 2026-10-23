package q27;

class Emp{
	int id=101;
	static String company_name="SDAC";
	
	void display() {
		System.out.println(id);
	}
	public static void displayComp() {
		System.out.println(company_name);
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		System.out.println(emp.id);
		System.out.println(Emp.company_name);
		emp.display();
		Emp.displayComp();
	}
}
