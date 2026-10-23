package q10;

class Outer{
	private int a=10;
	void outerMeth() {
		

		class Inner{
			void innerMeth() {
				System.out.println(a);
			}
		}
		Inner inner = new Inner();
		inner.innerMeth();
	}
	
}

public class Main {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.outerMeth();
	}
}
