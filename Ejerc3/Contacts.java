package Ejerc3;

public class Contacts {
    Dictionary<String, Person> contacts;

    Contacts() {
        contacts = new Dictionary<>();
    }

    void addContact(String dni, String name, String phone) {
        contacts.add(dni, new Person(dni, name, phone));
    }

    boolean deleteContact(String dni) {
        return contacts.delete(dni);
    }

    Person getContact(String dni) throws Exception {
        return contacts.getValue(dni);
    }

    @Override
    public String toString() {
        return contacts.toString();
    }
}
