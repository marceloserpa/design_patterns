package com.mserpa.visitor.cinema.ticket;

import com.mserpa.visitor.cinema.tax.TaxVisitor;


public class StudentTicket implements TicketVisitable {

    private double price;

    public StudentTicket(double price) {
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
