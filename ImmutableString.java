public class ImmutableString {
    public static void main(String[] args) {
        // Example of Immutability
        String originalString = "Hello";
        System.out.println("Original String: " + originalString);

        // Concatenation creates a new string
        String concatenatedString = originalString + ", World!";
        System.out.println("Concatenated String: " + concatenatedString);

        // Original string remains unchanged
        System.out.println("Original String after Concatenation: " + originalString);

        // Substring creates a new string
        String substring = originalString.substring(0, 2);
        System.out.println("Substring: " + substring);

        // Original string remains unchanged
        System.out.println("Original String after Substring: " + originalString);
    }
}
