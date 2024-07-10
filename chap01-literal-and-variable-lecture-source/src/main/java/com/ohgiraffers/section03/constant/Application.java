package com.ohgiraffers.section03.constant;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 상수에 대해 이해하고 사용할 수 있다. */
        final int AGE;

        AGE = 19;
//        AGE = 20;         => 이미 할당된 값이 있기 대문에 재설정 불가능.

        System.out.println("AGE = " + AGE);
        int myAge = AGE;
    }
}
