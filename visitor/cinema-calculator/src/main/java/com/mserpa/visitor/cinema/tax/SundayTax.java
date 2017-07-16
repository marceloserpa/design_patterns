package com.mserpa.visitor.cinema.tax;


import com.mserpa.visitor.cinema.ticket.NormalTicket;
import com.mserpa.visitor.cinema.ticket.StudentTicket;
import com.mserpa.visitor.cinema.ticket.ThreeDTicket;

public class SundayTax implements TaxVisitor {

    @Override
    public double visit(NormalTicket normalTicket) {
        return normalTicket.getPrice() * 0.5;
    }

    @Override
    public double visit(ThreeDTicket threeDTicket) {
        return threeDTicket.getPrice() * 0.5;
    }

    @Override
    public double visit(StudentTicket studentTicket) {
        return studentTicket.getPrice() * 0.5;
    }

}
