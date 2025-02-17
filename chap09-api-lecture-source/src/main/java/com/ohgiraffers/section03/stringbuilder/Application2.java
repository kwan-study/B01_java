package com.ohgiraffers.section03.stringbuilder;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. StringBuilder의 자주 사용되는 메소드의 용법 및 원리를 이해할 수 있다. */
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());

        /* 설명. StringBuilder는 가변객체(mutable object)로, 내부적으로 용량이 증가하는 방식 취함 */
        for (int i = 0; i < 50; i++) {
            sb.append(i);

            /* 설명. 용량을 초과할 것 같으면 (*2 + 2)만큼 증가(주소값 변동 x) */
            System.out.println("sb = " + sb);
            System.out.println("capacity = " + sb.capacity());
            System.out.println("identityHashCode = " + System.identityHashCode(sb));
        }

//        StringBuilder sb2 = new StringBuilder("javamariaDB");
        StringBuffer sb2 = new StringBuffer("javamariaDB");
        System.out.println(sb2.capacity());     // 문자열 크기(11byte) + 16Byte

        /* 필기.
         *  delete() : 시작 인덱스와 종료 인덱스를 이용해서 문자열에서 원하는 부분의 문자열을 제거
         *  deleteCharAt() : 문자열 인덱스를 이용해서 문자 하나를 제거
        * */
        System.out.println(sb2.delete(2, 5));
        System.out.println(sb2.deleteCharAt(0));

        /* 필기.
         *  insert(): 인자로 전달된 값을 문자열로 변환 후 지정한 인덱스 위치에 추가한다.
         *
        * */
        System.out.println("insert() = " + sb2.insert(1, "vao"));
        System.out.println("insert() = " + sb2.insert(0, "j"));
        System.out.println("insert() = " + sb2.insert(sb2.length(), "jdbc"));


    }
}
