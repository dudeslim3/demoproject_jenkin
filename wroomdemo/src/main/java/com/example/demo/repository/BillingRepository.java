package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Billing;
import com.example.demo.model.Booking;


public interface BillingRepository extends JpaRepository<Billing,Integer> {

	@Query("From Booking Where usermailid=?1")
	public Booking getByCus(String cusmailid);
	
	@Modifying
	@Query("Delete from Booking where bookingid=?1")
	public void deleteByBookId(int bookid);
	
}
