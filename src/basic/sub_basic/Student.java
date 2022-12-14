package basic.sub_basic;

public class Student {
    private int id;
    private String name;
    private String gender;

    Student(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + id;
        hash = 31 * hash + (name == null ? 0 : name.hashCode());
        hash = 31 * hash + (gender == null ? 0 : gender.hashCode());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Student)) return false;

        Student other = (Student) obj;
        boolean idEquals = this.id == other.id;
        boolean nameEquals = (this.name == null && other.name == null)
                || (this.name != null && this.name.equals(other.name));
        boolean genderEquals = (this.gender == null && other.gender == null)
                || (this.gender != null && this.gender.equals(other.gender));
        return (idEquals && nameEquals && genderEquals);
    }
}


class TestHashCode {
    public static void main(String[] args) {
        Student st1 = new Student(1, "Joe", "Male");
        Student st2 = new Student(1, "Joe", "Male");
        Student st3 = new Student(2, "Jen", "Female");
        Student st4 = new Student(3, "Alex", "Male");

        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
        System.out.println(st3.hashCode());
        System.out.println(st4.hashCode());

        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));
        System.out.println(st1.equals(st4));
        System.out.println(st3.equals(st4));
    }
}


