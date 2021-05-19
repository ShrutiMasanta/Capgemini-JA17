package polymorphism2;

public class Admin extends Payroll {
	
	private String name;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void doAdminStuff() {
		
		System.out.println("====Admin Stuff====");
	}
	
	public void adjustSalary(int salary)
	{
		System.out.println(getName()+"'s adjusted Salary is : "+salary);
	}

}
