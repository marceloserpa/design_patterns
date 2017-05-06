package com.mserpa.pccomponents.app;


import com.mserpa.pccomponents.app.components.*;

public class Main {

    public static void main(String[] args) {

        Chassis chassis = new Chassis("PC chassis");

        Bus bus = new Bus("MCA Bus");
        bus.add(new Card("16Mbs Token Ring"));
        chassis.add(bus);
        chassis.add(new FloppyDisk("3.5in Floppy"));

        Cabinet cabinet = new Cabinet("PC Cabinet");
        cabinet.add(chassis);

        System.out.println("The net price is " + chassis.netPrice());
    }

}
