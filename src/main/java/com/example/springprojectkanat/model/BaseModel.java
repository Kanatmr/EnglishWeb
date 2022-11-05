package com.example.springprojectkanat.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
@EnableAutoConfiguration
public class BaseModel {

    @Id
    @GeneratedValue
    private Long id;
}
