package q8;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Operation_implementer implements Operations {
	List<Emp> db =  new ArrayList<Emp>();
	@Override
	public void add(List<Emp> emps) {
		db.addAll(emps);
	}

	@Override
	public void update(int id, String name, double sal) {
		Iterator<Emp> iterator = db.iterator();
		while(iterator.hasNext()) {
			Emp emp  =  (Emp) iterator.next();
			if(emp.getId()==id) {
				emp.setId(id);
				emp.setName(name);
				emp.setSal(sal);
			}
		}
		
	}

	@Override
	public void delete(int id) {
		Iterator<Emp> iterator = db.iterator();
		while(iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if(emp.getId()==id) {
				iterator.remove();
				System.out.println(emp.getId()+" Deleted...");
			}
		}
		
	}

	@Override
	public void show() {
		Iterator<Emp> iterator = db.iterator();
		while(iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			System.out.println(emp);
		}
		
	}

	@Override
	public void search(int id) {
		Iterator<Emp> iterator = db.iterator();
		while(iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if(emp.getId()==id) {
				System.out.println(emp);
				return;
			}
		}
		
		System.out.println("Not found");
	}

	
	

}



