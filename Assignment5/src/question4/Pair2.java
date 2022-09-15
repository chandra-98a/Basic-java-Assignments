package question4;
import java.util.Date;
public class Pair2<K, Date> {
	private K key;
	private Date date;
	
	public Pair2(K key,Date date) {
		super();
		this.key=key;
		this.date=date;
	}
	
	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair2<String,String> pair2=new Pair2<String,String>("today is", "2022-09-08");
		System.out.println(pair2.getKey());
		System.out.println(pair2.getDate());

	}

}
