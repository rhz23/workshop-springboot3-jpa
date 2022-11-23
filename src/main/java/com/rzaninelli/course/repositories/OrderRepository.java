package com.rzaninelli.course.repositories;

import com.rzaninelli.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
