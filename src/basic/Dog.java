package basic;
class Animal {
    void eat() { System.out.println("eating"); }
}

class Dog extends Animal {
    @Override
    void eat() { System.out.println("eating fruits"); }
}

class BabyDog extends Dog {}

class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal baby = new BabyDog();

        animal.eat();
        dog.eat();
        baby.eat();
    }
}

class Vehicle {
    final int speedLimit = 100;
    static int speed = 50;

    void run() {
        speed = 30;
        System.out.println(speed);
    }

    final void start() {
        System.out.println("Engine is starting...");
    }
}

class Bike extends Vehicle {
    int speedLimit = 90;

    void run() {
        speed = 10;
        System.out.println(speed);
    }
}

class Honda extends Bike {
    int speedLimit = 150;
}


//class Test {
//    public static void main(String[] args) {
////        Shape s;
////        s = new Rectangle();
////        s.draw();
////
////        s = new Circle();
////        s.draw();
////
////        s = new Triangle();
////        s.draw();
//
//        Bike bike = new Honda();
//        System.out.println(bike.speedLimit);
//    }
//}