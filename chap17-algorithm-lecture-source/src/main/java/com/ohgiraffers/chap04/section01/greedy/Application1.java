package com.ohgiraffers.chap04.section01.greedy;

public class Application1 {
    public static int solution(int n){

        /* 설명. 3kg, 5kg 봉지로 가져갈 수 있는 최소 봉지 수 */
        int count = 0;

        while(true) {
            if (n % 5 == 0) {           // 처음부터 5kg 봉지 또는 3kg 덜어내며 5kg
                                        // 나눌 수 있는 경우
                return n / 5 + count;
            } else if (n < 0) {         // 3kg 또는 5kg 봉지로 해결이 안되는 경우
                return -1;
//            } else if (n == 0) {        // 3kg 봉지로만 해결이 되는 경우
//                return count;           // 첫 조건에 이미 포함되어 있음
            }

            /* 설명. 어쩔 수 없이 3kg 한 봉지만큼 무게를 덜어낸다. */
            n = n - 3;
            count++;
        }
    }
}
