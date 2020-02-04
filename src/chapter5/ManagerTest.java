package chapter5;

public class ManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager boss = new Manager("Hedon",80000,1999,4,7);
		boss.setBonus(5000);
		
		Employee[] staff = new Employee[3];
		staff[0] = boss;
		staff[1] = new Employee("hhh",22222,1990,2,2);
		staff[2] = new Employee("ada",2131,2013,3,2);
		
		for(Employee e:staff)
		{
			System.out.println("name = "+e.getName() + ",salary = "+e.getSalary());
		}
	}

}
