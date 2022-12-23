package basic.collection.list;

import basic.collection.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Joe Nguyen", "male", 25));
        students.add(new Student(2, "Jane Nguyen", "female", 25));
        students.add(new Student(3, "David Scott", "male", 25));
        students.add(new Student(5, "Helen Tran", "female", 25));
        students.add(new Student(4, "Son Nguyen", "male", 25));

        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            itr.next().display();
        }

        List newSt = new ArrayList(students);
        Iterator<Student> itr2 = newSt.iterator();
        while (itr2.hasNext()) {
            itr2.next().display();
        }
    }
}
