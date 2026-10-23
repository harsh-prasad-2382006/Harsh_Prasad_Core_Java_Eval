package q19;

interface Salary {
    void calSal(double salary,double bonus);
}

public class A {
    public static void main(String[] args) {
        Salary a = new Salary() {
        	@Override
			public void calSal(double salary, double bonus) {
				System.out.println(salary+bonus);
			};
        };
        a.calSal(23000,4000);
    }
}