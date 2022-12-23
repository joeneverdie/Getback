package basic.collection;

import basic.collection.model.Student;
import basic.collection.model.Worker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestComparable {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Joe", "male", 20));
        students.add(new Student(3, "Jane", "female", 20));
        students.add(new Student(2, "Jan", "female", 20));
        students.add(new Student(5, "John", "male", 20));
        students.add(new Student(4, "David", "male", 20));

        Collections.sort(students);

        Iterator<Student> itr = students.iterator();
//        while (itr.hasNext()) itr.next().display();

        List<Worker> workers = new ArrayList<>();

        workers.add(new Worker(1, "joe", 19));
        workers.add(new Worker(2, "jane", 18));
        workers.add(new Worker(3, "ran", 30));
        workers.add(new Worker(4, "david", 23));
        workers.add(new Worker(5, "chloe", 22));
        workers.add(new Worker(6, "elena", 27));
        workers.add(new Worker(7, "brian", 19));

        Collections.sort(workers);
        for (Worker wk : workers) wk.display();
    }
}
