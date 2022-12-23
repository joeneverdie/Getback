package basic.collection.list;

import basic.collection.model.Student;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class TestStack {
    public static void main(String[] args) {
        Stack<Student> students = new Stack<>();
        students.push(new Student(11, "Joe Nguyen", "male", 25));
        students.push(new Student(12, "Jane Nguyen", "female", 25));
        students.push(new Student(13, "David Scott", "male", 25));
        students.push(new Student(14, "Helen Tran", "female", 25));
        students.push(new Student(15, "Son Nguyen", "male", 25));

        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            itr.next().display();
        }
    }
}
