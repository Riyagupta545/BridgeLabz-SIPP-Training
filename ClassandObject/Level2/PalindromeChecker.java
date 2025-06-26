package ClassandObject.Level2;
class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String reverse = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reverse);
    }

    void displayResult() {
        if (isPalindrome())
            System.out.println(text + " is a palindrome.");
        else
            System.out.println(text + " is not a palindrome.");
    }

    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker();
        pc.text = "Level";
        pc.displayResult();
    }
}
