package java07_inherit.practice.model;

public class Circle extends Point {

	private int radius;
//	double pi = 3.14;
//	double area = pi * radius * radius;
//	double round = 2 * pi * radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		
		double pi = 3.14;
		double area = pi * radius * radius;
		double round = 2 * pi * radius;

		System.out.println("원의 면적: " + area);
		System.out.println("원의 둘레: " + round);
	}

}
