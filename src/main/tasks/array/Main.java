package main.tasks.array;

import main.model.Kunde;

public class Main {

    public static void main(String[] args) {
        Kunde[] kunde = new Kunde[]{new Kunde("Hans"), new Kunde("Peter")};

        // Drucke Kapazität
        System.out.println(kunde.length);

        // Drucke erstes Element eines Arrays
        System.out.println(kunde[0]);

        // Mehrdimensional
        int[][] matrix = new int[][]{{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};

        System.out.println(matrix[0][1]);
    }
}
