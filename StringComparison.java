import java.util.Scanner;

public class StringComparison {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example 1: Using equals() method
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        System.out.println("\nExample 1:");
        if (str1.equals(str2)) {
            System.out.println("Using equals(): The strings are equal.");
        } else {
            System.out.println("Using equals(): The strings are not equal.");
        }

        // Example 2: Using equalsIgnoreCase() method
        System.out.print("\nEnter a string for case-insensitive comparison: ");
        String str3 = scanner.nextLine();
        String str4 = "java";

        System.out.println("\nExample 2:");
        if (str3.equalsIgnoreCase(str4)) {
            System.out.println("Using equalsIgnoreCase(): The strings are equal (case-insensitive).");
        } else {
            System.out.println("Using equalsIgnoreCase(): The strings are not equal (case-insensitive).");
        }

        // Example 3: Using compareTo() method
        System.out.print("\nEnter the first string for lexicographical comparison: ");
        String str5 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String str6 = scanner.nextLine();

        System.out.println("\nExample 3:");
        int result = str5.compareTo(str6);
        if (result == 0) {
            System.out.println("Using compareTo(): The strings are equal.");
        } else if (result < 0) {
            System.out.println("Using compareTo(): The first string comes before the second.");
        } else {
            System.out.println("Using compareTo(): The first string comes after the second.");
        }

        scanner.close();
    }
}
