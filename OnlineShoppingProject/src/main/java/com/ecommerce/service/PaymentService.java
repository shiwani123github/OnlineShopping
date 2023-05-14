package com.ecommerce.service;

import com.ecommerce.model.Payment;

public interface PaymentService {
	public Payment savePayment(Payment payment);
	public Payment updatePayment(Payment payment);
	public void deleteById(Integer id);

}
