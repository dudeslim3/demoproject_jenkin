package com.example.demo.controller;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Billing;
import com.example.demo.model.Booking;

import com.example.demo.service.BillingService;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BillingController {

	@Autowired
	public BillingService billService;
	
	@CrossOrigin(origins="http://localhost:8080")
	@PostMapping("/handover/{usermailid}")
	@Transactional
	public Billing generateBill(@PathVariable String usermailid )
	{
		
		Booking booking = this.billService.getByCus(usermailid);
		Billing bill = new Billing();
		
	         //Booking booking =this.billService.getByBook(bill.getBookingidbill());
	         bill.setBookingidbill(booking.getBookingid());
	         bill.setCaridbill(booking.getCarbid());
	         bill.setCategoryidbill(booking.getCarcategorybid());
	         bill.setCustomerbname(booking.getCustomerfname());
	         bill.setCustomermobno(booking.getCustomermobno());
	         bill.setHubidbill(booking.getHubbid());
	         bill.setStartdate(LocalDate.now());
	         bill.setUsermail(booking.getUsermailid());
	         billService.saveMyBill(bill);
	         billService.deleteByBookId(booking.getBookingid());
	         return bill;
	}
	
	// get API to get bill by billing ID
	// new obje => PDF and then send this pdf to user via mail
	// vratePDF(bill)->sendEmail()
	
	@CrossOrigin(origins="http://localhost:8080")
	@PostMapping("/getDays/{usermailid}")
	@Transactional
	public Integer test(@PathVariable String usermailid )
	{
		
		Booking booking = this.billService.getByCus(usermailid);
		int noOfDays = LocalDate.now().getDayOfYear() - booking.getBookingDateAndTime().getDayOfYear();
	         return noOfDays;
	}
}
