package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Feedback;
import com.ecommerce.repository.FeedbackRepository;
import com.ecommerce.service.FeedbackService;
/*
 * @auther shiwani dewang
 */
@Service
public class FeedbackServiceImpl implements FeedbackService {
	@Autowired
	private FeedbackRepository feedbackRepository;

	@Override
	public Feedback postFeedback(Feedback feedback) {
		Feedback feedback1 = feedbackRepository.save(feedback);
		return feedback1;

	}

}
