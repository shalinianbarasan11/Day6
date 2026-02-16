/*2. Create a program as  follows:

      Parent Class: Person who can walk,run,sit and has attributes height,weight
      Child Class: Student who has own method study and also can inherit the methods and properties from Person
     Print the results*/
class Person{
	int height;
	int weight;
	
	public void walk() {
		System.out.println("Person is walking");
	}
	public void run() {
		System.out.println("Person is running");
	}
	public void sit() {
		System.out.println("Person is sitting");
	}
}
class Student extends Person{
	public void study() {
		System.out.println("Student is studying");
	}

}
 public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student behave = new Student();
		
		behave.weight=62;
		behave.height=160;
		
		System.out.println("Height : "+ behave.height+ "cm");
		System.out.println("Weight : "+ behave.weight+ "kg");
		 
		
		behave.walk();
		behave.run();
		behave.sit();
		behave.study();
		
		
		  

	}

}
