public class PalindromeChecker {
    public static void main(String[] args) {
        String[] words = {"malik", "sami", "wow", "noon"};
        for (String word : words) {
            System.out.println(word + " is " + (isPalindrome(word) ? "a palindrome" : "not a palindrome"));
        }

    }
    static boolean isPalindrome(String str) {
    return str.equals(new StringBuilder(str).reverse().toString());
    
    }
    
}