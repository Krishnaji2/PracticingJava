import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashmapEmployee {

	private static HashMap<Employee, String> hm = new HashMap<>();

	public static void main(String[] args) {
		Employee emp1 = new Employee(001, "Krishna1", "Engineering1");
		Employee emp2 = new Employee(002, "Krishna2", "Engineering2");
		Employee emp3 = new Employee(003, "Krishna3", "Engineering3");  
		Employee emp4 = new Employee(001, "Krishna1", "Engineering1");  
		Employee emp5 = new Employee();
		hm.put(emp1, "emp1"); 
		hm.put(emp2, "emp2");
		hm.put(emp3, "emp3");
		hm.put(emp4, "emp4");
		hm.put(emp5, "emp4");

		Set<Employee> keySet = hm.keySet();
		Iterator<Employee> it = keySet.iterator();
		while (it.hasNext()) {
			Employee employee = (Employee) it.next(); 
			System.out.println(employee.hashCode()); 

		}
	}
}

class Employee {
	private int id;
	private String name;
	private String department;
	
	public Employee () {
		
	}
	public Employee(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("equals called...");
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Employee e = (Employee) o;
		if (id != e.id)
			return false;
		if (name != null ? !name.equals(e.name) : e.name != null)
			return false;
		return department != null ? department.equals(e.department) : e.department != null;
	}
	
	@Override
	public int hashCode() {
		
		int res = 15;
		res += id;
		res += name == null? 0:name.hashCode();
		res += department == null ? 0: department.hashCode();
		res = res*25;
		System.out.println("hashCode value:"+res);
		return res;
	}
}
