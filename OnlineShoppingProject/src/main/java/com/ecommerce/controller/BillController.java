package com.ecommerce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.Bill;
import com.ecommerce.service.BillService;

/*
 * @Author shiwani Dewang 
 */
@RestController
@RequestMapping("/Bill")
public class BillController {
	private static final Logger logger = LoggerFactory.getLogger(BillController.class);
	@Autowired
	private BillService billService;

	@PostMapping("/addBill")
	public ResponseEntity<Bill> addBill(@RequestBody Bill bill) {
		logger.info("In bill controller class");
		Bill bill3 = billService.addBillDetails(bill);
		return ResponseEntity.ok().body(bill3);
	}

	@GetMapping("/getBill/{bid}")
	public ResponseEntity<Bill> getBill(@PathVariable("bid") int bid) {
		Bill bill = billService.getBillDetails(bid);
		return ResponseEntity.ok().body(bill);
	}

	@DeleteMapping("/deleteBill/{bid}")
	public void deleteBill(@PathVariable("bid") int id) {
		billService.deleteBillDetails(id);
	}

	@PutMapping("/updateBill/{id}")
	public ResponseEntity<Bill> updateBill(@PathVariable("id") int id, @RequestBody Bill bill) {
		Bill bills = billService.updateBillDetails(id, bill);
		return ResponseEntity.ok().body(bills);
	}

}
