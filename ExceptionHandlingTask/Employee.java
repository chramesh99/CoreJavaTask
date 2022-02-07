package corejava.task;
import java.util.*;
public class Employee {
	String name;
	int id;
	String address;
	ArrayList<Employee> employees;
	public Employee(String name , int id , String address) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.employees = new ArrayList<>();
	}
	
	public void addEmployee(String name , int id , String address) {
		employees.add(new Employee(name , id , address));
	}
	
	public String getName() {
		return this.name;
	}
	public int getId() {
		return this.id;
	}
	public String getAddress() {
		return this.address;
	}
	public ArrayList<Employee> getEmployees(){
		return this.employees;
	}
	
	void enter() throws InvaildEmpId {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id:");
		int id = sc.nextInt();
		Iterator<Employee> list = employees.iterator();
		while(list.hasNext()) {
			Employee emp = list.next();
			//System.out.println(emp.getId());
			if(emp.getId() == id) {
				System.out.println("Welcome");
				return;
			}
		}
		throw new InvaildEmpId();
	}
}
