package com.example.work;

public class Students {

    String name;
    String group;
    Integer age;
    Integer score;

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    public Students(String name, String group, int age) {
        this.name = name;
        this.group = group;
        this.age = age;
        this.score = 0;
    }
}
