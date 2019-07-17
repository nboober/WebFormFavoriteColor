package com.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Data {

    @NotNull
    @Size(min=1)
    private String name;

    @NotNull
    @Size(min = 5)
    private String quest;

//    @NotNull
    private String color;

//    @NotNull
    private String speed;

    private int number;

    public int getNumber() {
        number = (int)(Math.ceil(Math.random()*2));
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
