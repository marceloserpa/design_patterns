package br.com.mserpa.app;

public class TwoPinsPlugToThreePinsPlugAdapter implements ThreePinsPlug {

    private TwoPinsPlug twoPinsPlug;

    public TwoPinsPlugToThreePinsPlugAdapter(TwoPinsPlug twoPinsPlug) {
        this.twoPinsPlug = twoPinsPlug;
    }

    @Override
    public String plugIn() {
        return convert(twoPinsPlug.plugIn());
    }

    @Override
    public String plugOut() {
        return convert(twoPinsPlug.plugOut());
    }

    private String convert(String plugMessage){
        return String.format("adapted to 3-pins plug (%s)", twoPinsPlug.plugIn());
    }

}
