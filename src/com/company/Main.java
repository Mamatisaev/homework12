package com.company;

public class Main {

    public static void main(String[] args) {

        Fish fish = new Fish();

        fish.setKind("Sea animal");
        fish.setName("Nemo");
        fish.setPrice(57);
        fish.setAge(2);
        fish.setEats("Bread Peaces");
        fish.setColor("Blue");

        Parrot parrot = new Parrot();

        parrot.setKind("Bird");
        parrot.setName("Popka");
        parrot.setPrice(85);
        parrot.setAge(5);
        parrot.setEats("Seed");
        parrot.setColor("Green");

        Cat cat = new Cat();

        cat.setKind("Domestic animal");
        cat.setName("Garfield");
        cat.setPrice(94);
        cat.setAge(4);
        cat.setEats("Cheese");
        cat.setColor("White");

        Dog dog = new Dog();

        dog.setKind("Domestic animal");
        dog.setName("Layka");
        dog.setPrice(77);
        dog.setAge(2);
        dog.setEats("Bond");
        dog.setColor("Black");

        System.out.println("--- Animals ---");
        System.out.println("\n* FISH *\n-Classification: " + fish.getKind() + "\n-Name: " + fish.getName() + "\n-Price: " + fish.getPrice() +
                "\n-Age: " + fish.getAge() + "\n-Eats: " + fish.getEats() + "\n-Color: " + fish.getColor());
        System.out.println("\n* PARROT *\n-Classification: " + parrot.getKind() + "\n-Name: " + parrot.getName() + "\n-Price: " + parrot.getPrice() +
                "\n-Age: " + parrot.getAge() + "\n-Eats: " + parrot.getEats() + "\n-Color: " + parrot.getColor());
        System.out.println("\n* CAT *\n-Classification: " + cat.getKind() + "\n-Name: " + cat.getName() + "\n-Price: " + cat.getPrice() +
                "\n-Age: " + cat.getAge() + "\n-Eats: " + cat.getEats() + "\n-Color: " + cat.getColor());
        System.out.println("\n* DOG *\n-Classification: " + dog.getKind() + "\n-Name: " + dog.getName() + "\n-Price: " + dog.getPrice() +
                "\n-Age: " + dog.getAge() + "\n-Eats: " + dog.getEats() + "\n-Color: " + dog.getColor());
    }
}
