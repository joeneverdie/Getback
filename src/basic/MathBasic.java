package basic;

public class MathBasic {

    int addition(int a, int b) {
        return a + b;
    }

    float addition(float a, float b) {
        return a + b;
    }

    double addition(double a, double b) {
        return a + b;
    }


}

//class TestMath {
//    public static void main(String[] args) {
//        MathBasic math = new MathBasic();
//
//        System.out.println(math.addition(5, 6));
//        System.out.println(math.addition(3f, 2f));
//        System.out.println(math.addition(3d, 6d));
//    }
//}

//class TestOverload {
//    public static void main(String[] args) { System.out.println("main with String[]"); }
//
//    public static void main(String args) { System.out.println("main with String"); }
//
//    public static void main() { System.out.println("main without args"); }
//}

class Math {
    void sum(int a, long b) {
        System.out.println("first method ivoked");
    }

    void sum(long a, int b) {
        System.out.println("second method invoked");
    }
}

class TestBasic {
    public static void main(String[] args) {
        Math math = new Math();
//        math.sum(20, 20); // now method has arguments have type int gets invoked
    }
}