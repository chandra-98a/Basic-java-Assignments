package question2;


public class Manager extends Employee{
	double incentive;
	Manager(){
		super();
		incentive=0;
	}
	
    public Manager(String n,double sal,double ince) {
		super(n,sal);
		incentive=ince;
	}

	double getSalary() {
    		return (super.getSalary()+incentive);
    	}
}
