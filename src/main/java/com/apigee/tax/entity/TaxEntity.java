package com.apigee.tax.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class TaxEntity {
    private int id;
    private String Name;
    private String aadharNumber;
    private String panNumber;
    private String dob;
    private int income;

    public void setId(int id) {
        this.id = id;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPan(String panNumber) {
        this.panNumber = panNumber;
    }
    public void setIncome(int income) {
       this.income = income;
    }

}

