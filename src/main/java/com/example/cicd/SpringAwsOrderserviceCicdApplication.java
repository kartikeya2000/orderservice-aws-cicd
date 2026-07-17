package com.example.cicd;

import com.example.cicd.entity.Order;
import com.example.cicd.repository.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/order")
public class SpringAwsOrderserviceCicdApplication {

    @Autowired
    private OrderDao orderDao;

    @GetMapping
    public List<Order> fetchOrders(){
        return orderDao.getOrders();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringAwsOrderserviceCicdApplication.class, args);
    }

}
