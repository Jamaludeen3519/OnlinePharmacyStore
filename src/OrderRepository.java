package com.cg.onlinepharmacystore.repository;


import com.cg.onlinepharmacystore.entity.Order;
import java.util.Optional;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

}
