package q8;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Emp emp = new  Emp();
		emp.setId(1);
		emp.setName("Harsh");
		emp.setSal(23000);
		
		Emp emp2 = new Emp();
		emp2.setId(2);
		emp2.setName("Aman");
		emp2.setSal(43000);
		
		Emp emp3 = new Emp();
		emp3.setId(3);
		emp3.setName("Shubham");
		emp3.setSal(20000);
		
		ArrayList<Emp> arrayList =  new ArrayList<Emp>();
		arrayList.add(emp);
		arrayList.add(emp2);
		arrayList.add(emp3);
		
		Operation_implementer implementer = new Operation_implementer();
		implementer.add(arrayList);
		implementer.show();
		implementer.update(2, "Ankur", 10000);
		implementer.show();
		implementer.delete(2);
		implementer.show();
		implementer.search(3);
	}
}

