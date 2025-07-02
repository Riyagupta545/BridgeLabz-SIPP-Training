package Workshop;
public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello World";

        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
