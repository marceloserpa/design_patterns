package com.mserpa.visitor.cinema.ticket;


import com.mserpa.visitor.cinema.tax.TaxVisitor;

public interface TicketVisitable {

    double accept(TaxVisitor visitor);

}
