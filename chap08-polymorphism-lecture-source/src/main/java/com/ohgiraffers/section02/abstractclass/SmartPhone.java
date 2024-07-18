package com.ohgiraffers.section02.abstractclass;

public class SmartPhone extends Product{

    public SmartPhone() {
        super();
    }

    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스로부터 물려받은 abstractMethod를 오버라이딩한 메소드 호출됨...");
    }

    public void printSmartPhone() {
        System.out.println("SmartPhone 클래스의 printSmartPhone 메소드 호출함...");
    }
}
