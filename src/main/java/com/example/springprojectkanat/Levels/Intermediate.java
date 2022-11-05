package com.example.springprojectkanat.Levels;

//import Strategy.TestAndDefineLevel.Course;

public class Intermediate implements Course {
    private Intermediate() {
    }
    public static Intermediate getIntermediate(){
        return new Intermediate();
    }
    public String recommendCourse() {
        return "The recommended level of English is \"Intermediate\".";
    }
}
