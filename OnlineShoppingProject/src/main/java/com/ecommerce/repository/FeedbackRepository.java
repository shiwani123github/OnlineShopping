package com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.model.Feedback;

/*
 * @Auther shiwani Dewang
 */
@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

}
