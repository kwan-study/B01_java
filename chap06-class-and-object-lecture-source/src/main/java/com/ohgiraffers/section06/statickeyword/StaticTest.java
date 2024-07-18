package com.ohgiraffers.section06.statickeyword;

public class StaticTest {

    /* 설명. static 필드에는 static 메소드로 접근해야함 */

    private int nonStaticCount;
    private static int staticCount;

    public StaticTest() {
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public static int getStaticCount() {
        return staticCount;
    }

    public void increaseNonStaticCount() {
        this.nonStaticCount++;
    }

    public static void increaseStaticCount() {
        staticCount++;
    }

}
