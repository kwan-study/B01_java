package com.ohgiraffers.section01.method;

public class Application3 {

    static int global = 10; // 전역변수이자 class 변수

    /* 수업목표. 메소드 전달인자(argument)와 매개변수(parameter)에 대해 이해하고 메소드 호출 시 활용 */

    public static void main(String[] args) {

    /* 필기.
     *  변수를 선언한 위치에 따라 구분할 수도 있다.
     *  1. 지역변수
     *  2. 전역변수
     *  3. 매개변수
    * */

        int local = 20; // 지역 변수
        System.out.println("local 출력: " + local);
        System.out.println("global 출력: " + global);

        /* 설명. testMethod에 나이를 주고 출력하기 */
        Application3 app3 = new Application3();
        app3.testMethod(13);
        app3.testMethod(19);
        app3.testMethod(15);
        app3.testMethod('a');
        app3.testMethod((int)12.34);
        app3.testMethod(3 * 6);
    }

    /* 설명. 정수형 나이를 주면 문자열을 출력해주는 기능이 있는 메소드 */
    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
