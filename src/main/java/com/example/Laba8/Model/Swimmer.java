package com.example.Laba8.Model;

import java.io.Serializable;

public class Swimmer implements Serializable {
    private String name;
    private String gender;
    private int age;
    private int distance;
    private String style;
    private int time;
    private int id;

    public Swimmer(int id, String name, String gender, int age, int distance, String style, int time) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.distance = distance;
        this.style = style;
        this.time = time;
        this.id = id;
    }
    public Swimmer(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Swimmer{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", distance=" + distance +
                ", style='" + style + '\'' +
                ", time=" + time +
                '}';
    }
}
