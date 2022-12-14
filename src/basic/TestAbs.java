package basic;

interface A {
}

interface B {
}

//interface Drawable extends A, B {
//    void draw();
//}

abstract class Shape implements Drawable {
    public void draw() {
        System.out.println("draw");
    }
}

//class Rectangle extends Shape {
//    public void draw() {
//        System.out.println("draw rectangle...");
//    }
//}

class Circle extends Shape {
    public void draw() {
        System.out.println("draw circle...");
    }
}

class Triangle extends Shape {
    public void draw() {
        System.out.println("draw triangle...");
    }
}

interface Printable {
    void print();
}

interface Showable extends Printable {
    @Override
    void print();

    void show();
}

interface Drawable {
    void draw();

    default void def() {
        System.out.println("this is default method");
    }

    static int cube(int n) { return n*n*n; }
}

class Rectangle implements Drawable {

    @Override
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class Screen implements Showable {
    @Override
    public void print() {
        System.out.println("print in the screen");
    }

    @Override
    public void show() {
        System.out.println("show in the screen");
    }
}

class Action {
    protected void say() {System.out.println("hello");}
}
class Speak extends Action {
    public void say() {
        System.out.println("hi");
    }
}
class TestAbs {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.draw();

        System.out.println(Drawable.cube(5));
    }
}