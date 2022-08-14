package MyTests;


public class ClassAndConstructorsTraining2 {
    public static void main(String[] args) {
        Persona student0 = new Persona();
        Persona student1 = new Persona("Ivan");
        Persona student2 = new Persona("Petya", 26);
        student0.bioView();
        student1.bioView();
        student2.bioView();

    }
}
class Persona {
    String name;
    int age;

    Persona() {
        name = "Andrey";
        age = 24;
    }

    Persona(String a) {
        name = a;
        age = 25;
    }

    Persona(String a, int b) {
        name = a;
        age = b;
    }

    void bioView() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}