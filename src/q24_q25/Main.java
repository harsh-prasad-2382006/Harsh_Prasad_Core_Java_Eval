package q24_q25;

class Accountant{
	void calSal(double sal) {
		System.out.println(sal);
	}
	void calSal(double sal,double bonus) {
		System.out.println(sal+bonus);
	}
	void calSal(double sal, double bonus,double tax) {
		System.out.println(sal+bonus-tax);
	}
}


class Emp extends Accountant{
	@Override
	void calSal(double sal) {
		// TODO Auto-generated method stub
		super.calSal(sal);
	}
	
	@Override
	void calSal(double sal, double bonus) {
		// TODO Auto-generated method stub
		super.calSal(sal, bonus);
	}
	
	@Override
	void calSal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		super.calSal(sal, bonus, tax);
	}
}
public class Main {
	public static void main(String[] args) {
		Accountant accountant= new Accountant();
		System.out.println("Accountant");
		accountant.calSal(23000);
		accountant.calSal(23000, 2300);
		accountant.calSal(23000, 2300, 230);
		
		Emp emp = new Emp();
		System.out.println("Employee");
		emp.calSal(10000);
		emp.calSal(10000, 1000);
		emp.calSal(10000,1000,100);
	}
}
