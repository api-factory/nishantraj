package Assignment;

/**
 * @author IMGADMIN
 *
 */
public class Employee {
	private int empID;
	private String empName;
	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}
	/**
	 * @return the empID
	 */
	public int getEmpID() {
		return empID;
	}
	
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	
	
}
