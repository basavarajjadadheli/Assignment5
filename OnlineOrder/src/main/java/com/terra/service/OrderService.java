package com.terra.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.terra.entity.OrderManager;
import com.terra.repository.OrderRepository;

import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public OrderManager createOrder(OrderManager orderManager) {
        return orderRepository.save(orderManager);
    }

    public Optional<OrderManager> getOrderById(int id) {
      return orderRepository.findById(id);
    }
}
