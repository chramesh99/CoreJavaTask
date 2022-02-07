package corejava.task;
import java.util.*;

public class ExceptionHandlingTask {
	public static void main(String[] args) {
		Employee obj = new Employee("dundi",1,"v");
		obj.addEmployee("dundi", 1, "vja");
		obj.addEmployee("dundi", 2, "vja");
		obj.addEmployee("dundi", 3, "vja");
		try {
			obj.enter();
		}catch(Exception e) {
			System.out.println(e);
		}
				
	}
}
