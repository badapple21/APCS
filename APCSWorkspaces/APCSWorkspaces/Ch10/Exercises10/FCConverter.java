public class FCConverter {
    public static double Fahrenheit;
    public static double Celsius;

    public static void setFahrenheit(double temp) {
        Fahrenheit = temp;
        Celsius = (5.0 / 9.0) * ((double) temp - 32.0);
    }

    public static void setCelsius(double temp) {
        Celsius = temp;
        Fahrenheit = (temp * (9.0 / 5.0)) + 32.0;
    }

    public static double getCelsius() {
        return Celsius;
    }

    public static double getFahrenheit() {
        return Fahrenheit;
    }

}
