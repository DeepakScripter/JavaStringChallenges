import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Reverse the string using the reverseString method
        String reversedString = reverseString(inputString);

        // Display the original and reversed strings
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }

    // Method to reverse a string using a loop
    public static String reverseString(String input) {
        // Check if the input string is null or empty
        if (input == null || input.isEmpty()) {
            return input;
        }

        // Convert the string to a character array
        char[] charArray = input.toCharArray();

        // Use two pointers to reverse the array in-place
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            // Swap characters at the start and end positions
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move the pointers towards the center
            start++;
            end--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
}
