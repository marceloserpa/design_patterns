package br.com.mserpa.app;

public class ConversionContext {

    private ConversionStrategy conversionStrategy;

    public ConversionContext(ConversionStrategy conversionStrategy) {
        this.conversionStrategy = conversionStrategy;
    }

    public void changeStrategy(ConversionStrategy conversionStrategy){
        this.conversionStrategy = conversionStrategy;
    }

    public String convert(Double degree){
        return format(degree, conversionStrategy.convert(degree));
    }

    private String format(Double degree, Double degreeConverted) {
        return String.format("%.2f to %.2f", degree, degreeConverted);
    }

}
