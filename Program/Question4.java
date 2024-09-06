import java.util.Arrays;

public class Question4 {

    public static void main(String[] args) {
        // Input string
        String str = "PWSKILLS";

        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Convert the sorted character array back to a string
        String sortedStr = new String(charArray);

        // Print the sorted string
        System.out.println("Sorted String: " + sortedStr);
    }
}
