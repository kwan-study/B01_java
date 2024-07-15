package com.ohgiraffers.section03.abstraction;

public class Car {
    private boolean isOn = false;

    public void startUp() {
        if(this.isOn){
            System.out.println("시동이 이미 걸려있습니다.");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 부릉부릉");
        }
    }
}
