import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input from two strings
        System.out.print("First String: ");
        String string1 = s.nextLine().trim().toLowerCase();

        System.out.print("Second String: ");
        String string2 = s.nextLine().trim().toLowerCase();

        // Check for the length
        if (string1.length() == string2.length()) {
            // Convert strings to char array
            char[] characterArray1 = string1.toCharArray();
            char[] characterArray2 = string2.toCharArray();

            // Sort the arrays
            Arrays.sort(characterArray1);
            Arrays.sort(characterArray2);

            // Check for equality, if found equal then anagram, else not an anagram
            boolean isAnagram = Arrays.equals(characterArray1, characterArray2);
            System.out.println("Anagram: " + isAnagram);
        } else {
            System.out.println("Not an Anagram: Different lengths");
        }
    }
}
