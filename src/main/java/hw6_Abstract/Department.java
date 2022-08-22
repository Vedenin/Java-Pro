package hw6_Abstract;

public class Department {
	private String name;
	private Company company;
	private static int employeesCount;
	
	public Department(String name, Company company) {
		this.name = name;
		this.company = company;
	}
	
	public void setEmployeesCount(int employeesCount) {
		this.employeesCount = employeesCount;
	}
	
	public int getEmployeesCount() {
		return employeesCount;
	}
	
	public String getName() {
		return name;
	}
}
