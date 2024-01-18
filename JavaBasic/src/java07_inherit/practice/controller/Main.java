package java07_inherit.practice.controller;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Point;
import java07_inherit.practice.model.Rectangle;

public class Main {
	
    public static void main(String[] args) {
    	
        // Circle 배열 초기화
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(1, 1, 5);
        circles[1] = new Circle(3, 2, 7);
        circles[2] = new Circle(0, 0, 3);

        // Rectangle 배열 초기화
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(1, 1, 4, 3);
        rectangles[1] = new Rectangle(2, 2, 6, 4);
        rectangles[2] = new Rectangle(0, 0, 5, 5);

        // 각각 draw() 출력 처리
        for (Circle circle : circles) {
            circle.draw();
            System.out.println("===============");
        }

        for (Rectangle rectangle : rectangles) {
            rectangle.draw();
            System.out.println("===============");
        }

        // Point 형 객체 배열 선언, 생성 : 5개
        Point[] points = new Point[5];

        // 각 index별로 Circle, Rectangle 객체 생성, 초기화함(임의대로)
        points[0] = new Circle(1, 1, 5);
        points[1] = new Circle(3, 2, 7);
        points[2] = new Circle(0, 0, 3);
        points[3] = new Rectangle(1, 1, 4, 3);
        points[4] = new Rectangle(2, 2, 6, 4);

        // for 문 사용 : draw() 메소드 실행함
        for (Point point : points) {
            point.draw();
            System.out.println("===============");
        }
    }
}
