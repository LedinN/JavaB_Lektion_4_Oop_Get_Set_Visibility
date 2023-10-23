package com.nick.demo;

import com.nick.demo.visibility_Test.AccessModTest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AccessModTest accessModTest = new AccessModTest();
        Student benny = new Student(15,"Benny");
        Student frida = new Student(15,"Frida");
        Player player1 = new Player();

        List<Student> studentList = new ArrayList<>();

        studentList.add(benny);
        studentList.add(frida);

        studentList.get(0).getName();

        System.out.println(studentList.get(0).getName());
        studentList.get(1).test();

        studentList.add (new Student(25,"Anton")); // Anonymous Object alternative

        // System.out.println(benny.name);      // name is private!
        System.out.println(benny.getAge());     // getName() is public method containting private variable
        System.out.println(benny.getName());
        System.out.println(frida.getAge());
        System.out.println(frida.getName());

        benny.setName("Benny"); // We can now set a private variables value!
        //benny.name = "benny";   // Do NOT Call a private variable
        benny.setAge(benny.getAge() + 1);

        accessModTest.agePublic = 15;
        accessModTest.testPublic();
      //  accessModTest.testProtected();  Only on same package
      //  accessModTest.testNoModifier(); Only on same package


        //Question #1
        //TODO - GET / SET within the actual class

        player1.setScore(500);
        player1.addFivePoints();
        player1.addFivePoints();
        player1.addFivePoints();

        System.out.println(player1.getScore());



    }
}
