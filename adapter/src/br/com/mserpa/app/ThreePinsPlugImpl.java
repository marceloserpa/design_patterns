package br.com.mserpa.app;


public class ThreePinsPlugImpl implements ThreePinsPlug {

    @Override
    public String plugIn() {
        return "Three pin plug was plugged with success!";
    }

    @Override
    public String plugOut() {
        return "Three pin plug was unplugged with success!";
    }

}
