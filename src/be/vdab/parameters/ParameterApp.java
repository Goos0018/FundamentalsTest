package be.vdab.parameters;

import java.util.Scanner;

public class ParameterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("type a word or sentence.");
        String arg = input.nextLine();

        StringParameters.isVowel(arg);
        StringParameters.isPalindrome(arg);
        StringParameters.isURL(arg);
    }
}
