package basic.collection.model;

public class Student implements Comparable<Student> {

    private int id;

    private String fullName;

    private Gender gender;

    private int age;

    public Student(int id, String name, String gender, int age) {
        this.id = id;
        this.fullName = name;
        this.gender = checkGender(gender);
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender checkGender(String str) {
        if (str.equalsIgnoreCase("male")) {
            return Gender.MALE;
        }
        return Gender.FEMALE;
    }

    public void display() {
        System.out.println("ID " + this.id
                + " name " + this.fullName
                + " gender " + this.gender
                + " age " + this.age);
    }

    @Override
    public int compareTo(Student student) {
        if (this.id == student.getId()) return 0;
        else if (this.id > student.getId()) return 1;
        else return -1;
    }
}
