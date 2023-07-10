package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private boolean isMale;
    private double height;
    //in inches and feet
    private String hairColor;
    private String eyeColor;
    private boolean isMarried;

    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age, boolean isMale, double height, String hairColor, String eyeColor, boolean isMarried) {
        this.isMale = isMale;
        this.height = height;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
        this.isMarried = isMarried;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age =age;
    }

    public boolean getMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
