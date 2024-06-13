public class Day_11 {
    public static void main(String[] args) {
        String s = "javaProgramming";
        int[] charCount = new int[256]; // Array to store count of characters

        // Count each character in the string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charCount[c]++;
        }

        // Print the characters and their counts
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
    }
}