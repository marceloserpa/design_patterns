package com.mserpa.pccomponents.app.interfaces;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class CompositeEquipament extends Equipament{

    private List<Equipament> equipaments = new LinkedList<>();

    public CompositeEquipament(String name) {
        super(name);
    }

    @Override
    public Long power() {
        Iterator<Equipament> iterator = this.createIterator();
        Long power = 0L;
        while(iterator.hasNext()){
            power += iterator.next().power();
        }
        return power;
    }

    @Override
    public Long netPrice() {
        Iterator<Equipament> iterator = this.createIterator();
        Long netPrice = 0L;
        while(iterator.hasNext()){
            Long childNetPrice = iterator.next().netPrice();
            netPrice += childNetPrice;
        }
        return netPrice;
    }

    public void add(Equipament equipament){
        this.equipaments.add(equipament);
    }

    public void remove(Equipament equipament){
        this.equipaments.remove(equipament);
    }

    Iterator<Equipament> createIterator(){
        return this.equipaments.iterator();
    }


}
