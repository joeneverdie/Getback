package basic.collection;

import basic.collection.model.Student;
import basic.collection.model.Worker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class IdComparator implements Comparator<Student> {

    @Override
    public int compare(Student student, Student t1) {
        if (student.getId() == t1.getId()) return 0;
        else if (student.getId() > t1.getId()) return 1;
        return -1;
    }
}

class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student student, Student t1) {
        return student.getFullName().compareTo(t1.getFullName());
    }
}

class WorkerNameComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker worker, Worker t1) {
        return worker.getName().compareTo(t1.getName());
    }
}

class WorkerAgeComparator implements Comparator<Worker> {
    @Override
    public int compare(Worker worker, Worker t1) {
        if (worker.getAge() == t1.getAge()) return 0;
        else if (worker.getAge() > t1.getAge()) return 1;
        return -1;
    }
}

public class TestComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Joe", "male", 20));
        students.add(new Student(3, "Jane", "female", 20));
        students.add(new Student(2, null, "female", 20));
        students.add(new Student(5, "John", "male", 20));
        students.add(new Student(4, null, "male", 20));

//        System.out.println("Sorting by id");
//        Collections.sort(students, new IdComparator());
//        for (Student st: students) st.display();

//        System.out.println("Sorting by name");
//        Collections.sort(students, new NameComparator());
//        for (Student st: students) st.display();

        // sorting by name
//        Comparator<Student> cmp1 = Comparator.comparing(Student::getFullName);
//        Collections.sort(students, cmp1);
//        for (Student st : students) st.display();

        // sorting by name but null first
        Comparator<Student> cmp1 = Comparator.comparing(Student::getFullName,
                Comparator.nullsFirst(String::compareTo));
        Collections.sort(students, cmp1);
        for (Student st : students) st.display();

        System.out.println();
        System.out.println();

        // sorting by name but null first
        Comparator<Student> cmp2 = Comparator.comparing(Student::getFullName,
                Comparator.nullsLast(String::compareTo));
        Collections.sort(students, cmp2);
        for (Student st : students) st.display();

        // sorting by id
//        Comparator<Student> cmp2 = Comparator.comparing(Student::getId);
//        Collections.sort(students, cmp2);
//        for (Student st: students) st.display();

        List<Worker> workers = new ArrayList<>();

        workers.add(new Worker(1, "joe", 19));
        workers.add(new Worker(2, "jane", 18));
        workers.add(new Worker(3, "ran", 30));
        workers.add(new Worker(4, "david", 23));
        workers.add(new Worker(5, "chloe", 22));
        workers.add(new Worker(6, "elena", 27));
        workers.add(new Worker(7, "brian", 19));

        System.out.println("Sort by name");
        Collections.sort(workers, new WorkerNameComparator());
        for (Worker wk : workers) wk.display();

        System.out.println("Sort by age");
        Collections.sort(workers, new WorkerAgeComparator());
        for (Worker wk : workers) wk.display();
    }
}
