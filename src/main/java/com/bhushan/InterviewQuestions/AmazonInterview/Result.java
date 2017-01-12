package com.bhushan.InterviewQuestions.AmazonInterview;

/**
 * Created by bhushan on 1/7/17.
 */
public class Result {
    private int id;
    private int marks;

    public Result(int id, int marks) {
        this.id = id;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
