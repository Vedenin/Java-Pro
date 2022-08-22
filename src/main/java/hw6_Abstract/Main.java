package hw6_Abstract;

public class Main {
	public static void main(String[] args) {
		
		Company company = new Company("TelRan");
		Department department = new Department("IT", company);
	
		ContractEmployee ce1 = new ContractEmployee("John", "Driver", 123.50, department);
		ContractEmployee ce2 = new ContractEmployee("Petrova Elena Semenovna", "Lawyer", 1000.00, department);
		RegularEmployee re1 = new RegularEmployee("John", "Driver", 123.50, department);
		RegularEmployee re2 = new RegularEmployee("Petrova Elena Semenovna", "Lawyer", 1000.00, department);
		
		re1.setBonus(1000);
		re2.setBonus(1000);
		
		Employee[] employees = {ce1, ce2, re1, re2};
		for (Employee e : employees) {
			System.out.println("Name " + e.getName() + " salary " + e.getSalary());
		}
	}
}
