package com.BankingSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BankingSystem.Entities.Transaction;

public interface TransectionRepository extends JpaRepository<Transaction, Integer> {

}
