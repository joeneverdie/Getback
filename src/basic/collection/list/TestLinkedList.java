package basic.collection.list;

import basic.collection.model.Student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();

        students.add(new Student(6, "Joe Nguyen", "male", 25));
        students.add(new Student(7, "Jane Nguyen", "female", 25));
        students.add(new Student(8, "David Scott", "male", 25));
        students.add(new Student(9, "Helen Tran", "female", 25));
        students.add(new Student(10, "Son Nguyen", "male", 25));

        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            itr.next().display();
        }

        students.remove(2);
        System.out.println(students.size());

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            it.next().display();
        }
    }
}
