package com.example.springprojectkanat.service;

import com.example.springprojectkanat.Levels.Context;
import com.example.springprojectkanat.Levels.Course;
import com.example.springprojectkanat.model.Customers;
import com.example.springprojectkanat.repo.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MainService implements ServiceInterface{

CustomerRepository repository;
    @Override
    public List<Customers> getUsers() {
        return  repository.findAll();
    }

    @Override
    public String getLvl(int ball) {


        Context context = new Context(ball);
        Course course = context.contextGiveRecommend();



        return  course.recommendCourse();

    }

}
