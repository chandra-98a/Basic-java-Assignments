package question1;

public class Transaction {
private int year;
private int value;
private Trader trader;
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
public Trader getTrader() {
	return trader;
}
public void setTrader(Trader trader) {
	this.trader = trader;
}
public Transaction(Trader trader,int year,int value) {
	
	this.year = year;
	this.value = value;
	this.trader = trader;
}
public String toString() {
	return "{"+this.trader+","+"year:"+this.year+","+"value:"+this.value+"}";
}

}
