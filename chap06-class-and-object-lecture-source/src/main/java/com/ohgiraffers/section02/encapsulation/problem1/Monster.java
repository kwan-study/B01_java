package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {
    String name;
    int hp;

    public void setHp(int hp) {
        if(hp > 0) {
            this.hp = hp;       // this는 이 method를 호출한 객체를 의미
        } else if(hp <= 0){
            this.hp = 0;
        }
    }
}
