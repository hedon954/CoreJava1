package chapter5;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] people = new Person[2];
		
		people[0] = new Employee("Hedon",50000,1999,4,7);
		people[1] = new Student("Hedon","Software engineering");
		
		for(Person p:people)
		{
			System.out.print(p.getDescription());
		}
	}
}
