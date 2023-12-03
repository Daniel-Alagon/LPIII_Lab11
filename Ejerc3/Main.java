package Ejerc3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Contacts contacts = new Contacts();
        Scanner scanner = new Scanner(System.in);
        String option;

        do {
            System.out.println("1. Add contact");
            System.out.println("2. Delete contact");
            System.out.println("3. Get contact");
            System.out.println("4. Show all contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextLine();

            switch (option) {
                case "1":
                    System.out.print("Enter DNI: ");
                    String dni = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone: ");
                    String phone = scanner.nextLine();
                    contacts.addContact(dni, name, phone);
                    break;
                case "2":
                    System.out.print("Enter DNI: ");
                    dni = scanner.nextLine();
                    if (contacts.deleteContact(dni)) {
                        System.out.println("Contact deleted successfully");
                    } else {
                        System.out.println("Contact not found");
                    }
                    break;
                case "3":
                    System.out.print("Enter DNI: ");
                    dni = scanner.nextLine();
                    try {
                        Person contact = contacts.getContact(dni);
                        System.out.println(contact);
                    } catch (Exception e) {
                        System.out.println("Contact not found");
                    }
                    break;
                case "4":
                    System.out.println(contacts);
                    break;
            }
        } while (!option.equals("5"));
    }
}
