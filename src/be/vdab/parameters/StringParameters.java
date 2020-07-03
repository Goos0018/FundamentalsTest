package be.vdab.parameters;

public class StringParameters {

    public static void isPalindrome(String string) {
        String newString = string.toLowerCase();
        String stringNoSpaces = newString.replaceAll(" ","");
        String reverse = "";
        int length = stringNoSpaces.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + stringNoSpaces.charAt(i);

        if (stringNoSpaces.equals(reverse)) {
            System.out.println(string + " is a palindrome");
        } else {
            System.out.println(string + " is not a palindrome");
        }
    }


    public static void isURL(String string) {
        int count = 0;
        String newString = string.toLowerCase();
        if (string.length() > 6)
            for (int i = 0; i < 7; i++) {
                char ch = newString.charAt(i);
                if (ch == 'h' || ch == 't' || ch == 'p' || ch == ':' || ch == '/') {
                    count++;
                }
            }
        if (count == 7) {
            System.out.println(string + " is a valid URL");
        } else {
            System.out.println(string + " is not a valid URL");
        }
    }

    public static void isVowel(String string) {
        int vowelCount = 0;
        String newString = string.toLowerCase();
        for (int i = 0; i < string.length(); i++) {
            char ch = newString.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println(string + " has " + vowelCount + " vowels in it.");
    }
}











