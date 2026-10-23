package q2;

class Accountant implements CompanyPolicy{

	@Override
	public void calSal(double sal) {
		System.out.println(sal);	
	}

	@Override
	public void calSal(double sal, double bonus) {
		System.out.println(sal+bonus);
	}

	@Override
	public void calSal(double sal, double bonus, double tax) {
		System.out.println(sal+bonus-tax);
	}
	
}


class Manager extends  Accountant{
	@Override
	public void calSal(double sal) {
		super.calSal(sal);
	}
	
	@Override
	public void calSal(double sal, double bonus) {
		// TODO Auto-generated method stub
		super.calSal(sal, bonus);
	}
	@Override
	public void calSal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		super.calSal(sal, bonus, tax);
	}
}
public class Main {
	public static void main(String[] args) {
		Accountant accountant = new Accountant();
		System.out.println("Accountant");
		accountant.calSal(230000);
		accountant.calSal(230000, 23000);
		accountant.calSal(230000, 23000, 2330);
		
		
		Manager manager = new Manager();
		System.out.println("Manager");
		manager.calSal(230000);
		manager.calSal(230000, 23000);
		manager.calSal(230000, 23000, 2330);
		
		
	}
}
