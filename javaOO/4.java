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
	
	public Cylinder() {}
	
	public Cylinder(Circle circle, double height) {
		this.cir = circle;
		this.height = height;
	}

	public double getVolume() {
		return cir.getArea() * height;
	}
	
	public static void main(String[] args) {
		Cylinder cd= new Cylinder(new Circle(2.8), 5.6);
		
		System.out.println("원통의 부피 : " + cd.getVolume());

	}

}
