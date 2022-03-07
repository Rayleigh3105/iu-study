package main.tasks.collection;

import main.model.Kunde;

import java.util.*;

public class List {
    private static java.util.List<Kunde> kundeList = new ArrayList<>();

    public static void main(String[] args) {
        kundeList.add(new Kunde("Hans"));
        kundeList.add(new Kunde("Moin"));

        loescheKunde(kundeList);
        kundehinzufuegen(new Kunde("Moritz"));
    }

    private static void kundehinzufuegen(Kunde kunde) {
        kundeList.add(kunde);
        System.out.println("Kunde hinzugefügt" + kunde.getVorname());
    }


    private static void loescheKunde(Collection<Kunde> kunden) {
        Iterator<Kunde> iterator = kunden.iterator();

        while (iterator.hasNext()) {

            Kunde k = iterator.next();
            if (k.getVorname().contains("Hans")) {
                System.out.println("Lösche Kunde: " + k.getVorname());
                iterator.remove();
            }
        }
        System.out.println(kunden);
    }
}
