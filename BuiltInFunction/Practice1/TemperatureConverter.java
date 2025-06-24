package BuiltInFunction.Practice1;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Convert from (C/F): ");
        char unit = sc.next().charAt(0);
        System.out.print("Enter temperature: ");
        double temp = sc.nextDouble();
        
        if (unit == 'C' || unit == 'c') {
            System.out.println("In Fahrenheit: " + celsiusToFahrenheit(temp));
        } else {
            System.out.println("In Celsius: " + fahrenheitToCelsius(temp));
        }
        sc.close();
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
