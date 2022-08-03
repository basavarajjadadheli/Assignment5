package com.terra.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.terra.entity.Orderline;

public interface OrderLineRepository extends JpaRepository<Orderline, Integer> {
}
