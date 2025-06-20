public class UnitConverterAdvanced {

    public static double convertFahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gal) {
        return gal * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println("98 F to Celsius: " + convertFahrenheitToCelsius(98));
        System.out.println("37 C to Fahrenheit: " + convertCelsiusToFahrenheit(37));
        System.out.println("100 pounds to kg: " + convertPoundsToKilograms(100));
        System.out.println("45 kg to pounds: " + convertKilogramsToPounds(45));
        System.out.println("1 gallon to liters: " + convertGallonsToLiters(1));
        System.out.println("3.78 liters to gallons: " + convertLitersToGallons(3.78));
    }
}
