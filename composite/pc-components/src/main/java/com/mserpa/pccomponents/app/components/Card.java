package com.mserpa.pccomponents.app.components;


import com.mserpa.pccomponents.app.interfaces.Equipament;

public class Card extends Equipament {

    public Card(String name) {
        super(name);
    }

    public Long power() {
        return 220L;
    }

    public Long netPrice() {
        return 154L;
    }
}
