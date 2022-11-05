package com.example.springprojectkanat.repo;

import com.example.springprojectkanat.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Long>
{

}
