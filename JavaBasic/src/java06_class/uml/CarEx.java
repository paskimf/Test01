package java06_class.uml;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car("아반떼", "흰색");
		car.display();
		
		System.out.println("===============");
		
		car.setModel("쏘나타");
		car.setColor("검정");
		
		System.out.println(car.getModel());
		System.out.println(car.getColor());
		
		car.display();
	}

}
