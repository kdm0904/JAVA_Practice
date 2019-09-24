package org.day9.constructor;

class Person {
	private String lastName;
	private String firstName;
	
	String getLastName() {
		return lastName;
	}
	
	String getFirstName() {
		return firstName;
	}
	
	public Person(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	public String buildName() {
		return String.format("%s %s\n", this.getLastName(),this.getFirstName());
	}
	
}
public class PersonTest {

	public static void main(String[] args) {
		
		Person person = new Person("ȫ", "�浿");
		System.out.println(person.buildName());
	}

}
