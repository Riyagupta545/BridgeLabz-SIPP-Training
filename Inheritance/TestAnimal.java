package Inheritance;
class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println("Bird says: Tweet!");
    }
}


public class TestAnimal {
    public static void main(String[] args) {
        Animal a1 = new Dog("Tommy", 5);
        Animal a2 = new Cat("Kitty", 3);
        Animal a3 = new Bird("Tweety", 2);

        a1.makeSound(); // Dog sound
        a2.makeSound(); // Cat sound
        a3.makeSound(); // Bird sound
    }
}

