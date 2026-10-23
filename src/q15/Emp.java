package q15;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Emp {
	
	private int id;
	private String name;
	private double sal;
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setId(1);
		emp.setName("Harsh");
		emp.setSal(230000);
		Emp emp2 = new Emp();
		
		emp2.setId(2);
		emp2.setName("Ankur");
		emp2.setSal(4000);
		Emp emp3 = new Emp();
		emp3.setId(3);
		emp3.setName("Vishnu");
		emp3.setSal(4800);
		Emp emp4 = new Emp();
		emp4.setId(4);
		emp4.setName("Anjali");
		emp4.setSal(23000);
		
		
		
		List<Emp> emps = new ArrayList<Emp>();
		emps.add(emp);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		
		for (Emp emp5 : emps) {
			System.out.println(emp5);
		}
		
		
		Vector<Emp> vec = new Vector<Emp>();
		vec.add(emp);
		vec.add(emp2);
		vec.add(emp3);
		vec.add(emp4);
		
		Enumeration<Emp> enumeration = vec.elements();
		while(enumeration.hasMoreElements()) {
			Emp emp5 = (Emp) enumeration.nextElement();
			System.out.println(emp5);
		}
	}
}



