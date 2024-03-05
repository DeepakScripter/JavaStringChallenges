public class StringCreation {
    public static void main(String[] args) {
        // Method 1: Using String Literal
        String str1 = "Hello, World!";

        // Method 2: Using the new Keyword
        String str2 = new String("Hello, World!");

        // Method 3: Using StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(", World!");
        String str3 = stringBuilder.toString();

        // Method 4: Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(", World!");
        String str4 = stringBuffer.toString();

        // Method 5: Converting from Other Data Types
        int number = 42;
        String str5 = String.valueOf(number);

        // Method 6: Using String.format
        String str6 = String.format("The value is %d", 42);

        // Print the results
        System.out.println("Method 1: " + str1);
        System.out.println("Method 2: " + str2);
        System.out.println("Method 3: " + str3);
        System.out.println("Method 4: " + str4);
        System.out.println("Method 5: " + str5);
        System.out.println("Method 6: " + str6);
    }
}
