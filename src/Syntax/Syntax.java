package Syntax;
class Human {
public String name;
public int age;
Human (String name, int age) {
    this.name = name;
    this.age = age;
}
    public void printInfo() {
        System.out.println(getInfo());
    }

    public String getInfo() {
        return name + " " + age;
    }
}

class Animal {
    public String type;
    public int age;

    Animal(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public void printInfo(Animal animal) {
        System.out.println("Animal type: " + animal.type);
        System.out.println("Animal age: " + animal.age);
    }
}