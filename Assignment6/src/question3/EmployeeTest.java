package question3;
import java.util.Set;
import java.util.TreeSet;
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Employee> empset=new TreeSet<Employee>(new Namecompare());
empset.add(new Employee(101,"abhi","accountancy",1000));
empset.add(new Employee(102,"dhanu","management",2000));
empset.add(new Employee(103,"keerty","economics",3000));
empset.add(new Employee(104,"latha","Maths",4000));
empset.add(new Employee(105,"manu","computer",5000));
empset.add(new Employee(106,"ashish","Business",6000));
empset.add(new Employee(107,"ajayy","ml",7000));
empset.add(new Employee(108,"ram","LInux",8000));
empset.add(new Employee(109,"bhir","Oragnization",9000));
empset.add(new Employee(110,"sunitha","windows",10000));

System.out.println("increasing order");
System.out.println(".........................");
//print
for(Employee emp:empset) {
	System.out.println(emp.getName()+":"+emp.getId()+":"+emp.getDepartment()+":"+emp.getSalary());
}


	}

}
