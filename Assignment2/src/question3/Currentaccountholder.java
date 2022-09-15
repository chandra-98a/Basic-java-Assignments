package question3;

public class Currentaccountholder extends Account {
	double cashCredit;
	
	
	Currentaccountholder(){
		super();
		cashCredit=0;
	}
	
    public Currentaccountholder(String n,double bal,double cc) {
		super(n,bal);
		cashCredit=cc;
	}

	
double totalCash(double cc) {
	this.cashCredit=cc;
	return cashCredit;
}

}
