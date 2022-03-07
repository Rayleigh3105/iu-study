package main.tasks.collection;

import main.model.Kunde;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stacks {

    private static Deque<String> historie = new ArrayDeque<>();


    public static void main(String[] args) {

        hinzufuegen("1");
        hinzufuegen("2");
        hinzufuegen("3");

        zurueck();

        System.out.println(historie);

    }

    private static void hinzufuegen(String o) {
        historie.addFirst(o);
    }

    private static void zurueck() {
        String letzterSchritt = historie.peekFirst();

        if (letzterSchritt != null) {
            historie.removeFirst();
        }
    }
}
