package com.terra.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.terra.entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
