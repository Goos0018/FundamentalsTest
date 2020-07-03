package be.vdab.parameters;

import java.util.Scanner;

public class ParameterApp {
    public static void main(String[] args) {

        // creating inputTool
        Scanner input = new Scanner(System.in);

        // asking for input from user
        System.out.println("type a word or sentence.");
        String arg = input.nextLine();

        // methods to check for amount of vowels, if input is palindrome, and if input is URL
        StringParameters.isVowel(arg);
        StringParameters.isPalindrome(arg);
        StringParameters.isURL(arg);
    }
}
