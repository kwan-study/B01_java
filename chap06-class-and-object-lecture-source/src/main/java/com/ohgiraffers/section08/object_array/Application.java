package com.ohgiraffers.section08.object_array;

public class Application {
    public static void main(String[] args) {

        Car[] carArr = new Car[6];
        carArr[0] = new Car("페라리", 300);
        carArr[1] = new Car("람보르기니", 510);
        carArr[2] = new Car("롤스로이스", 250);
        carArr[3] = new Car("부가티", 400);
        carArr[4] = new Car("포터", 500);
        carArr[5] = new Car();

        for (Car car : carArr) {
            car.driveMaxSpeed();
        }
    }
}
