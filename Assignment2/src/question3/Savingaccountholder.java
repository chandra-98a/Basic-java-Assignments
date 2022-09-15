package question3;

public class Savingaccountholder extends Account{
double fixedDeposit;

Savingaccountholder(){
	super();
	fixedDeposit=0;
}

public Savingaccountholder(String n,double bal,double cc,double fd) {
	super(n,bal);
	fixedDeposit=fd;
}

double totalCash(double fd) {
	this.fixedDeposit=fd;
	return fixedDeposit;
}
}
