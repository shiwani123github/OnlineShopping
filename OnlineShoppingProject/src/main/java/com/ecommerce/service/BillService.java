package com.ecommerce.service;

import com.ecommerce.model.Bill;

public interface BillService {
	public Bill addBillDetails(Bill bill);

	public Bill getBillDetails(int id);

	public void deleteBillDetails(int id);

	public Bill updateBillDetails(int id, Bill bill);
}
