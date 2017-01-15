package br.com.mserpa.app;

public class Main {

    public static void main(String[] args) {

        System.out.println("Using 3-pins plug");
        ThreePinsPlug plug3 = new ThreePinsPlugImpl();
        ThreePinsSocket socket = new ThreePinsSocket(plug3);
        socket.connect();
        socket.disconnect();

        System.out.println("Using 2-pins plug");
        TwoPinsPlug plug2 = new TwoPinsPlug();
        TwoPinsPlugToThreePinsPlugAdapter adapter = new TwoPinsPlugToThreePinsPlugAdapter(plug2);
        ThreePinsSocket socketWithAdaptedPlug = new ThreePinsSocket(adapter);
        socketWithAdaptedPlug.connect();
        socketWithAdaptedPlug.disconnect();

    }
}
