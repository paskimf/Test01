package java05_array;

import java.util.Scanner;

public class Array_Quiz01_v3 {

    public static void main(String[] args) {
        // 상수 선언
        final int floor = 5; // 건물의 층수
        final int fee = 12000; // 인당 관리비

        // 필요한 변수 선언
        Scanner sc = new Scanner(System.in);

        // 각 층의 인원 + 총 인원 배열
        int[] person = new int[floor + 1];

        // 각 층의 관리비 + 총 관리비 배열
        int[] pay = new int[floor + 1];

        // 1 ~ 5층 인원 입력
        for (int i = 0; i < floor; i++) {
            System.out.print((i + 1) + "층의 인원: ");
            person[i] = sc.nextInt();
            person[floor] += person[i]; // 총 인원 계산
        }

        // 관리비 계산
        for (int i = 0; i < floor; i++) {
            pay[i] = person[i] * fee; // 각 층의 관리비 계산
            pay[floor] += pay[i]; // 총 관리비 계산
        }

        System.out.println("각 층의 관리비\n");

        // 출력
        for (int i = 0; i < floor; i++) {
            System.out.println((i + 1) + "층 관리비: " + pay[i] + "원");
        }

        System.out.println();
        System.out.println("총 인원은 " + person[floor] + "명");
        System.out.println("총 금액은 " + pay[floor] + "원");

        sc.close();
        
    }
}
