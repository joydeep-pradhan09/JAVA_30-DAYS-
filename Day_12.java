public class Day_12 {
    public static void main(String[] args) {
        String s = "level";
        int ln = s.length();
        char str[] = new char[ln]; // Array to store string
        char rev_str[] = new char[ln]; // Array to store reverse
        for(int i = 0; i < ln; i++) {
            str[i] = s.charAt(i);
            rev_str[i] = s.charAt(ln - 1 - i);
        }
        boolean isPalindrome = true;
        for(int i = 0; i < ln; i++) {
            if(str[i] != rev_str[i]) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}