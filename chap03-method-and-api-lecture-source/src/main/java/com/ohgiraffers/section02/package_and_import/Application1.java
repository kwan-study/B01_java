package com.ohgiraffers.section02.package_and_import;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 패키지에 대해 이해할 수 있다. */
        /* 설명. non-static 메소드 호출해 보기(feat.다른 패키지에 있는 */
        com.ohgiraffers.section01.method.Calculator cal
                = new com.ohgiraffers.section01.method.Calculator();

        int plusResult = cal.plusTwoNumbers(100, 20);
        System.out.println("100과 20의 합 = " + plusResult);

        /* 설명. static 메소드 호출해 보기(feat.다른 패키지에 있는) */
        int maxResult = com.ohgiraffers.section01.method.Calculator.maxNumbersOf(100, 20);
        System.out.println("두 수 중에 큰 수는 " + maxResult);
    }
}
