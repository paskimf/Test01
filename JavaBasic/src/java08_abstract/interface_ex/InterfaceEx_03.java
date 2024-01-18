package java08_abstract.interface_ex;

interface InterA {
	public abstract void getA();
}

interface InterB {
	public abstract void getB();
}

interface InterC extends InterA, InterB {
	public abstract void getC();
}

class Children implements InterC {

	@Override
	public void getA() {

	}

	@Override
	public void getB() {

	}

	@Override
	public void getC() {

	}
}

public interface InterfaceEx_03 {

}

// 클래스가 클래스를 상속받을 때 extends
// 인터페이스가 인터페이스를 상속받을 때 extends
// 클래스가 인터페이스를 상속받을 때 implements
