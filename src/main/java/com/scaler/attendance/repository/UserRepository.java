package com.scaler.attendance.repository;

import com.scaler.attendance.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

        Optional<User> findByEmailAndPassword(String email, String password);
}
