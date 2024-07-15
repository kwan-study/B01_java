package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. java.util.Scanner 를 이용한 다양한 자료형 값 입력 받기 */
        Scanner sc = new Scanner(System.in);

        /* 목차. 1. 문자열 입력 받기 */
        System.out.print("이름을 입력하세요: ");
        String lastName = sc.next();                // "유 관순"을 입력했다면 "유"
        String firstName = sc.next();               // "유 관순"을 입력했다면 "관순" buffer에 남아있던 값
        System.out.println("name = " + lastName + ", " + firstName);

        /* 설명. nextLine()이 아닌 Scanner 메소드를 활용하다 nextLine()을 쓰게되면 고려할 것 */
        sc.nextLine(); // 버퍼에 남아있는 개행 처리용 구문(엔터 제거)

        /* 설명. nextLine()은 공백 또는 개행 문자까지 취급해 버퍼에서 모두 가져옴 */
        System.out.print("이름을 입력하세요2: ");
        String name2 = sc.nextLine();
        System.out.println("name2 = " + name2);

        /* 목차. 2. 정수형 입력 받기 */
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();
        System.out.println("age = " + age);

        /* 목차. 3. 실수형 입력 받기 */
        System.out.print("키를 입력하세요: ");
        double height = sc.nextDouble();
        System.out.println("height = " + height);

        /* 목차. 4. 논리형 입력 받기 */
        System.out.print("참과 거짓 중 한가지를 true 또는 false로 입력하세요: ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("isTrue = " + isTrue);

        /* 목차. 5. 문자형 입력 받기 */
        System.out.print("아무 문자나 하나만 입력하세요: ");
        char answer = sc.next().charAt(0);              // 메소드 체이닝
        System.out.println("입력하신 문자는 " + answer + "입니다.");
    }
}
