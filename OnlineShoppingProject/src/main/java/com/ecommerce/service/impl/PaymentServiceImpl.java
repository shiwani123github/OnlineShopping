package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Payment;
import com.ecommerce.repository.PaymentRepository;
import com.ecommerce.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public Payment updatePayment(Payment payment) {
		Integer id = payment.getId();
		Payment pay = paymentRepository.findById(id).get();
		pay.setCardNumber(payment.getCardNumber());
		pay.setNameOnCard(payment.getNameOnCard());
		pay.setPmtDate(payment.getPmtDate());
		pay.setAmount(payment.getAmount());
		pay.setPaymentMethod(payment.getPaymentMethod());
		pay.setCvv(payment.getCvv());
		pay.setExMonth(payment.getExMonth());
		pay.setExYear(payment.getExYear());
		Payment payment1 = paymentRepository.save(pay);
		return payment1;
	}

	@Override
	public Payment savePayment(Payment payment) {
		Payment pay = paymentRepository.save(payment);
		return pay;
	}

	@Override
	public void deleteById(Integer id) {
		paymentRepository.deleteById(id);
		
	}

}
