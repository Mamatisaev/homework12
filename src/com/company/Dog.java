package com.company;

public class Dog {

    private String kind;
    private String name;
    private int price;
    private int age;
    private String eats;
    private String color;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        if (kind.isEmpty()) {
            System.out.println("You left it blank.");
        } else {
            this.kind = kind;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("You left it blank.");
        } else {
            this.name = name;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price cannot be a negative number.");
        } else {
            this.price = price;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be a negative number.");
        } else {
            this.age = age;
        }
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        if (eats.isEmpty()) {
            System.out.println("You left it blank.");
        } else {
            this.eats = eats;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("You left it blank.");
        } else {
            this.color = color;
        }
    }
}
