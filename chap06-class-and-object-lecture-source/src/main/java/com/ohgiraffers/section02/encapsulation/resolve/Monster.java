package com.ohgiraffers.section02.encapsulation.resolve;

public class Monster {

    /* 설명. 정보은닉(Information Hiding)
    *   1. 데이터 은닉
    *   2. 메소드 은닉
    *   3. 모듈화
   * */
    private String name;
    private int hp;

    public void setInfo1(String info1) {
        this.name = info1;
    }

    public void setInfo2(int info2) {
        this.hp = info2;
    }

}
