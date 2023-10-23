package com.nick.demo;



public class Student {
    private int age;
    private String name;

    public Student(){} // Empty constructor

    public Student(int age, String name) {
        setName(name);
        setAge(age);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void test() {
    }
}
