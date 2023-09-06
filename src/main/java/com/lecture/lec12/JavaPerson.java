package com.lecture.lec12;

import com.lecture.lec10.JavaPenguin;

public class JavaPerson {
    private static final int MIN_AGE = 1;

    public static JavaPerson newBaby(String name) {
        return new JavaPerson(name, MIN_AGE);
    }

    private String name;
    private int age;

    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
