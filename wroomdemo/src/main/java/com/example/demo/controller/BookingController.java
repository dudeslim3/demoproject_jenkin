package com.example.demo.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Booking;

import com.example.demo.service.BookingService;


@org.springframework.web.bind.annotation.RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BookingController {
	@Autowired
	private BookingService bookservice;
	@CrossOrigin(origins="http://localhost:8080")
	@PostMapping("/book")
	@Transactional
	public String registerUser(@RequestBody Booking book)
	{
		bookservice.saveMyBook(book);
		// mail pwd and bking Id
		return "Hello" + book.getCustomerfname() + "your Booking is succesfull";
	}
	@CrossOrigin(origins="http://localhost:8080")
	@PostMapping("/showbook/{usermail}")
	@Transactional
	public Booking viewBook(@PathVariable String usermail) 
	{
		return bookservice.getByBookMail(usermail);
		//return "Hello" + book.getCustomerfname() + "your Booking is succesfull";
	}
}
