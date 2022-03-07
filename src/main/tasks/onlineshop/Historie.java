package main.tasks.onlineshop;

import java.util.ArrayDeque;
import java.util.Deque;

public class Historie {

    private Deque<String> historie = new ArrayDeque<>();

    public void hinzufuegen(String o) {
        historie.addFirst(o);
    }

    public String zurueck() {
        String letzterSchritt = historie.peekFirst();

        if (letzterSchritt != null) {
            historie.removeFirst();
        }
        return letzterSchritt;
    }
}
