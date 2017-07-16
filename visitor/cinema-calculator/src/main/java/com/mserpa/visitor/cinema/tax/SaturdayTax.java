package com.mserpa.visitor.cinema.tax;


import com.mserpa.visitor.cinema.ticket.NormalTicket;
import com.mserpa.visitor.cinema.ticket.StudentTicket;
import com.mserpa.visitor.cinema.ticket.ThreeDTicket;

public class SaturdayTax implements TaxVisitor {

    @Override
    public double visit(NormalTicket normalTicket) {
        return normalTicket.getPrice() * 1.2;
    }

    @Override
    public double visit(ThreeDTicket threeDTicket) {
        return threeDTicket.getPrice() * 1;
    }

    @Override
    public double visit(StudentTicket studentTicket) {
        return studentTicket.getPrice() * 0.9;
    }

}
