package question4;


import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the marks of physics");
        int physics=scan.nextInt();
        System.out.println("enter the marks of chemistry");
        int chemistry=scan.nextInt();
        System.out.println("enter the marks of Biology");
        int maths=scan.nextInt();

if((physics&chemistry&maths)>60) {
	System.out.println("student is passed");
}else if(((physics&chemistry)|(chemistry&maths)|(maths&physics))>=60) {
System.out.println("student is promoted");
	}else {
		System.out.println("student is failed");
	}
   
		
	}

}
