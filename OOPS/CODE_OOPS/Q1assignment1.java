// 1. Single, multilevel and hierarchical inheritance

public class Q1assignment1 {

    static class Animal {
        void eat() {
            System.out.println("Animal is eating...");
        }
    }

    // Single inheritance: Dog extends Animal
    static class Dog extends Animal {
        @Override
        void eat() {
            System.out.println("Dog is eating...");
        }

        void bark() {
            System.out.println("Dog is barking...");
        }
    }

    // Multilevel inheritance: Puppy extends Dog extends Animal
    static class Puppy extends Dog {
        void weep() {
            System.out.println("Puppy is weeping...");
        }
    }

    // Hierarchical inheritance: Dog and Cat both extend Animal
    static class Cat extends Animal {
        void meow() {
            System.out.println("Cat is meowing...");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Multilevel Inheritance ---");
        Puppy p = new Puppy();
        p.eat();    // Dog's overridden version
        p.bark();   // Dog method
        p.weep();   // Puppy method

        System.out.println("\n--- Hierarchical Inheritance ---");
        Cat c = new Cat();
        c.eat();    // Animal's method
        c.meow();   // Cat method
    }
}