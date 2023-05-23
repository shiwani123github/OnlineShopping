package com.ecommerce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Feedback;
import com.ecommerce.service.FeedbackService;

/*
 * @Auther Shiwani Dewang
 */
@RestController
@RequestMapping("/User")
public class FeedbackController {
	private static final Logger logger = LoggerFactory.getLogger(FeedbackController.class);
	@Autowired
	private FeedbackService feedbackService;

	@PostMapping("/saveFeedback")
	public Feedback postFeedback(@RequestBody Feedback feedback) {
		logger.info("In feedback controler");
		Feedback feedback1 = feedbackService.postFeedback(feedback);
		return feedback1;

	}

}
