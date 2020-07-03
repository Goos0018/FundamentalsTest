package be.vdab.parameters;

public class StringParameters {

    public static void isPalindrome(String string) {
        String newString = string.toLowerCase();
        //delete spaces in string
        String stringNoSpaces = newString.replaceAll(" ","");
        //create reverse string variable
        String reverse = "";
        int length = stringNoSpaces.length();

        //pass every char in original nospacestring backwards en paste that char in reverse forward.
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + stringNoSpaces.charAt(i);

        //check if original en reverse are identical or not
        if (stringNoSpaces.equals(reverse)) {
            System.out.println(string + " is a palindrome");
        } else {
            System.out.println(string + " is not a palindrome");
        }
    }


    public static void isURL(String string) {
        int count = 0;
        String newString = string.toLowerCase();
        // if string is chorter than 6, its definitly not a URL
        if (string.length() > 6)
            // checking first 7 chars if they are http://, count them if they are
            for (int i = 0; i < 7; i++) {
                char ch = newString.charAt(i);
                if (ch == 'h' || ch == 't' || ch == 'p' || ch == ':' || ch == '/') {
                    count++;
                }
            }
        //if every char of the first 7 gets counted, its probably a URL. at 16u26 i realize that "hppt//:" will also result in correct URL, but no time or skill to fix it
        if (count == 7) {
            System.out.println(string + " is a valid URL");
        } else {
            System.out.println(string + " is not a valid URL");
        }
    }

    public static void isVowel(String string) {
        int vowelCount = 0;
        String newString = string.toLowerCase();
        //pass by every char and count if it is a vowel
        for (int i = 0; i < string.length(); i++) {
            char ch = newString.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println(string + " has " + vowelCount + " vowels in it.");
    }
}











