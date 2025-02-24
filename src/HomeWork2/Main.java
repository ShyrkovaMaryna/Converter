package HomeWork2;

public class Main {
    private static final double CONV_M = 1.60934;

    public static void main(String[] args) {

        System.out.println("Converter project: Miles to Kilometers and Kilometers to Miles");

        System.out.println("10 miles is " + milesToKilometers(10) + " kilometers.");
        System.out.println("5 kilometers is " + kilometersToMiles(5) + " miles.");
    }

    private static double milesToKilometers(double miles) {
        return miles * CONV_M;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers / CONV_M;
    }
}
