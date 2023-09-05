package com.lecture.lec03;

public class Lec03Main {
    public static void main(String[] args) {

    }
    public static void printAgeIfPerson(Object obj) {
        if(obj instanceof Person person) {
            System.out.println(person.getAge());
        }
    }
}
