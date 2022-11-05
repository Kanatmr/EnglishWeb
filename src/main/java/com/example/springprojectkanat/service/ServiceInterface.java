package com.example.springprojectkanat.service;

import com.example.springprojectkanat.model.Customers;

import java.util.List;

public interface ServiceInterface {
    List<Customers> getUsers();

    String getLvl(int ball);
}
