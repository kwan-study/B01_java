package com.ohgiraffers.section01.array;

import java.util.ArrayList;
import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. 배열에 초기화 되는 자료형별 기본 값을 이해할 수 있다. */
        /* 필기.
        *   값의 형태별 기본값
        *   정수 : 0
        *   실수 : 0.0
        *   논리 : false
        *   문자 : \u0000
        *   참조 : null
       * */

        int[] iArr = new int[5];
        System.out.println(Arrays.toString(iArr));
        boolean[] bArr = new boolean[6];
        System.out.println(Arrays.toString(bArr));

        /* 설명. 크기 할당 및 초기화를 한 번에 하고 싶을 때 */
        int[] iArr2 = {10, 11, 12, 13, 14};
        int[] iArr3 = new int[]{10, 11, 12, 13, 14};

        /* 설명. new int[]을 빼고 배열 생성이 안되는 경우 */
//        test({10, 11, 12, 13, 14});
//        test(new int[]{10, 11, 12, 13, 14});

        String[] sArr = {"apple", "banana", "grape", "orange"};

        /* 설명. 단순 for 문 사용 */
        for (int i = 0; i < sArr.length; i++){
            System.out.println(sArr[i]);
        }

        /* 설명. Arrays.toString() 사용 */
        System.out.println(Arrays.toString(sArr));

        /* 설명. for-each문 사용 (향상된 for문) */
        for (String str:sArr){
            System.out.println(str);
        }
    }

    public static void test(int[] arr) {

    }
}
