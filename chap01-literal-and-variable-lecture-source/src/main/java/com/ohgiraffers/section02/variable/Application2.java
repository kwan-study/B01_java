package com.ohgiraffers.section02.variable;

public class Application2 {

    public static void main(String[] args) {

        /* 수업목표. 변수를 선언하고 값을 할당하여 사용할 수 있다.(feat. 자료형(type)) */

        /* 필기. 1. 정수를 취급하는 자료형 */
        byte bNum;              // 1byte
        short sNum;             // 2byte
        int iNum;               // 4byte
        long lNum;              // 8byte

        /* 필기. 2. 실수를 취급하는 자료형 */
        float fNum;             // 4byte
        double dNum;            // 8byte

        /* 필기. 3. 문자를 취급하는 자료형 */
        char ch;              // 2byte

        /* 필기. 4. 논리값을 취급하는 자료형 */
        boolean isTrue;         // 1byte

        /* 설명. 총 8개, primitive 자료형 (원시 자료형) */

        /* 필기. 5. 문자열을 취급하는 자료형(참조 자료형) */
        String str;             // 4byte

        /* 설명. 변수에 값 대입해 보기(자료형별 초기화) */
        bNum = 1;               // -127 ~ 127
        sNum = 3;
        iNum = 4;
        lNum = 2200000000L;     // long에 대입되는 값은 L을 붙이자.(꼭 붙여야 할 경우가 있다.)

        fNum = 3.14f;           // double로 인식되는 실수를 float에 담을 때는 f를 붙이자.
        dNum = -3.14;

        ch = 'a';               // == ch = 97; (양수만 가능)

        isTrue = true;

        /* 설명. 변수를 활용한 합계(sum), 평균(avg) 출력 */
        int kor = 90;
        int math = 80;
        int eng = 75;

        int sum = kor + math + eng;
//          soutv
        System.out.println("sum = " + sum);

//      System.out.println(sum / 3.0);
        double avg = sum / 3.0;                 // 나눗셈은 일반적으로 실수 결과가 나오며 나눌 때
                                                // 항 중에 하나 이상은 실수형이어야 한다.
        System.out.println("avg = " + avg);


    }
}
