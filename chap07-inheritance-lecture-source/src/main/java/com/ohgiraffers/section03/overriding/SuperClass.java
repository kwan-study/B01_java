package com.ohgiraffers.section03.overriding;

// public final class SuperClass => 상속 안되게 막을 수도 있음.
public class SuperClass {

    /* 수업목표. 오버라이딩(Overriding)에 대해 이해할 수 있다. */
    // 접근제어자 네 가지는 메소드, 생성자, 필드에서 모두 동일하게 사용
    public void method(int num) {
        System.out.println();
    }

    public Object method2(int num) {return null;}

    private void privateMethod() {}

    public final void finalMethod() {}      // 자식에게 물려주지 않는다.

    protected void protectedMethod() {}     // 다른 패키지더라도 상속 관계면 가능

    /* 설명. default 접근 제어자는 접근 제어자를 쓰지 않음 */
    void defaultMethod() {}                 // 다른 패키지에서 볼 수 없음
}
