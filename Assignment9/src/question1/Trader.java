package question1;

public class Trader {
	private String name;
	private String city;
public Trader(String n, String c) {
		// TODO Auto-generated constructor stub
	this.name=n;
	this.city=c;
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String toString() {
	return "Trader:"+this.name+","+this.city;
}
}
