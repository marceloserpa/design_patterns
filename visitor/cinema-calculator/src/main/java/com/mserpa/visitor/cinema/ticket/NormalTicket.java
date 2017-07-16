package com.mserpa.visitor.cinema.ticket;

import com.mserpa.visitor.cinema.tax.TaxVisitor;


public class NormalTicket implements TicketVisitable {

    private double price;

    public NormalTicket(double price) {
        this.price = price;
    }

    @Override
    public double accept(TaxVisitor visitor) {
        return visitor.visit(this);
    }

    public double getPrice() {
        return price;
    }

}
