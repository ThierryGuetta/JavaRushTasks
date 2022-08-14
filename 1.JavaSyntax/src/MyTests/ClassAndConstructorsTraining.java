package MyTests;

public class ClassAndConstructorsTraining {
    public static void main(String[] args) {
        Person student = new Person();
        student.name = "Andrey";
        student.age = 24;
        student.hobby = "programming";
        student.work = "manager";
        student.experience = 6;
        student.personBio();
        student.personBio(student.hobby);
        student.personBio(student.work, student.experience);

    }
}
class Person {
    String name;
    int age;
    String hobby;
    String work;
    int experience;

    void personBio() {
        System.out.println("Student bio: " + name + " " + age + " y.o.");
    }

    void personBio(String hobby) {
        System.out.println(name + "'s" + " hobby is " + hobby);
    }

    void personBio(String work, int experience) {
        System.out.println(name + "'s" + " work is " + work);
        System.out.println(name + "'s" + " experience is " + experience + " years");
    }
}
