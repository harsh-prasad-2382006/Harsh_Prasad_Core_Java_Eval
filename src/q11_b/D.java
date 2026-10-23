package q11_b;

import q11_a.A;

public class D {
	public static void main(String[] args) {
		A ob = new A();
		System.out.println(ob.a);
	}
}


class E extends A{
	public static void main(String[] args) {
		E ob= new E();
		System.out.println(ob.a);
		System.out.println(ob.c);
	}
}