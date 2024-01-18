package java06_class.uml.manage;

import java.util.Scanner;

public class StudentEx {

    public static void main(String[] args) {
    	
    	Student stu = new Student();
        Scanner input = new Scanner(System.in);

        StudentService_v1 ss = new StudentService_v1(stu, input);

        ss.insertInfo(); // 이름과 나이 입력
        ss.insertScore(); // 국영수 점수 입력
        ss.calcSum(); // 점수 합계 계산
        ss.calcAvg(); // 평균 계산
        ss.printStu(); // 학생 정보 출력

        input.close();
    }
}
