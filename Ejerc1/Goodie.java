package Ejerc1;

public class Goodie {
    String name;
    double price;

    Goodie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    String getName() {
        return name;
    }
}
