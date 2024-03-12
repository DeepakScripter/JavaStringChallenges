/**
 * This class demonstrates how to count the occurrences of a substring within a
 * given string.
 */
public class SubstringCount {

    /**
     * The main method of the program.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        String mainString = "abababababab";
        String subString = "ab";

        // Count the occurrences of the substring within the main string
        int count = countSubstrings(mainString, subString);

        System.out.println("Number of occurrences of '" + subString + "': " + count);
    }

    /**
     * Counts the occurrences of a substring within a given string.
     *
     * @param mainString The main string to search within.
     * @param subString  The substring to search for.
     * @return The number of occurrences of the substring within the main string.
     */
    static int countSubstrings(String mainString, String subString) {
        int count = 0;
        int index = mainString.indexOf(subString);

        // Loop through the main string, finding each occurrence of the substring
        while (index != -1) {
            count++;
            index = mainString.indexOf(subString, index + 1); // Move to the next occurrence
        }

        return count;
    }
}
