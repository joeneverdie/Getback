package basic.collection.queue;


import basic.collection.model.Student;

import javax.management.QueryEval;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
    public static void main(String[] args) {
        Queue<Student> students = new PriorityQueue<>();

        students.add(new Student(6, "Joe Nguyen", "male", 25));
        students.add(new Student(7, "Jane Nguyen", "female", 25));
        students.add(new Student(8, "David Scott", "male", 25));
        students.add(new Student(9, "Helen Tran", "female", 25));
        students.add(new Student(10, "Son Nguyen", "male", 25));

        System.out.println("head: " + students.element());
        System.out.println("head: " + students.peek());

        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            itr.next().display();
        }

        // remove the last element
        students.remove();
//        students.poll();

        System.out.println("after removing elements");
        Iterator<Student> itr2= students.iterator();
        while (itr2.hasNext()) itr2.next().display();

        Queue<String> queue = new PriorityQueue<>();

        queue.add("joe");
        queue.add("jane");
        queue.add("alex");
        queue.add("clover");

//        queue.remove();
//        queue.poll();
        Iterator<String> itr3 = queue.iterator();
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }
    }
}
