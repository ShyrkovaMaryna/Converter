package HomeWork3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter Application: Fahrenheit to Celsius and Celsius to Fahrenheit.");
        System.out.println("100°F to Celsius: " + convertFahrenheitToCelsius(100));
        System.out.println("37°C to Fahrenheit: " + convertCelsiusToFahrenheit(37));
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
