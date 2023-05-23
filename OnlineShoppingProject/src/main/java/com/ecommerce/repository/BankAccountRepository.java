package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.BankAccount;

/*
 * @ATher Balraj Naik
 */
@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {

}
