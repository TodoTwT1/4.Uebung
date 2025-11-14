package h3;

public class H3_main {
    public static void main(String[] args) {

        float celsiusFloat = 18.6F;
        float fahrenheitFloat = 40.1F;
        double celsiusDouble = 18.6;
        double fahrenheitDouble = 0;

        fahrenheitFloat = celsiusFloat * (9F / 5F) + 32;
        fahrenheitDouble = celsiusDouble * (9.0 / 5.0) + 32;

        System.out.println("Fahrenheit Float:");
        System.out.println(fahrenheitFloat);

        System.out.println("Fahrenheit Double");
        System.out.println(fahrenheitDouble);


    }
}
