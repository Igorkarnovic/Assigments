package assignments14_OOP;

public class Person {
	
	/*Question-4
	Person class has following attributes:
	- private String instance variables: firstName, lastName
	- private int instance variable: age
	
	Methods:
	- getter and setter methods for each instance variable. try to use this. keyword
	- toString method.No parameters and Returns(does not print! no println in the method!) 
	person info in this format: "firstName | lastName | age"
	
	Constructors:
	
	1) No-Args constructor
	-sets default values for the Person object
	name and lastName => "undefined"
	age => -1
	
	2) 3-Args Constructor:
	- accepts firstName, lastName, age parameters and assigns values 
	to encapsulated instance variable
	try to use this. keyword
	
	Examples:
	
	Person person = new Person();
	
	System.out.println(person.getFirstName()); //"undefined"
	System.out.println(person.getLastName()); //"undefined"
	System.out.println(person.getAge()); // -1
	System.out.println(person.toString()); //"undefined | undefined | -1"
	
	person.setFirstName("John");
	person.setLastName("Doe");
	person.setAge(44);
	
	System.out.println(person.toString() ); // "John | Doe | 44"
	
	Person person = new Person("Fatima", "Lee", 22);
	
	System.out.println(person.getFirstName()); //"Fatima"
	System.out.println(person.getLastName()); //"Lee"
	System.out.println(person.getAge()); // 22
	System.out.println(person.toString()); //"Fatima | Lee | 22"
	*/

	private String FirstName;
	private String LastName;
	private int Age;
	
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		this.Age = age;
	}
	@Override
	public String toString() {
		return FirstName + "|" + LastName + "|" + Age;
	}
	
	public Person() {
		FirstName="Undifined";
		LastName="Undifined";
		Age=-1;
	}
	
	public Person(String FirstName, String LastName, int Age) {
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.Age=Age;
		
	}

	
	
}
