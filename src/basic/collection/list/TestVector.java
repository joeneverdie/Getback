package basic.collection.list;

import basic.collection.model.Student;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {

        List<Student> students = new Vector<>();
        students.add(new Student(11, "Joe Nguyen", "male", 25));
        students.add(new Student(12, "Jane Nguyen", "female", 25));
        students.add(new Student(13, "David Scott", "male", 25));
        students.add(new Student(14, "Helen Tran", "female", 25));
        students.add(new Student(15, "Son Nguyen", "male", 25));

        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            itr.next().display();
        }
    }
}
