package question2;

public class Employee {
	String name;
	double salary;
	Employee(){
		name=null;
		salary=0;
	}
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	double getSalary() {
		return salary;
	}
	


}
