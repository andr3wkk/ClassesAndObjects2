package Syntax;

import Main.Main2;

public class Syntax2 {
    public static void main(String[] args) {
//1
        System.out.println("Please, type Your name and age");
        Human human1 = new Human("Andrii", 17);
        Human human2 = human1;
        Human human3 = human1;

///
        System.out.println("Default objects:");
        System.out.println("human1: "); human1.printInfo();
        System.out.println("human2: "); human2.printInfo();
        System.out.println("human3: "); human3.printInfo();

        human1.setAge(17);

        System.out.println("Updated objects:");
        System.out.println("human1: "); human1.printInfo();
        System.out.println("human2: "); human2.printInfo();
        System.out.println("human3: "); human3.printInfo();
//2

        System.out.println("Please, type animal type and age");
        Animal animal1 = new Animal("Dog", 5);

        System.out.println("Default object info:");
        animal1.printInfo(animal1);

        modifyObject(animal1);
        System.out.println("Updated object info:");
        animal1.printInfo(animal1);
    }
    public static void modifyObject(Animal animal) {
        animal.changeAge(3);
    }
}