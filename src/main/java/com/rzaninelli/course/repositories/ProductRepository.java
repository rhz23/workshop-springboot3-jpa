package com.rzaninelli.course.repositories;

import com.rzaninelli.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
