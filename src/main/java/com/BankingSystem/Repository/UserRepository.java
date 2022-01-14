package com.BankingSystem.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankingSystem.Entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByaccountNumber(String actNum);

}
