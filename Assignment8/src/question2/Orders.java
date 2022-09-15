package question2;
interface Order{
	public boolean greater(int a,int b);
}
public class Orders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//orders of two
Order od1=(a,b)->(a>b);
if(od1.greater(20000,10000)) {
System.out.println("ACCEPTED");
}
System.out.println();
Order od2=(a,b)->(a>b);
if(od2.greater(30000,10000)) {
System.out.println("COMPLETED");
}


	}

}
