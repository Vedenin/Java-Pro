package hw6_Abstract;

public abstract class Employee {
	private String name;
	private String position;
	private double salary;
	private Department department;
	
	public Employee(String name, String position, double salary, Department department) {
		this.name = name;
		this.position = position;
		this.salary = salary;
		this.department = department;
		this.department.setEmployeesCount(this.department.getEmployeesCount() + 1);
	}
	
	public abstract double calculateSalary();
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
}
