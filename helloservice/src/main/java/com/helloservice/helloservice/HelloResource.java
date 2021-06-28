package com.helloservice.helloservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.helloservice.repository.BookRepository;

@RestController
@RequestMapping(value="/rest/hello/server")

public class HelloResource {
	
	@Autowired
	BookRepository book;
	
	@GetMapping
	public String hello() {
	
		System.out.println(book.findAll());
		return "hello server I am testing";
	}

}
