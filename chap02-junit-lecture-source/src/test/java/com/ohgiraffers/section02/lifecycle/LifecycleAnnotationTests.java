package com.ohgiraffers.section02.lifecycle;

import org.junit.jupiter.api.*;

public class LifecycleAnnotationTests {

    /* 수업목표. 테스트 메소드의 실행 전 후에 동작하는 어노테이션읏 사용할 수 있다. */

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before Each");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After Each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }
}
