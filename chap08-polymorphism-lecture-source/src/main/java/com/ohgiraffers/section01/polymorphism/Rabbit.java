package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal {

    @Override
    public void eat() {
        System.out.println("토기가 풀을 뜯습니다.");
    }

    @Override
    public void run() {
        System.out.println("토끼가 달립니다. 깡총깡총");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 웁니다. 끼에에에엑");
    }

    public void jump() {
        System.out.println("토끼가 점프합니다. 포오올짝");
    }
}
