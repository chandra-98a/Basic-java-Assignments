package question2;

public class Armstrong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


for(int num=100;num<=1000;num++) {
	int originalnumber,remainder=0,result=0;
	originalnumber=num;
	while(originalnumber>0) {
		remainder=originalnumber%10;
		result+=Math.pow(remainder, 3);
		originalnumber/=10;
	}
	if(num==result) {
		System.out.println(num + " is an armstrong number");
	}
	
		}
	}
	}

