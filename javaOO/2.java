import java.util.Scanner;

public class Student {
	private String hak;
	private int num;
	
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getHak() {
		return this.hak;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return this.num;
	}
	
	public static void main(String[] args) {
		Student a1 = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("학과 : ");
		String inputHak = sc.next();
		a1.setHak(inputHak);
		System.out.printf("학번 : ");
		int inputNum = sc.nextInt();
		a1.setNum(inputNum);
		
		System.out.println("학과 : " + a1.getHak());
		System.out.println("학번 : " + a1.getNum());
		
	}
}
