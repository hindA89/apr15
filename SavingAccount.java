/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.bankmanagementsystem;

/**
 *
 * @author Hindallami
 */
public class SavingAccount extends Account{
    private int yearlyInterest;

public SavingAccount ( int yearlyInterest) {
    this.yearlyInterest = yearlyInterest;
    
}  
    

    public int getYearlyInterest() {
        return yearlyInterest;
    }

    public void setYearlyInterest(int yearlyInterest) {
        this.yearlyInterest = yearlyInterest;
    }

    @Override
    public String toString() {
        return "SavingAccount{" + "yearlyInterest=" + yearlyInterest + '}';
    }

   
    
}
