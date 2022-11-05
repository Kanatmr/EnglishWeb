package com.example.springprojectkanat.Levels;

//import Strategy.TestAndDefineLevel.Course;

public class Advanced implements Course {
    private Advanced() {
    }
    public static Advanced getAdvanced(){
        return new Advanced();
    }

    public String recommendCourse() {

        return "The recommended level of English is Advanced";
    }
}
