package Strings.Level1;
public class NullPointerExample {
    
    // Method to generate and throw NullPointerException
    public static void generateException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }

    // Method that handles the exception using try-catch
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Handling NullPointerException...");
        handleException(); 
    }
}
