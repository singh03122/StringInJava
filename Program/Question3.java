public class Question3 {
    public static void main(String[] args) {
        // Input sentence
        String sentence = "Think Twice";

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Loop through each word
        for (String word : words) {
            // Reverse the current word
            String reversedWord = new StringBuilder(word).reverse().toString();
            // Append the reversed word to the result
            result.append(reversedWord).append(" ");
        }

        // Trim the final result to remove the last extra space
        System.out.println("Reversed Sentence: " + result.toString().trim());
    }
}
