package com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Feedback;
import com.ecommerce.service.FeedbackService;

@RestController
@RequestMapping("/User")
public class FeedbackController {
	@Autowired
	private FeedbackService feedbackService;

	@PostMapping("/saveFeedback")
	public Feedback postFeedback(@RequestBody Feedback feedback) {
		Feedback feedback1 = feedbackService.postFeedback(feedback);
		return feedback1;

	}

}
