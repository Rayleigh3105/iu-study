package main.tasks.collection;

import java.util.*;
import java.util.Map.Entry;

/**
 * Wichtige Regeln Maps
 * - Ein Schlüssel ist eindeutig, das heißt er ist entweder gar nicht oder maximal einmal in einer Map vorhanden.
 * - Zu einem Schlüssel existiert nur genau ein Wert.
 * - Wenn ein Paar aus Schlüssel und Wert in einer Map gespeichert werden soll, in den der Schlüssel bereits existiert,
 * so wird der dazugehörige Wert einfach überschrieben
 */
public class Maps {

    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();

        // Hinzufügen
        map.put(1, "Moritz");
        map.put(2, "Kevin");
        map.put(3, "Felix");

        //  Prüfen ob der Wert enthalten ist.
        if (map.containsValue("Moritz")) {
            System.out.println("Beinhaltet Moritz");
        }

        // Daten holen
        Set<Integer> keySet = map.keySet();
        Collection<String> keyValues = map.values();

        // Über eine Map iterieren
        for (Entry entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

    }
}
