package main.tasks.onlineshop;

import java.util.Scanner;

public class OnlineShop {

    private Historie historie = new Historie();
    private String[] schritte = new String[]{"Schritt 1", "Schritt 2", "Schritt 3", "Schritt 4"};

    public static void main(String[] args) {
        OnlineShop onlineShop = new OnlineShop();
        onlineShop.bestellprozess();
    }

    private void bestellprozess() {
        Scanner s = new Scanner(System.in);

        int prozessPosition = 0;
        int eingabe = -1;

        while (eingabe != 0) {
            System.out.println("Aktueller Schritt: " + schritte[prozessPosition]);
            System.out.println("Bitte wählen Sie (1=weiter zu '" + schritte[prozessPosition + 1] + "', 2=zurück, 0=beenden): ");
            eingabe = s.nextInt();

            switch (eingabe) {
                case 0:
                    System.out.println("Vielen Dank für Ihren Besuch!");
                    break;
                case 1:
                    prozessPosition++;
                    historie.hinzufuegen(schritte[prozessPosition]);

                    if (prozessPosition == schritte.length - 1) {
                        System.out.println("Vielen Dank für Ihren Einkauf!");
                        return;
                    }
                    break;
                case 2:
                    if (historie.zurueck() != null) {
                        prozessPosition--;
                        break;
                    }

            }
        }
    }
}
