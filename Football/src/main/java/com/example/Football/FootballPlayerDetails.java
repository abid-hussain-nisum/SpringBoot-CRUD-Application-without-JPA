package com.example.Football;

public class FootballPlayerDetails {
    int age;
    String name;
    String position;
    int jerseyNumber;

    public FootballPlayerDetails(int age, String name, String position, int jerseyNumber) {
        this.age = age;
        this.name = name;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public String toString() {
        return "FootballPlayerDetails{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                '}';
    }
}
