package com.example.springprojectkanat.Levels;

//import Strategy.TestAndDefineLevel.Course;

public class PreIntermediate implements Course {
    private PreIntermediate() {
    }
    public static PreIntermediate getPreIntermediate(){
        return new PreIntermediate();
    }
    public String recommendCourse() {
        return "The recommended level of English is \"Pre-Intermediate\".";
    }

}
