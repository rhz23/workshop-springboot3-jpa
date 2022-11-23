package com.rzaninelli.course.repositories;

import com.rzaninelli.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
