package com.example.springprojectkanat.Levels;

//import Strategy.TestAndDefineLevel.Course;

public class UpperIntermediate implements Course {
    private UpperIntermediate() {
    }
    public static UpperIntermediate getUpperIntermediate(){
        return new UpperIntermediate();
    }
    public String recommendCourse() {
        return "The recommended level of English is \"Upper-Intermediate\".";
    }
}
