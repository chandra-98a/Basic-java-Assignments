package question2;


public class Labour extends Employee {
	double overTime;
	Labour(){
		super();
		overTime=0;
	}
	
    public Labour(String n,double sal,double ince,double ot) {
		super(n,sal);
		overTime=ot;
	}

	double getSalary() {
    		return (super.getSalary()+overTime);
    	}

}
