package com.terra.repository;

import com.terra.entity.OrderManager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderManager,Integer> {

}
