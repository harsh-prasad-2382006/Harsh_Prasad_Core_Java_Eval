package q8;

import java.util.List;

public interface Operations {
	void add(List<Emp> emps);
	void update(int id, String name,double sal);
	void delete(int id);
	void show();
	void search(int id);
}
