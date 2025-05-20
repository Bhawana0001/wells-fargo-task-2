package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


public class Portfolio {

   @Id
   @GeneratedValue()
   private long portfolioId;

   public long getPortfolioId() {return portfolioId;}

   protected Portfolio(){

   }
}
