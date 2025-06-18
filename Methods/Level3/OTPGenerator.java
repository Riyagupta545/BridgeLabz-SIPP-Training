package Methods.Level3;
import java.util.*;

public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static String generateOTP() {
        int otp = 100000 + (int)(Math.random() * 900000); // Ensures 6 digits
        return String.valueOf(otp);
    }

    // Method to generate 10 OTPs and return them in a String array
    public static String[] generateMultipleOTPs(int count) {
        String[] otps = new String[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // Method to check if OTPs are all unique
    public static boolean areOTPsUnique(String[] otps) {
        Set<String> set = new HashSet<>();
        for (String otp : otps) {
            if (!set.add(otp)) {
                return false; // Duplicate found
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] otpArray = generateMultipleOTPs(10);
        System.out.println("Generated OTPs:");
        for (String otp : otpArray) {
            System.out.println(otp);
        }

        if (areOTPsUnique(otpArray)) {
            System.out.println(" All OTPs are unique.");
        } else {
            System.out.println(" Duplicate OTPs found.");
        }
    }
}

