package q29;

class Emp{
	int id=101;
	static String name="HArsh";
	public static void display(double sal) {
		System.out.println(sal);
	}
}

public class Main {
	public static void main(String[] args) {
		Emp emp = new Emp();
		System.out.println(emp.id);
		System.out.println(Emp.name);
		Emp.display(23000);
	}
}
