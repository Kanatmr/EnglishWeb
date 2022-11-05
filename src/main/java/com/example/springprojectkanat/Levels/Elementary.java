package com.example.springprojectkanat.Levels;

//import Strategy.TestAndDefineLevel.Course;

public class Elementary implements Course {

    private Elementary() {
    }
    public static Elementary getElementary(){
        return new Elementary();
    }
    public String recommendCourse() {
        return "The recommended level of English is \"Elementary\".";
    }
}
