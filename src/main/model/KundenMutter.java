package main.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class KundenMutter {


    public static Set<Kunde> kundenListe() {

        Kunde k1 = new Kunde("Mari");
        Kunde k2 = new Kunde("Moritz");
        Kunde k3 = new Kunde("Jan");

        Set<Kunde> kunden = new HashSet<>();
        kunden.add(k1);
        kunden.add(k2);
        kunden.add(k3);

        return kunden;

    }
}
