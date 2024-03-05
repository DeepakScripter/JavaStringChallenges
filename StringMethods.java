import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: length()
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("\nExample 1:");
        System.out.println("Length of the string: " + str.length());

        // Example 2: charAt()
        System.out.print("\nEnter an index to retrieve a character: ");
        int index = scanner.nextInt();
        System.out.println("\nExample 2:");
        if (index >= 0 && index < str.length()) {
            System.out.println("Character at index " + index + ": " + str.charAt(index));
        } else {
            System.out.println("Invalid index.");
        }

        // Example 3: substring()
        System.out.print("\nEnter starting index for substring: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter ending index for substring: ");
        int endIndex = scanner.nextInt();
        System.out.println("\nExample 3:");
        if (startIndex >= 0 && endIndex <= str.length() && startIndex <= endIndex) {
            String substring = str.substring(startIndex, endIndex);
            System.out.println("Substring: " + substring);
        } else {
            System.out.println("Invalid indices.");
        }

        // Example 4: indexOf()
        System.out.print("\nEnter a character to find its first occurrence index: ");
        char searchChar = scanner.next().charAt(0);
        System.out.println("\nExample 4:");
        int indexOfChar = str.indexOf(searchChar);
        if (indexOfChar != -1) {
            System.out.println("First occurrence index of '" + searchChar + "': " + indexOfChar);
        } else {
            System.out.println("'" + searchChar + "' not found in the string.");
        }

        // Example 5: toUpperCase() and toLowerCase()
        System.out.println("\nExample 5:");
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

        // Example 6: replace()
        System.out.print("\nEnter a character to replace: ");
        char oldChar = scanner.next().charAt(0);
        System.out.print("Enter a character to replace with: ");
        char newChar = scanner.next().charAt(0);
        String replacedString = str.replace(oldChar, newChar);
        System.out.println("\nExample 6:");
        System.out.println("String after replacement: " + replacedString);

        // Example 7: startsWith() and endsWith()
        System.out.print("\nEnter a prefix to check if the string starts with it: ");
        String prefix = scanner.next();
        System.out.print("Enter a suffix to check if the string ends with it: ");
        String suffix = scanner.next();
        System.out.println("\nExample 7:");
        System.out.println("Starts with '" + prefix + "': " + str.startsWith(prefix));
        System.out.println("Ends with '" + suffix + "': " + str.endsWith(suffix));

        // Example 1: trim()
        System.out.print("Enter a string with leading and trailing spaces: ");
        // Use nextLine() to consume the newline character left by nextInt()
        scanner.nextLine();
        String strWithSpaces = scanner.nextLine();
        String trimmedString = strWithSpaces.trim();
        System.out.println("\nExample 1:");
        System.out.println("Original string: \"" + strWithSpaces + "\"");
        System.out.println("Trimmed string: \"" + trimmedString + "\"");

        // Example 2: isEmpty()
        System.out.print("\nEnter a string to check if it is empty: ");
        String emptyCheckString = scanner.nextLine();
        System.out.println("\nExample 2:");
        if (emptyCheckString.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            System.out.println("The string is not empty.");
        }

        // Example 3: equals()
        System.out.print("\nEnter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();
        System.out.println("\nExample 3:");
        if (str1.equals(str2)) {
            System.out.println("Using equals(): The strings are equal.");
        } else {
            System.out.println("Using equals(): The strings are not equal.");
        }

        scanner.close();
    }
}
