package com.ecommerce.repository;

/*
 * @Auther shiwani dewang
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.AddCart;

@Repository
public interface AddCartRepository extends JpaRepository<AddCart, Integer> {

}
