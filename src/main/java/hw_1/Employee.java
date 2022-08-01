package hw_1;
/*
Создайте класс «Сотрудник» с полями: ФИО, должность, email, телефон, зарплата, возраст.
Сделайте так, чтобы конструктор класса заполнял эти поля при создании объекта.
Внутри класса «Сотрудник» напишите метод, который выводит информацию об объекте в консоль.
Создайте массив из пяти сотрудников. Например:
Person[] persArray = new Person[5];
// Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
// потом для каждой ячейки массива задаём объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
5. Используя цикл, выведите информацию только о сотрудниках старше 40 лет.
 */

public class Employee {
	private final String name;
	private final String position;
	private final String email;
	private final String phone;
	private final double salary;
	private final int age;
	
	Employee (String name, String position, String email, String phone, double salary, int age) {
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
	
	public int getAge() {
		return age;
	}
}
