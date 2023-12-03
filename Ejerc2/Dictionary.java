package Ejerc2;

import java.util.ArrayList;
import java.util.List;

public class Dictionary <K, V>{
    List<Pair<K, V>> pairs;

    Dictionary() {
        pairs = new ArrayList<>();
    }

    void add(K key, V value) {
        pairs.add(new Pair<>(key, value));
    }

    boolean delete(K key) {
        return pairs.removeIf(pair -> pair.getKey().equals(key));
    }

    V getValue(K key) throws Exception {
        for (Pair<K, V> pair : pairs) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
        }
        throw new Exception("ObjectNoExist");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Pair<K, V> pair : pairs) {
            sb.append(pair.getKey()).append(": ").append(pair.getValue()).append("\n");
        }
        return sb.toString();
    }
}
