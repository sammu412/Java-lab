import java.lang.*;
class Animal {
    public void sound() {
        System.out.println("Some generic sound");
    }
}
class Dog extends Animal {
  //  @Override
    public void sound() {
        System.out.println("Bark");
    }
}
class Cat extends Animal {
   // @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Animal();
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}