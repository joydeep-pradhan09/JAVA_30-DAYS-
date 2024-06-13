public class Day_13 {
    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }
        // Split the sentence into words based on spaces
        String[] words = sentence.split(" ");
        String longestWord = "";
        // Iterate through each word in the array
        for (String word : words) {
            // If the current word is longer than the longestWord, update longestWord
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        // Example sentence
        String sentence = "The quick brown fox jumps over the lazy dog";
        // Find the longest word
        String longestWord = findLongestWord(sentence);
        // Print the longest word
        System.out.println("The longest word is: " + longestWord);
    }
}