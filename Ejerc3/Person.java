package Ejerc3;

public class Person {
    String dni;
    String name;
    String phone;

    Person(String dni, String name, String phone) {
        this.dni = dni;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone;
    }
}
