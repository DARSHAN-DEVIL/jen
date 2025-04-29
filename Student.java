
public class Student {

    String name;
    int age;
    int Id;
    String birth;

    public Student(String name, int age, int Id, String birth) {
        this.name = name;
        this.age = age;
        this.Id = Id;
        this.birth = birth;
    }

    void display() {
        System.out.println("Student ID: " + Id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Birth: " + birth);
        System.out.println("===================================");

    }

    public static void main(String[] args) {
        Student s1 = new Student("Yaseen", 20, 1, "2003-01-01");
        Student s2 = new Student("Madan", 22, 2, "2001-02-02");
        s1.display();
        s2.display();
    }
}
