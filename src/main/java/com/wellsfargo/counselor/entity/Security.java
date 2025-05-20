package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Security {

    @Id
    @GeneratedValue()
    private  long securityId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private  String category;

    @Column(nullable = false)
    private  String purchase_date;

    @Column(nullable = false)
    private long purchase_price;

    @Column(nullable = false)
    private  long quantity;

    protected  Security(){}

    public Security(String name, String category, String purchase_date, long purchase_price, long quantity){
        this.name=name;
        this.category=category;
        this.purchase_date=purchase_date;
        this.purchase_price=purchase_price;
        this.quantity=quantity;
    }

    public long getSecurityId() {
        return securityId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setPurchase_price(long purchase_price) {
        this.purchase_price = purchase_price;
    }

    public long getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_date(String purchase_date) {
        this.purchase_date = purchase_date;
    }

    public String getPurchase_date() {
        return purchase_date;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getQuantity() {
        return quantity;
    }
}
