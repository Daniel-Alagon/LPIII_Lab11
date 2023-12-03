package Ejerc1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CandyBags extends Bag<Goodie>{
    @Override
    void add(Goodie goodie) {
        if (!items.contains(goodie)) {
            items.add(goodie);
        }
    }

    Goodie cheapest() {
        return items.stream().min(Comparator.comparing(Goodie::getPrice)).orElse(null);
    }

    List<Goodie> mostExpensive(int n) {
        return items.stream()
                .sorted(Comparator.comparing(Goodie::getPrice).reversed())
                .limit(n)
                .collect(Collectors.toList());
    }
}
