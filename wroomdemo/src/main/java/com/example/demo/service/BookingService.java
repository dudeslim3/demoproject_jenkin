package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Booking;
import com.example.demo.repository.BookingRepository;



@Service
public class BookingService {

	private BookingRepository bookRepository;
	
	@Autowired
	public BookingService(BookingRepository bookRepository) {
	
		this.bookRepository = bookRepository;
	}
	
	public BookingRepository getBookRepository() {
		return bookRepository;
	}
	public void setBookRepository(BookingRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	
	public Booking getByBookMail(String usermail)
	{
		return bookRepository.getByBookMail(usermail);
	}
	
	public void saveMyBook(Booking book) {
		bookRepository.save(book);
	}
	
}
