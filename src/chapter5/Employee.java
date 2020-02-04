package chapter5;

import java.time.*;
import java.util.Objects;


public class Employee extends Person{
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String name,double salary,int year,int month,int day)
	{
		super(name);
		this.salary = salary;
		this.hireDay = LocalDate.of(year, month, day);
	}
	

	public double getSalary()
	{
		return salary;
	}
	public LocalDate getHireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary*byPercent/100;
		salary+=raise;
	}
	
	public String getDescription()
	{
		return String.format("an employee with a salary of $%.2f\n", salary);
	}
	
	
	public boolean equals(Object otherObject)
	{
		if(this == otherObject)
			return true;
		if(otherObject == null)
			return false;
		if(getClass()!=otherObject.getClass())
			return false;
		Employee other = (Employee)otherObject;
		return Objects.equals(this.getName(),other.getName())
				&& this.salary == other.salary
				&& Objects.equals(hireDay, other.hireDay);
	}
	
	public int hashCode()
	{
		return Objects.hash(this.getName(),salary,hireDay);
	}
	
	public String toString()
	{
		return this.getClass().getName() + "[name="+this.getName()+",salary="+salary+".hireDay="+hireDay+"]";
	}
}
