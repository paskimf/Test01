package java07_inherit.practice.person;

import java07_inherit.practice.product.Product;

public class Person {

	private String name;
	private int money;
	private Product prod;

	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void buy(Product prod) {

		// 전달인자로 받은 Product를 멤버 필드에 저장하고
		this.prod = prod;

		if (this.money > prod.getPrice()) {
			System.out.println("잔액 부족");
			System.out.println("잔액: " + this.money + "원");
			return; // 메소드 중단
		}

		// 물건 가격만큼 money를 차감한다
		this.money -= prod.getPrice();

		System.out.println(this.name + "이/가 " + prod.getPrice() + "원을 지불하고 " + prod.getModel() + "을/를 구매함");
		System.out.println("잔액: " + this.money + "원");

	}

	public void out() {
		// TODO Auto-generated method stub

	}

}
