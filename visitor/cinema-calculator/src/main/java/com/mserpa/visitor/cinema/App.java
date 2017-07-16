package com.mserpa.visitor.cinema;


import com.mserpa.visitor.cinema.tax.SaturdayTax;
import com.mserpa.visitor.cinema.tax.SundayTax;
import com.mserpa.visitor.cinema.tax.TaxVisitor;
import com.mserpa.visitor.cinema.ticket.NormalTicket;
import com.mserpa.visitor.cinema.ticket.StudentTicket;
import com.mserpa.visitor.cinema.ticket.ThreeDTicket;

public class App {

    public static void main(String[] args) {

        NormalTicket normalTicket = new NormalTicket(20D);
        ThreeDTicket threeDTicket = new ThreeDTicket(35.50D);
        StudentTicket studentTicket = new StudentTicket(10.D);

        TaxVisitor saturdayTax = new SaturdayTax();
        System.out.println("Saturday normal ticket price: " + normalTicket.accept(saturdayTax));
        System.out.println("Saturday 3D ticket price: " + threeDTicket.accept(saturdayTax));
        System.out.println("Saturday student ticket price: " + studentTicket.accept(saturdayTax));
        System.out.println("\n");

        TaxVisitor sundayTax = new SundayTax();
        System.out.println("Sunday normal ticket price: " + normalTicket.accept(sundayTax));
        System.out.println("Sunday 3D ticket price: " + threeDTicket.accept(sundayTax));
        System.out.println("Sunday student ticket price: " + studentTicket.accept(sundayTax));
        System.out.println("\n");

    }

}
