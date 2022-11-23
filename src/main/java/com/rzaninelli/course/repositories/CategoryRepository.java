package com.rzaninelli.course.repositories;

import com.rzaninelli.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
