package com.apigee.tax.controller;

import com.apigee.tax.apater.TaxAdapter;
import com.apigee.tax.entity.TaxEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@CrossOrigin
@RestController
@RequestMapping("v1/tax")

public class TaxController {

    @Autowired
    private TaxAdapter taxAdapter;

    @GetMapping(value = "/gettaxdata")
    public ResponseEntity<TaxEntity> getTax(){
        return new ResponseEntity<>(taxAdapter.findAll(), HttpStatus.OK);
    }
}
