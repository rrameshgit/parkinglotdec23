package com.scaler.parkinglot.model;

public class Bill extends BaseModel{
    private Ticket ticket;
    private int amount ;
    private String exitTime ;
    private String invoiceNumber ;
    private Payment payment;
    private BillStatus billStatus;
}
