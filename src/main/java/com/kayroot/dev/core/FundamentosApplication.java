package com.kayroot.dev.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kayroot.dev.core.repository.IRepositorio;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {
	
	@Autowired
	IRepositorio repo;

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {		
		repo.conectar();
	    	   
	}

}
