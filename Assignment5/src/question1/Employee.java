package question1;
import java.util.HashSet;
import java.util.Set;

public class Employee {

    private int empId;
    private String empName;
    private String dept;
    private int salary;

    public Employee(int empId, String empName,int salary,String dept) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.salary=salary;
        this.dept=dept;
    }

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName +",empSalary=" + salary +",empdept=" + dept+ "]";
    }

    @Override
    public int hashCode() {
        return this.empId;
    }

    public boolean displyDetails(Object obj) {
        Employee employee = (Employee) obj;
        if (employee.empId == this.empId) {
            employee.setEmpName(this.empName);
            employee.setSalary(this.salary);
            employee.setDept(this.dept);
            return true;
        } else {
            return false;
        }
        
    }

    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(1, "Raj",10000,"account"));
        employees.add(new Employee(2, "Pradeep",20000,"computer"));
        employees.add(new Employee(3, "Kumar",30000,"machine learning"));
        employees.add(new Employee(4, "Chandan",5000,"maths"));
        employees.add(new Employee(5, "Amitava",8000,"engish"));
        employees.add(new Employee(6, "ramu",9000,"science"));

        System.out.println(employees);
    }
}
