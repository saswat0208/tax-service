package com.apigee.tax.apater;


import com.apigee.tax.entity.TaxEntity;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TaxAdapter {

    public TaxEntity taxEntity;

    @PostConstruct
    void initialize()
    {
        taxEntity = new TaxEntity();
        taxEntity.setAadharNumber("Sas1234");
        taxEntity.setDob("02/10/1995");
        taxEntity.setId(122254);
        taxEntity.setName("SaswatSingh");
        taxEntity.setPan("PSPS1234");
        taxEntity.setIncome(150000);
    }


    public TaxEntity findAll() {
        return taxEntity;
    }
}
