package com.mserpa.visitor.cinema.tax;


import com.mserpa.visitor.cinema.ticket.NormalTicket;
import com.mserpa.visitor.cinema.ticket.StudentTicket;
import com.mserpa.visitor.cinema.ticket.ThreeDTicket;

public interface TaxVisitor {

    double visit(NormalTicket normalTicket);

    double visit(ThreeDTicket threeDTicket);

    double visit(StudentTicket studentTicket);

}
