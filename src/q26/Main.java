package q26;

final class Company{
	final String address="Borivali";
	final void display() {
		System.out.println(address);
	}
}

public class Main {
	public static void main(String[] args) {
		Company company = new Company();
		company.display();
	}
}
