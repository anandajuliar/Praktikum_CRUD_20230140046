package com.deploy.praktikum1.util;

import com.deploy.praktikum1.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ValidationUtil extends JpaRepository<User, String> {
}

