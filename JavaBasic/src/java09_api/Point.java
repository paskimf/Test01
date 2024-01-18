package java09_api;

import java.util.Objects;

public class Point implements Cloneable{

	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	} // alt + shift + s + s

//	@Override
//	public String toString() {
//		// return "변경";
//		// return super.toString();
//		return x + ", " + y;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this.x == ((Point) obj).x && this.y == ((Point) obj).y) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

// 기존 코드: 동일성 비교
// return super.equals(obj);

// p2.equals(p3);를 호출했을 경우
// -> 기준은 p2 객체
// -> p2 객체를 통해 메소드를 호출했다
// -> 전달인자는 p3 객체
// -> this == p2
// obj == p3

// hashCode, equals 자동 생성 단축키: alt + shift + s + h
