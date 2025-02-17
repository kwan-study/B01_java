package com.ohgiraffers.section01.polymorphism;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 다형성을 적용하여 객체 배열을 만들어 다양한 인스턴스들을 연속 처리할 수 있다. */
        Animal[] animals = new Animal[5];
        animals[0] = new Rabbit();
        animals[1] = new Tiger();
        animals[2] = new Rabbit();
        animals[3] = new Tiger();
        animals[4] = new Rabbit();

        /* 설명. 캡슐화를 통해 필드 은닉을 했다면, 다형성을 통해 타입 은닉을 할 수 있다. */
//        for (int i = 0; i < animals.length; i++) {
//            animals[i].cry();
//        }

        for (Animal animal : animals) {
            animal.cry();

            /* 설명. 오버라이딩 되지 않은 메소드는 추가 처리가 필요 */
            if(animal instanceof Tiger) {
                ((Tiger)animal).bite();
            }
            if (animal instanceof Rabbit) {
                ((Rabbit)animal).jump();
            }
        }

    }
}
