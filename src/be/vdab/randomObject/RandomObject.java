package be.vdab.randomObject;

public class RandomObject {
    public static void main(String[] args) {

        //create array with 25 indexes
        /**
         * Liefst arrays in java-stijl declareren:
         * int[] randomnumber = new int[25];
         */
        int randomNumber[] = new int[25];
        //fill every array with random number between 0 and 1000
        for (int i = 0; i < 25; i++) {
            /**
             * Reden voor gebruik van Math.ceil() onduidelijk en tevens overbodig.
             * Test het maar eens uit zonder ceil, werkt perfect.
             * Casten naar een (int) zal alles na de komma sowieso weggooien.
             */
            randomNumber[i] = (int) Math.ceil(Math.random() * 1000);
        }

        // pass through every index and first display number, than check if its below 250, 500, or higher and print PIEF, POEF or PAF
        for (int i = 0; i < 25; i++) {
            System.out.println(randomNumber[i]);
            if (randomNumber[i] < 250) {
                System.out.println("PIEF");
            } else if (randomNumber[i] < 500) {
                System.out.println("POEF");
            } else {
                System.out.println("PAF");
            }
        }
    }
}