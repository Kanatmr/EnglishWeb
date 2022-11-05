package com.example.springprojectkanat.Levels;

//import Strategy.TestAndDefineLevel.Course;

public class Beginner implements Course {
    private Beginner() {
    }
    public static Beginner getBeginner(){
        return new Beginner();
    }

    public String recommendCourse() {

        return "The recommended level of English is Beginner";
    }
}
