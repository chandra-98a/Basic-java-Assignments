package question3;

public class Account {
private String name;
protected double balance;
Account(){
	name=null;
	balance=0;
}
public Account(String name, double balance) {

	this.name = name;
	this.balance = balance;
}
double totalCash(double bal) {
	this.balance=bal;
	return balance;
}
 
}
