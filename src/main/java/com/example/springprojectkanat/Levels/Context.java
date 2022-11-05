package com.example.springprojectkanat.Levels;

public class Context {
    int x;

    public Context(int x) {
        this.x = x;
    }

    public Course contextGiveRecommend() {

        if (x <= 100){
            if (x >= 0 && x <= 20){
                return Beginner.getBeginner();
            }
            if (x > 20 && x <=40) {
                return Elementary.getElementary();
            }
            if (x > 40 && x <= 60) {
                return PreIntermediate.getPreIntermediate();
            }
            if(x > 60 && x <= 80) {
                return Intermediate.getIntermediate();
            }
            if(x > 80 && x <= 100) {
                return Advanced.getAdvanced();
            }
        }
        return Advanced.getAdvanced();
    }
}
