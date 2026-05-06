package com.dipu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipu.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
