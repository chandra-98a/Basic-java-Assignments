package question4;


public class Pair<K, V> {
	private K key;
	private V value;
	
	public Pair(K key,V value){
		super();
		this.key=key;
		this.value=value;
	}
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public static void main(String[] args) {
		Pair<String,String> pair=new Pair<String,String>("1","Hello");
		
		System.out.println(pair.getKey());
		System.out.println(pair.getValue());
		

	}
	

}
