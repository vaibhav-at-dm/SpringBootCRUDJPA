package com.VRDubs.demos.Day10SpringBootJPACRUD.repository;

import com.VRDubs.demos.Day10SpringBootJPACRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Double> {
}
