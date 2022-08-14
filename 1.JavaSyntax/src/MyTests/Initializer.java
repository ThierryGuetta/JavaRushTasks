package MyTests;

public class Initializer {
    public static void main(String[] args) {

        Personality student0 = new Personality();
        Personality student1 = new Personality("Tom");
        Personality student2 = new Personality("Bob", 20);
        student0.linkBio();
        student1.linkBio();
        student2.linkBio();

    }
}
class Personality {
    String name;
    int age;

    {
        name = "Andrey";
        age = 18;
    }

    Personality() {

    }

    Personality(String name) {
        this.name = name;
    }

    Personality(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void linkBio() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}