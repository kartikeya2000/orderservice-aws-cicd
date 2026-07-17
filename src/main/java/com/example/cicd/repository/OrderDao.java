package com.example.cicd.repository;

import com.example.cicd.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class OrderDao {

    public List<Order> getOrders(){
        return Stream.of(new Order(101,"Mobile", 1, 30000),
                new Order(101,"Mobile", 1, 30000),
                new Order(102,"Laptop", 6, 60000),
                new Order(103,"PS4", 99, 40000),
                new Order(104,"PS5", 99, 50000),
                new Order(105,"GTA6 PHYSICAL COPY", 9999, 7000),
                new Order(106,"Brush", 56, 30),
                new Order(107,"hdd", 80, 3000),
                new Order(108,"iphone16", 456, 80000)
                ).collect(Collectors.toList());
    }

}
