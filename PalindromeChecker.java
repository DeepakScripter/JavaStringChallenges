import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (isPalindrome(inputString)) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }

        scanner.close();
    }

    // Recursive method to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        // Base case: an empty string or a string with one character is always a
        // palindrome
        if (str.length() <= 1) {
            return true;
        }

        // Compare the first and last characters, and recursively check the substring
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            // If the first and last characters match, check the substring without those
            // characters
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            // If the first and last characters don't match, it's not a palindrome
            return false;
        }
    }
}
