package java07_inherit.practice.product;


public class Computer extends Product {

	private String model;
	private int price;

	public Computer(String model, int price) {
		super(model, price);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void out() {
		System.out.println("Computer");
	}
}
