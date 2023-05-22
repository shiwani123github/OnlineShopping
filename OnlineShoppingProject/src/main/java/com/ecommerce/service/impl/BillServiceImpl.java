package com.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Bill;
import com.ecommerce.repository.BillRepository;
import com.ecommerce.service.BillService;

@Service
public class BillServiceImpl implements BillService {
	@Autowired
	private BillRepository billRepository;

	@Override
	public Bill addBillDetails(Bill bill) {
		Bill bill3 = billRepository.save(bill);
		return bill3;
	}

	@Override
	public Bill getBillDetails(int id) {
		Bill bill = billRepository.findById(id).get();
		return bill;
	}

	@Override
	public void deleteBillDetails(int id) {
		billRepository.deleteById(id);

	}

	@Override
	public Bill updateBillDetails(int id, Bill bill) {
		Bill bill2 = billRepository.findById(id).get();
		bill2.setBillCode(bill.getBillCode());
		bill2.setBillCom(bill.getBillCom());
		bill2.setBillName(bill.getBillName());
		bill2.setBillNum(bill.getBillNum());
		bill2.setMoney(bill.getMoney());
		Bill bills = billRepository.save(bill2);
		return bills;
	}
}
