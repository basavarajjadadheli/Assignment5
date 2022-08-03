package com.terra.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.terra.entity.OrderManager;
import com.terra.service.OrderService;

import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/orderManager")
    public OrderManager createOrder(@RequestBody OrderManager orderManager) {
        return orderService.createOrder(orderManager);
    }

    @GetMapping("/orderManager/{id}")
    public Optional<OrderManager> getOrderById(@PathVariable int id){
        return orderService.getOrderById(id);
    }

}
