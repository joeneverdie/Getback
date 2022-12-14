package basic;
//
//
//class Operation {
//    int data = 50;
//
//    int change(int data) {
//        data = data + 100;
//        return data;
//    }
//}
//
//public class TestCallValue {
//    public static void main(String[] args) {
//        Operation ope = new Operation();
//        System.out.println("before change data: " + ope.data);
//
//        System.out.println("new data at during change "  + ope.change(100));
//
//        System.out.println("after change data: " + ope.data);
//    }
//}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/** this is a example of javadoc tool*/
class Operation {
    int data = 50;

    int change(Operation op) {
        // changes will be in the instance variable
        this.data = op.data + 100;
        return this.data;
    }
}

class TestCallReference extends Object {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
//        Operation ope = new Operation();
//
//        System.out.println("before change data: " + ope.data);
//
//        System.out.println("new data at during change "  + ope.change(ope));
//
//        System.out.println("after change data: " + ope.data);

        String name = "Joe";
        String name2 = "JOE";
        String name3 = new String("Joe");
        name.concat("neverdie");
        boolean result = name.equalsIgnoreCase(name2);
        System.out.println(result);

        String fullName = "Joe";
        System.out.println(name.hashCode() + " " + fullName.hashCode());
        fullName = fullName + "neverdie" + true + 40 + 50.4;
        System.out.println(name.hashCode() + " " + fullName.hashCode());

        StringBuilder s1 = new StringBuilder("Hello");
        StringBuilder s2 = new StringBuilder("World");
        System.out.println(s1.append(s2));


        String s4 = new String("Hello");
        String s5 = new String("World");
        String s6 = String.format("%s%s", s4, s5);
        System.out.println(s6);

        // String.join() method
        String s7 = new String("Hello");
        String s8 = new String("World");
        String s9 = String.join(" ", s7, s8);
        System.out.println(s9);

        // StringJoiner class
        StringJoiner s = new StringJoiner(",");
        s.add("Hello");
        s.add("World");
        System.out.println(s);

        List<String> listStr = Arrays.asList("abc", "pqr", "xyz");
        String collect = listStr.stream().collect(Collectors.joining(","));
        System.out.println(collect);

        String greeting = "Hello World";

        String subGr1 = greeting.substring(3);
        System.out.println(subGr1);

        String subGr2 = greeting.substring(3, 7);
        System.out.println(subGr2);

        String text = new String("Hello, My name is Joe");
        // split the sentence by the delimiter passed as an argument
        String[] sentences = text.split(",");
        System.out.println();
        System.out.println(Arrays.toString(sentences));
    }
}