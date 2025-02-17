package com.ohgiraffers.section02.dimensional;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 다차원 배열의 구조를 이해하고 사용할 수 있다. */
        /* 필기.
        *   다차원 배열
        *     다차원 배열은 2차원 이상의 배열을 의미한다.
        *     (일반적으로는 사람의 인지 범위에 맞게 최대 3차원 정도를 고려한다.
       *  */

        int[][] iArr1;

        //추천 x
        int[] iArr2[];
        int iArr[][];

        iArr1 = new int[3][2];      // 정변 배열을 위한 선언(관리하는 1차원 배열의 길이가 동일)
        iArr2 = new int[3][];       // 가변 배열을 위한 선언(관리하는 1차원 배열의 길이가 다를 시)
//        iArr3 = new int[[][]      // 컴파일 에러

        int num = 0;
        for (int i = 0; i < iArr1.length; i++){          // 1차원 배열을 고르는 for 문
//            System.out.println("iArr1[i]: " + iArr1[i]); // 관리되는 1차원 배열의 주소값
            for (int j = 0; j < iArr1[i].length; j++){   // 선택한 1차원 배열을 다루는 for 문
                iArr1[i][j] = num++;
                System.out.print(iArr1[i][j] + "\t");
            }
//            System.out.println(Arrays.toString(iArr1[i]));
        }

        /* 설명. Arrays.toString()은 1차원 배열만 확인 가능하다. */
//        System.out.println("2차원 배열도 한 번에 확인 될까? " + Arrays.toString(iArr1));

    }
}
