package question3;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private String department;
	private double Salary;
	
	public Employee(int id, String name, String department,int salary) {
		super();
		this.id=id;
		this.name=name;
		this.department=department;
		this.Salary=salary;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}
	public void display() {
		System.out.println("empid:"+getId()+"empname:"+getName()+"department:"+getDepartment()+"salary:"+getSalary());
	}
	public int compareTo(Employee emp) {
		if(this.name==emp.getName())
			return -1;
		else 
			return 1;
	}

	
	
	
}
