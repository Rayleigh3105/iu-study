package main.tasks.instanceMethods;

import main.model.Kunde;

public class Main {

    public static void main(String [] args){
        System.out.println("Aufgabe 1:");
        System.out.println("toString()");
        Kunde k = new Kunde();
        k.setId(1);
        k.setKundenNummer(123);
        k.setVorname("Moritz");
        System.out.println(k);

        System.out.println("equals()");
        Kunde k1 = new Kunde();
        k1.setKundenNummer(123);
        System.out.println(k.equals(k1));

        System.out.println("hashCode()");
        System.out.println("HashCode Kunde 1: " + k.hashCode());
        System.out.println("HashCode Kunde 2: " + k1.hashCode());

        System.out.println("compareTo()");
        Kunde k2 = new Kunde();
        k2.setKundenNummer(124);
        System.out.println(k1.compareTo(k2));

        System.out.println("clone()");
        Kunde k3 = k2.clone();
        System.out.println(k2);
        System.out.println(k3);

    }
}
