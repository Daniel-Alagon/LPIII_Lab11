package Act3;

public class App {
    public static void main(String[] args) {
        try {
            Bag<Integer> integerBag = new Bag<>(10);
            integerBag.add(1);
            integerBag.add(2);
            integerBag.add(3);
            System.out.println("Bolsa de enteros: " + integerBag.toString());

            Bag<String> stringBag = new Bag<>(10);
            stringBag.add("Hola");
            stringBag.add("Mundo");
            System.out.println("Bolsa de cadenas: " + stringBag.toString());

            Bag<Persona> personaBag = new Bag<>(10);
            personaBag.add(new Persona("Juan", 25));
            personaBag.add(new Persona("Ana", 30));
            System.out.println("Bolsa de personas: " + personaBag.toString());

        } catch (IsFull e) {
            e.printStackTrace();
        }
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}
