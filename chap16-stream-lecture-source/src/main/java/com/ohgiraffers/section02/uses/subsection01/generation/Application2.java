package com.ohgiraffers.section02.uses.subsection01.generation;

import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 기본 타입 스트림 생성에 대해 이해하고 활용할 수 있다. */
        /* 필기.
        *   range(시작값, 종료값): 시작값부터 1씩 증가하는 숫자로 종료값 직전(-1)까지 범위의 스트림 생성
        *   rangeClosed(시작값, 종료값): 시작값부터 1씩 증가하는 숫자로 종료값까지 포함된 스트림 생성
       * */
        IntStream intStream = IntStream.range(5, 10);
        intStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        LongStream longStream = LongStream.rangeClosed(5, 10);
        longStream.forEach(value -> System.out.print(value + " "));
        System.out.println();

        /* 필기.
         *  Wrapper 클래스 자료형의 스트림이 필요한 경우 boxing도 가능하다.
         *  double(갯수): 난수를 활용한 DoubleStream을 갯수만큼 생성하여 반환.
         *  boxed(): 기본 타입 스트림인 XXXStream을 박싱하여 wrapper 타입의 Stream<XXX>로 변환
        * */

        Stream<Double> doubleStream = new Random().doubles(5).boxed();
        doubleStream.forEach(value -> System.out.print(value + " "));

        /* 설명. 문자열을 split하여 stream으로 작성 */
        Stream<String> splitStream =
                Pattern.compile(", ").splitAsStream("html, css, javascript");
        splitStream.forEach(System.out::println);


    }
}
