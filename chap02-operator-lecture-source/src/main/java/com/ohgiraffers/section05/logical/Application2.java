package com.ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 논리 연산자 활용하기 */
        /* 목차. 1. 1부터 100 사이 값 확인 */

        int num1 = 55;
        int num2 = 101;
        System.out.println((num1 >= 1) && (num1 <= 100));
        System.out.println((num2 >= 1) && (num2 <= 100));

        /* 목차. 2. 영어 대문자인지 확인 */
        char ch1 = 'G';
        char ch2 = 'g';

        System.out.println("A는 유니코드 번호 몇 번이지? " + (int)'A');
        System.out.println("Z는 유니코드 번호 몇 번이지? " + (int)'Z';
        System.out.println((int)ch1 >= 65 && (int)ch2 <= 90);
    }
}
