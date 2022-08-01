package hw_1;
/*
1. Создайте класс «Сотрудник» с полями: ФИО, должность, email, телефон, зарплата, возраст.
2. Сделайте так, чтобы конструктор класса заполнял эти поля при создании объекта.
3. Внутри класса «Сотрудник» напишите метод, который выводит информацию об объекте в консоль.
4. Создайте массив из пяти сотрудников. Например:
Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаём объект
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);
5. Используя цикл, выведите информацию только о сотрудниках старше 40 лет.
 */
public class Main {
	
	public static void main(String[] args) {
		Employee[] employeesTable = new Employee[5];
		employeesTable[0] = new Employee("Ivanov Ivan Ivanovich", "Director", "ivanov@mail.com", "11111111111", 6000, 62);
		employeesTable[1] = new Employee("Petrov Petr Petrovich", "Driver", "petrov@mail.com", "22222222222", 3200, 18);
		employeesTable[2] = new Employee("Sidorov Sidor Sidorovich", "Accountant", "sidorov@mail.com", "33333333333", 3300, 42);
		employeesTable[3] = new Employee("Ivanova Ivanka Ivanovna", "Economist", "ivanov@mail.com", "44444444444", 4400, 31);
		employeesTable[4] = new Employee("Petrova Elena Semenovna", "Lawyer", "petrova@mail.com", "55555555555", 5500, 56);
		
		for (Employee employee : employeesTable) {
			if (employee.getAge() > 40) employee.printInfo();
		}
	}
}
