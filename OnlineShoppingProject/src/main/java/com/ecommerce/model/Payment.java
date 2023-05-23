package com.ecommerce.model;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String cardNumber;
	private String nameOnCard;
	private LocalDate pmtDate;
	private int amount;
	private String paymentMethod;
	private int cvv;
	private int exMonth;
	private int exYear;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public LocalDate getPmtDate() {
		return pmtDate;
	}

	public void setPmtDate(LocalDate pmtDate) {
		this.pmtDate = pmtDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getExMonth() {
		return exMonth;
	}

	public void setExMonth(int exMonth) {
		this.exMonth = exMonth;
	}

	public int getExYear() {
		return exYear;
	}

	public void setExYear(int exYear) {
		this.exYear = exYear;
	}

}
