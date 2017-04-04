import java.util.Scanner;

public class Student {
	String hak;
	int num;
	
	public static void main(String[] args) {
		Student a1 = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("학과 : ");
		a1.hak = sc.next();
		System.out.printf("학번 : ");
		a1.num = sc.nextInt();
		
		System.out.println("학과 : " + a1.hak);
		System.out.println("학번 : " + a1.num);
		
	}

}
