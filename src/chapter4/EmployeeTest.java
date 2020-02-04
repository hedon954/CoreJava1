package chapter4;

import java.time.LocalDate;

public class EmployeeTest {
	public static void main(String args[])
	{
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Hedon",75000.0,2019,9,1);
		staff[1] = new Employee("Jhon",80000,2020,1,1);
		staff[2] = new Employee("Tom",300000,2020,1,1);
		
		for(Employee e:staff)
		{
			e.raiseSalary(5);
		}
		for(Employee e:staff)
		{
			System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireDay="+e.getHireDay());
		}
	}
}


class Employee
{
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String n,double s,int year,int month,int day)
	{
		name = n;
		salary = s;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary*byPercent/100;
		salary+=raise;
	}
}