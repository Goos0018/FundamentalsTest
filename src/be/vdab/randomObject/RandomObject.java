package be.vdab.randomObject;

public class RandomObject {
    public static void main(String[] args) {

        int randomNumber[] = new int[25];
        for (int i = 0; i < 25; i++) {
            randomNumber[i] = (int) Math.ceil(Math.random() * 1000);
        }

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