public class Day_14 {
    public static String replaceVowels(String sentence, char replacement) {
        if (sentence == null) {
            return null;
        }
        // Create a new StringBuilder to build the result string
        StringBuilder result = new StringBuilder();
        // Iterate through each character in the input sentence
        for (char c : sentence.toCharArray()) {
            // Check if the character is a vowel (both uppercase and lowercase)
            if ("AEIOUaeiou".indexOf(c) != -1) {
                // Replace the vowel with the specified character
                result.append(replacement);
            } else {
                // Append the non-vowel character as is
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        // Example sentence
        String sentence = "The quick brown fox jumps over the lazy dog";
        // Specify the replacement character
        char replacement = '*';
        // Replace all vowels in the sentence
        String modifiedSentence = replaceVowels(sentence, replacement);
        // Print the modified sentence
        System.out.println("The modified sentence is: " + modifiedSentence);
    }
}