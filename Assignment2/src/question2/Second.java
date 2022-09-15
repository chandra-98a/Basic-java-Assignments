package question2;
import question2.Employee;
import question2.Labour;
import question2.Manager;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e=new Employee("Raghu",60000);
System.out.println("salary of employee="+e.getSalary());
Manager m=new Manager("Nikhil",20000,500);
System.out.println("salary of Manager="+m.getSalary());
Labour l=new Labour("Bhim",30000,400,8);
System.out.println("salary of Labour="+l.getSalary());
	}

}
