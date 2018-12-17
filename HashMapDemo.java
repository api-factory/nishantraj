package Assignment;

import java.util.HashMap;
import java.util.Map;

/**
 * @author IMGADMIN
 *
 */
public class HashMapDemo {
	
	/**
	 * @param args
	 */
	public static void main(String [] args){
		
		//Store and print Employee Data in hashmap 
		Map<Employee,Employee> employeeMap = new HashMap<>();
		Employee emp1 = new Employee(1,"John");
		Employee emp2 = new Employee(2,"Robert");
		employeeMap.put(emp1, emp1);
		employeeMap.put(emp2, emp2);
		employeeMap.forEach((k,v) -> System.out.println("Employee ID " + v.getEmpID() + " Employee Name " + v.getEmpName()));
		// End	
	}
}
