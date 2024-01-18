package java06_class.uml.manage;

import java.util.Scanner;

public class StudentService_v1 {

	private Student stu;
	private Scanner input;

	public StudentService_v1(Student stu, Scanner input) {
		this.stu = stu;
		this.input = input;
	}

	public void insertInfo() {
		System.out.print("이름 입력: ");
		String name = input.nextLine();
		stu.setName(name);

		System.out.print("나이 입력: ");
		int age = input.nextInt();
		stu.setAge(age);
	}

	public void insertScore() {
		System.out.print("국어 입력: ");
		int kor = input.nextInt();
		stu.setKor(kor);

		System.out.print("영어 입력: ");
		int eng = input.nextInt();
		stu.setEng(eng);

		System.out.print("수학 입력: ");
		int math = input.nextInt();
		stu.setMath(math);

	}

	public void calcSum() {
		int sum = stu.getKor() + stu.getEng() + stu.getMath();
		stu.setSum(sum);
		System.out.println("점수 합: " + sum);
	}

	public void calcAvg() {
		double avg = stu.getSum() / 3;
		stu.setAvg(avg);
		System.out.println("점수 평균: " + avg);
	}

	public void printStu() {
		System.out.println(
				"이름: " + stu.getName() + " 나이: " + stu.getAge() + " 점수 합: " + stu.getSum() + " 점수 평균: " + stu.getAvg());
	}

}
