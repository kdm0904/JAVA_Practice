package org.day9.constructor;

class Employee {
	private String name;
	private int salary;
	int age;
	
	
	public Employee(String n, int a, int s) {
		name = n;
		age = a;
		salary = s;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}

	public int getAge() {
		return age;
	}
	public void print() {
		System.out.println("ÀÌ¸§ : " + name+" ¿¬ºÀ : " +salary+" ³ªÀÌ : "+age);
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee e;
		e = new Employee("È«±æµ¿", 0, 3000);
		//e.salary = 300;
		e.age = 26;
		int sa = e.getSalary();
		String s = e.getName();
		int a = e.getAge();
		e.print();
	}

}
