package Ejerc1;

import java.util.ArrayList;
import java.util.List;

public class Bag <T>{
    List<T> items;

    Bag() {
        items = new ArrayList<>();
    }

    void add(T item) {
        items.add(item);
    }
}
