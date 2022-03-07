package main.tasks.collection;

import main.model.Kunde;
import main.model.KundenMutter;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Erstelle eine
 * - Teilmenge
 * - Differenzmenge
 * - Schnittmenge
 * - Vereinigungsmenge
 */
public class SetTask {

    public static void main(String[] args) {
        Set<Kunde> kundenSet = KundenMutter.kundenListe();
        Set<Kunde> kundenSet1 = new HashSet<>(kundenSet);
        kundenSet1.add(new Kunde("Kevin"));
        // Teilmenge
        teilmenge(kundenSet, kundenSet1);
        // Schnittmenge
        kundenSet = KundenMutter.kundenListe();
        kundenSet1 = new HashSet<>(kundenSet);
        kundenSet1.add(new Kunde("Kevin"));
        schnittmenge(kundenSet, kundenSet1);
        // Differenzmenge
        kundenSet = KundenMutter.kundenListe();
        kundenSet1 = new HashSet<>(kundenSet);
        kundenSet1.add(new Kunde("Kevin"));
        differenzmenge(kundenSet, kundenSet1);
        // Vereinigungsmenge
        kundenSet = KundenMutter.kundenListe();
        kundenSet1 = new HashSet<>(kundenSet);
        kundenSet1.add(new Kunde("Kevin"));
        vereinigungsmenge(kundenSet, kundenSet1);

    }

    private static void teilmenge(Set<Kunde> k1, Set<Kunde> k2) {
        System.out.println(k2.containsAll(k1));
    }

    private static Set<Kunde> schnittmenge(Set<Kunde> k1, Set<Kunde> k2) {
        k2.retainAll(k1);
        System.out.println(k2);
        return k2;
    }

    private static Set<Kunde> differenzmenge(Set<Kunde> k1, Set<Kunde> k2) {
        k2.removeAll(k1);
        System.out.println(k2);
        return k2;
    }

    private static void vereinigungsmenge(Set<Kunde> k1, Set<Kunde> k2) {
        k1.addAll(k2);
        System.out.println(k2);
    }


}
