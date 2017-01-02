package br.com.mserpa.app;

public class FahrenheitToCelsiusStrategy implements ConversionStrategy{

    @Override
    public Double convert(Double degree) {
        return (degree - 32) / 1.8;
    }

}
