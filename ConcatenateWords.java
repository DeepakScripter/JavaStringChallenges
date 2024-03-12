public class ConcatenateWords {

    public static void main(String[] args) {
        String[] wordsArray = { "Hello", " ", "World", "!", " ", "Concatenate", " ", "Me" };

        // Using StringBuilder to concatenate the words
        StringBuilder resultStringBuilder = new StringBuilder();

        for (String word : wordsArray) {
            resultStringBuilder.append(word);
        }

        // Convert StringBuilder to a String
        String concatenatedString = resultStringBuilder.toString();

        System.out.println("Concatenated String: " + concatenatedString);
    }
}
