public class StringPool {
    public static void main(String[] args) {
        // Example 1: String pool concept with string literals
        String str1 = "Hello"; // String literal "Hello" is created in the string pool
        String str2 = "Hello"; // Reuses the existing string from the string pool

        System.out.println("Example 1:");
        System.out.println("str1 == str2: " + (str1 == str2)); // Should print true

        // Example 2: String pool concept with new String objects
        String str3 = new String("Hello"); // Creates a new String object in the heap, not in the string pool
        String str4 = new String("Hello"); // Creates another new String object in the heap

        System.out.println("\nExample 2:");
        System.out.println("str3 == str4: " + (str3 == str4)); // Should print false

        // Example 3: Concatenation and string pool
        String str5 = "Java";
        String str6 = "Script";
        String str7 = "JavaScript"; // Concatenation creates a new string in the pool

        System.out.println("\nExample 3:");
        System.out.println("str5 + str6 == str7: " + (str5 + str6 == str7)); // Should print true
    }
}
