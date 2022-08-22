package hw6_Abstract;

public class RegularEmployee extends Employee {
	
	private double bonus;
	
	public RegularEmployee(String name, String position, double salary, Department department) {
		super(name, position, salary, department);
	}
	
	@Override
	public double calculateSalary() {
		return super.getSalary() + bonus;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
}
