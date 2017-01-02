package br.com.mserpa.app;


public class Main {

    public static void main(String[] args) {
        System.out.println("****** Temperature conversion ******");

        ConversionContext conversion = new ConversionContext(new CelsiusToFahrenheitStrategy());
        System.out.println(conversion.convert(32D));

        conversion.changeStrategy(new FahrenheitToCelsiusStrategy());
        System.out.println(conversion.convert(89D));

    }
}
