public class Question2 {

    public static void main(String[] args) {
        String str = "PWSKILLS";

        // Convert the string to a character array
        char[] charArray = str.toCharArray();

        // Reverse the characters
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        // Convert the char array back to a string and print it
        System.out.println("Reversed String: " + new String(charArray));
    }
}
