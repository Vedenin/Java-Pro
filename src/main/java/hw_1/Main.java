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
public class Main {
	
	public static void main(String[] args) {
		Employee[] employeesTable = new Employee[5];
		employeesTable[0] = new Employee("Ivanov Ivan Ivanovich", "Director", "ivanov@mail.me", "0301233333", 60000, 62);
		employeesTable[1] = new Employee("Petrov Petr Petrovich", "Driver", "petrov@mail.me", "0301231212", 15000, 19);
		employeesTable[2] = new Employee("Sidorov Sidor Sidorovich", "Accountant", "sidorov@mail.me", "301231323", 30000, 42);
		employeesTable[3] = new Employee("Ivanova Ivanka Ivanovna", "Economist", "ivanov@mail.me", "301232313", 35000, 21);
		employeesTable[4] = new Employee("Petrova Elena Semenovna", "Lawyer", "petrova@mail.me", "301230023", 55000, 46);
		
		for (Employee employee : employeesTable) {
			if (employee.getAge() > 40) employee.printInfo();
		}
	}
}
