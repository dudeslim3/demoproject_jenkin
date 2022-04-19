package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Billing;
import com.example.demo.model.Booking;

import com.example.demo.repository.BillingRepository;


@Service
public class BillingService {

	private BillingRepository billRepository;
	
	
	@Autowired
	public BillingService(BillingRepository billRepository) {
		super();
		this.billRepository = billRepository;
	}

	public void saveMyBill(Billing bill) {
		billRepository.save(bill);
	}

	public BillingRepository getBillRepository() {
		return billRepository;
	}



	public void setBillRepository(BillingRepository billRepository) {
		this.billRepository = billRepository;
	}



	public Booking getByCus(String cusmailid)
	{
		return this.billRepository.getByCus(cusmailid);
	}
	public void deleteByBookId(int bookid)
	{
		
		this.billRepository.deleteByBookId(bookid);
	}
}
