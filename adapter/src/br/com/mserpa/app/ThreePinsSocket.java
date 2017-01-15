package br.com.mserpa.app;


public class ThreePinsSocket {

    private ThreePinsPlug plug;

    public ThreePinsSocket(ThreePinsPlug plug) {
        this.plug = plug;
    }

    public void connect(){
        System.out.println(plug.plugIn());
    }

    public void disconnect(){
        System.out.println(plug.plugOut());
    }

}
