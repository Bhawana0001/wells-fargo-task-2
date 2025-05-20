package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable = false)
    private  String name;

    @Column(nullable = false)
    private  String phone;

    @Column(nullable = false)
    private String email;

    protected Client(){

    }

    public Client(String name, String phone, String email){
        this.name=name;
        this.phone=phone;
        this.email=email;
    }

    public long getClientId() { return  clientId; }

    public void  setPhone(String phone) { this.phone= phone; }

    public String getPhone() { return  phone;}

    public void  setEmail(String email) {this.email= email; }

    public String getEmail() {return  email; }

    public void  setName(String name) {this.name= name; }

    public String getName() {return  name; }
}

