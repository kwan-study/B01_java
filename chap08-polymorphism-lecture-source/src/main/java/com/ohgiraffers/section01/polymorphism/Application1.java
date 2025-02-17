package com.ohgiraffers.section01.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        animal.run();
        animal.cry();

        System.out.println();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.run();
        tiger.cry();
        tiger.bite();

        System.out.println();

        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.run();
        rabbit.cry();
        rabbit.jump();


        /* 설명. 다형성 적용 (부모 타입으로 자식 인스턴스의 주소값 저장) */
        Animal an1 = new Animal();      // 다형성 X
        Animal an2 = new Tiger();       // 다형성 O
        Animal an3 = new Rabbit();      // 다형성 O

        /* 설명. Animal은 Tiger나 Rabbit이 아니다. */
//        Tiger t1 = new Animal();        // 다형성 X

        /* 설명. 동적바인딩 확인하기 */
        /* 필기.
         *  컴파일 당시에는 정적 바인딩을 통해 Animal의 cry()에 연결(해당 타입의 메소드와)
         *  런타임 시점에서야 객체가 생성되고, 실제 어떤 객체가 가진 오버라이딩 된 메소드 확인 후에 동적으로 바인딩 대상이 바뀜
         *  (동적 바인딩의 조건 : 1. 상속, 2. 오버라이딩)
        * */
        System.out.println("==== 동적 바인딩 확인 ====");
        an1.cry();
        an2.cry();
        an3.cry();

        /* 설명. 부모타입을 자식 타입으로 강제 형변환 하는 것은 가능하다.(조심해야 한다.) */
//        ((Tiger)an3).cry();     // 컴파일 시점에 에러가 발생하지 않고 런타임 시점에야 에러가 발생

        /* 설명. 오버라이딩 되지 않은(추가한 메소드) 메소드 호출은 다운캐스팅을 해 주어야 한다. */
        /* 필기.
         *  instanceof란?
         *   해당 객체의 타입을 런타임 시점에 확인하기 위한 연산자
        * */
        if(an3 instanceof Tiger){
            ((Tiger)an3).cry();
        }

        if (an3 instanceof Rabbit) {
            ((Rabbit)an3).jump();
            System.out.println("an3은 토끼지");
        }

        if(an3 instanceof Animal){
            System.out.println("Animal은 맞지");
        }

        /* 설명. 다형성은 상속관계의 객체들 간 형 변환 */
        Animal animal2 = new Tiger();       // 다형성을 적용, 자동형변환(auto up-casting), 묵시적 형변환
        Rabbit rabbit2 = (Rabbit)an3;       // 다형성이 적용되지 않음, 강제형변환(down-casting), 명시적 형변환

    }
}
