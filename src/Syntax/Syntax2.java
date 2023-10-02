package Syntax;
public class Syntax2 {
    public static void main(String[] args) {
        System.out.println("Please, type Your name and age");
        Human human1 = new Human("Andrii", 17);
        Human human2 = human1;
        Human human3 = human2;
        human3.age = 4;

        human1.printInfo();
        human2.printInfo();
        human3.printInfo();

        System.out.println("Please, type animal type and age");
        Animal animal1 = new Animal("Dog", 5);

        animal1.printInfo(animal1);

        Animal animal2 = new Animal("Cat", 11);
        animal2.printInfo(animal2);
    }
}