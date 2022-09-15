package question9;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of students");
        int stud=sc.nextInt();
        System.out.println("enter the number of subjects");
        int sub =sc.nextInt();
        System.out.println("enter the marks scored by students for subject A");
        int A =sc.nextInt();
        System.out.println("enter the marks scored by students for subject B");
        int B =sc.nextInt();
        System.out.println("enter the marks scored by students for subject C");
        int C=sc.nextInt();
        double total=A+B+C;
        System.out.println("total marks="+total);
        double avg=(A+B+C)/3;
        System.out.println("average:"+avg);
        
	}

}
