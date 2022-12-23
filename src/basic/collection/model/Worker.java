package basic.collection.model;

public class Worker implements Comparable<Worker> {

    private int id;
    private String name;
    private int age;

    public Worker(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Worker worker) {
        if (this.age == worker.getAge()) return 0;
        else if (this.age > worker.getAge()) return 1;
        return -1;
    }

    public void display() {
        System.out.println(this.getId() + " "
                + this.getName() + " "
                + this.getAge());
    }
}
