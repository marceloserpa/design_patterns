package br.com.mserpa.app;

public class CelsiusToFahrenheitStrategy implements ConversionStrategy{

    @Override
    public Double convert(Double degree) {
        return degree * 1.8 + 32;
    }

}
