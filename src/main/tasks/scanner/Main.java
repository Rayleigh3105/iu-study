package main.tasks.scanner;

import main.model.Kunde;

import java.util.Scanner;

/**
 * Erstelle eine Eingabemaske, mit drei Testfällen.
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bitte geben Sie eine Testfallnummer ein: ");

        // Holen der Eingabe
        int eingabe = s.nextInt();

        Kunde k = null;

        switch(eingabe) {
            case 1:
                k = new Kunde("Hebert");
                break;
            case 2:
                k = new Kunde("Toni");
                break;
            case 3:
                k = new Kunde("Helmut");
                break;

        }

        System.out.println(k);

    }

}