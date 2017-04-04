class Circle {
	public double radius;
	public static double PI = 3.141592;
	
	//생성자 구현
	public Circle(double radius) {
		this.radius = radius;
	}
	//현재 반지름을 사용하여 원의 면적을 구하는 메소드
	public double getArea() {
		return radius * radius * PI;
	}
}

public class Cylinder {
	Circle cir;
	double height;
	
	public double getVolume() {
		return cir.getArea * height;
	}
	
	public static void main(String[] args) {
		Cylinder a1 = new Cylinder();
		
		a1.cir = new Circle(2.8);
		a1.height = 5.6;
		System.out.println("원통의 부피 : " + (a1.getVolume() * a1.height));

	}

}
