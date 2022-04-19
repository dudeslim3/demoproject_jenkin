package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Booking;

public interface BookingRepository extends JpaRepository<Booking , Integer>{


	@Query("From Booking Where usermailid=?1")
	public Booking getByBookMail(String usermail);
	
}

