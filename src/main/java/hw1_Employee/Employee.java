package hw1_Employee;
public class Employee {
	private final String name;
	private final String position;
	private final String email;
	private final String phone;
	private final double salary;
	private final int age;
	
	public Employee(String name, String position, String email, String phone, double salary, int age) {
		this.name = name;
		this.position = position;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Position: " + position);
		System.out.println("Email: " + email);
		System.out.println("Phone: " + phone);
		System.out.println("Salary: " + salary);
		System.out.println("Age: " + age);
		System.out.println("----------------------------------\n");
	}
	
	@Override
	public String toString() {
		return "Employee{" +
				"name='" + name + '\'' +
				", position='" + position + '\'' +
				", email='" + email + '\'' +
				", phone='" + phone + '\'' +
				", salary=" + salary +
				", age=" + age +
				'}';
	}
	
	public int getAge() {
		return age;
	}
}
