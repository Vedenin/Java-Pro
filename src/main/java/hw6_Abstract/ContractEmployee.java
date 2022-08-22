package hw6_Abstract;

public class ContractEmployee extends Employee {
	public ContractEmployee(String name, String position, double salary, Department department) {
		super(name, position, salary, department);
	}
	
	@Override
	public double calculateSalary() {
		return super.getSalary();
	}
}
