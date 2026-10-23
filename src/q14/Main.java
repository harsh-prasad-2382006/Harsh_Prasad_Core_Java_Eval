package q14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main  {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setId(1);
		emp.setName("Peter");
		emp.setSal(45000);
		Emp emp2 = new Emp();
		emp2.setId(3);
		emp2.setName("Harry");
		emp2.setSal(23000);
		Emp emp3 = new Emp();
		emp3.setId(2);
		emp3.setName("Jerry");
		emp3.setSal(56000);
		Emp emp4 = new Emp();
		emp4.setId(4);
		emp4.setName("Tom");
		emp4.setSal(12000);
		
		List<Emp> emps = new ArrayList<Emp>();
		emps.add(emp);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		
		System.out.println("Normal...");
		Iterator<Emp> iterator = emps.iterator();
		while (iterator.hasNext()) {
			Emp emp5 = (Emp) iterator.next();
			System.out.println(emp5);
		}
		System.out.println("Sorted with ID");
		Collections.sort(emps, new IdComparator());
		Iterator<Emp> iterator2 = emps.iterator();
		while (iterator2.hasNext()) {
			Emp emp5 = (Emp) iterator2.next();
			System.out.println(emp5);
		}
		System.out.println("Sorted with Name");
		Collections.sort(emps, new StringComparator());
		Iterator<Emp> iterator3 = emps.iterator();
		while (iterator3.hasNext()) {
			Emp emp5 = (Emp) iterator3.next();
			System.out.println(emp5);
		}
		System.out.println("Sorted with Salary");
		Collections.sort(emps, new SalComparator());
		Iterator<Emp> iterator4 = emps.iterator();
		while (iterator4.hasNext()) {
			Emp emp5 = (Emp) iterator4.next();
			System.out.println(emp5);
		}
	}
}
