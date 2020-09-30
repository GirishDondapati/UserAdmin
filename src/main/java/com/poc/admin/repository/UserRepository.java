package com.poc.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc.admin.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
